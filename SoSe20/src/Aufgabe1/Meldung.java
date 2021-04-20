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
		System.exit(0);
				
		
	}
}
