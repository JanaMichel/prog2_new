package Aufgabe1;

import javax.swing.JOptionPane;

public class Meldung 
{
	public static void main(String [] bla)
	{
		//Aufruf der statischen Methode showConfirmDialog()
		int eingabe = JOptionPane.showConfirmDialog(null, "Geben Sie Ihr Einverst�ndnis?", "Einverst�ndnis", JOptionPane.YES_NO_CANCEL_OPTION);
		
	System.out.println(eingabe);
	System.exit(0);
	}
}
