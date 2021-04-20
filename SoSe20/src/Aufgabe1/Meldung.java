package Aufgabe1;

import javax.swing.JOptionPane;

public class Meldung 
{
	public static void main(String [] bla)
	{
		//Aufruf der statischen Methode showConfirmDialog()
		int button = JOptionPane.showConfirmDialog(null, "Geben Sie Ihr Einverständnis?", "Einverständnis", JOptionPane.YES_NO_CANCEL_OPTION);
		
		System.out.println(button);
		
		
		//Aufruf der statischen Methode showInputDialog()
		String eingabe = JOptionPane.showInputDialog(null, "Geben Sie Ihren Namen ein", "Eine Eingabeaufforderung", JOptionPane.PLAIN_MESSAGE);
		System.out.println(eingabe);
		
		//Aufruf der statischen Methode showMessageDialog()
		JOptionPane.showMessageDialog(null, "Haben Sie noch einen schönen Tag", "Abschied", JOptionPane.WARNING_MESSAGE);
		
		//Aufruf der statischen showOptionDialog()
		int selected = JOptionPane.showOptionDialog(null, "Bester Studiengang?","Auswahl",
		JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.WARNING_MESSAGE, null, 
		
		new String[]{"FIW", "AI", "beide"}, "A");			
			if(selected==0)
			{
				System.out.println("FIW");
			}
			if(selected==1)
			{
				System.out.println("AI");
			}
			if(selected==2)
			{
				System.out.println("beide");
			}
			
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
