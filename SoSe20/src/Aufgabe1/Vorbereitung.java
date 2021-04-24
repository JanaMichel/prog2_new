package Aufgabe1;

import javax.swing.JOptionPane;

public class Vorbereitung {

	/**
	 * Spieler festlegen
	 * Siegpunkte festlegen
	 * Namen eingeben
	 * Spielen
	 * Main-Methode befüllen
	 */
	
	public static int Siegpunkte;
	private Wuerfelspiel [] spieler;
	
	public Vorbereitung()
	{
		anzSpieler();
		anzSieg();
		nameDesSpielers();
		
	}
	
	public void anzSpieler()
	{
		int anzSpieler = 0;
		boolean eingabe = false; //prüft ob eine Zahl eingegeben wurde
		while(eingabe==false)
		{
			try
			{
				String spieler = JOptionPane.showInputDialog(null, "Spieleranzahl:", "Anzahl Spieler", JOptionPane.PLAIN_MESSAGE); //Optische Anzeige
				anzSpieler = Integer.parseInt(spieler); //übernimmt die vom Spieler eingegebene Zahl als Intwert für die Spieleranzahl
				eingabe = true;
			}
			catch(NumberFormatException e) //wenn keine Zahl eingegeben, fange die warnung ab
			{
				JOptionPane.showMessageDialog(null, "Die Eingabe muss eine Zahl sein ");
				eingabe = false;
			}
		}
		spieler = new Wuerfelspiel[anzSpieler];
	}
	
	public void anzSieg()
	{
		boolean eingabe = false;
		while(eingabe)
		{
			try
			{
				String punkte = JOptionPane.showInputDialog(null, "Spielerpunkte:", "Punkte zum Sieg:", JOptionPane.PLAIN_MESSAGE);
				Siegpunkte = Integer.parseInt(punkte);
				eingabe = true;
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Die Eingabe muss eine Zahl sein");
				eingabe = false;
			}
		}
	}
	
	public void nameDesSpielers()
	{
		String name = "";
		for(int i=0; i<this.spieler.length; i++)
		{
			name = JOptionPane.showInputDialog("Name des Spielers " + (i+1)+" :");
			this.spieler[i] = new Wuerfelspiel(name);
		}
	}
	
	public void spielen()
	{
		int index = 0;
		boolean gewonnen = false;
		while(!gewonnen)
		{
			gewonnen = spieler[index].wuerfeln();
			index = (index<spieler.length-1) ? index+1 : 0;
		}
	}
	
	public static void main(String[] args) 
	{
		Vorbereitung a1 = new Vorbereitung();
		a1.spielen();

	}

}
