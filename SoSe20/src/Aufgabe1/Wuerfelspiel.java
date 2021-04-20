package Aufgabe1;

import javax.swing.JOptionPane;

public class Wuerfelspiel
	{
		public static void main(String [] bla)
		{
			//Eingabe des Namen, ShowOptionDialog
			String name = JOptionPane.showInputDialog(null, "Geben Sie Ihren Namen ein", "Spielereingabe", JOptionPane.PLAIN_MESSAGE);
			int option = JOptionPane.showConfirmDialog(null, name + ", wollen Sie weiter würfeln?", "Weiter würfeln?", JOptionPane.YES_NO_OPTION);
			if(option==0)
			{
				System.out.println(name + " ist am Zug");
			}
			if(option==1)
			{
				System.out.println("Das Spiel ist beendet");
			}
			
			System.exit(0);		
		}
	}

