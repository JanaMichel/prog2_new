package Aufgabe1;

import java.util.Random;

import javax.swing.JOptionPane;

public class Wuerfelspiel
	{
		private String name;
		private int aktStand;

		Wuerfelspiel(String name)
		{
			aktStand=0;
			this.name = name;
		}
	
		public boolean wuerfeln()
		{
			System.out.printf("%n%nSpieler %s ist an der Reihe (bisher %d Punkte) %n ----------------------------------------- %n" , 
					this.name, this.aktStand);
			int wurf = 0;
			int VersuchPunkte = 0;
			Random r = new Random();
			boolean ende = false;
			while(!ende)
			{
				int wuerfeln = r.nextInt(6)+1; //alle Zahlen von 1-6 werden gew�rfelt
				if(wuerfeln==6) //versuch zur�ckgesetzt
				{
					aktStand =0;
					System.out.printf("Versuch zu Ende %n Aktueller Spielstand von %s : "
							+ "%d Punkte %n Der naechste Spieler ist dran%n", this.name, this.aktStand);
					ende = true;
				}
				if(this.aktStand+wurf+VersuchPunkte >= Vorbereitung.Siegpunkte) //Spieler hat gewonnen
				{
					System.out.printf("%s hat insgesamt %d Punkte und somit gewonnen !!!", this.name, 
							(aktStand+VersuchPunkte+wurf));
					return true;
				}
				else //Zahl zwischen 1 und 5 gew�rfelt
				{
					VersuchPunkte+=wurf; //addiere den Wurf zu den VersuchsPunkten
					System.out.printf("%s hat insgesamt %d Punkte", this.name, (aktStand+VersuchPunkte+wurf)); //Ausgabe der Konsole
					int button = JOptionPane.showConfirmDialog(null, "Wollen Sie weiterw�rfeln?", //weiter w�rfel frage
							"Weiter Spielen?", JOptionPane.YES_NO_OPTION);
					ende = (button==JOptionPane.NO_OPTION); //wenn nein gedr�ckt, dann hier true, versuch beendet
					if(ende) //wenn nein gedr�ckt, dann addiere hier punkte
					{
						aktStand+=VersuchPunkte;
					}				
				}
			}
			return false;
		}
		
	}

