package Aufgabe1;

import javax.swing.JOptionPane;

public class Meldung 
{
	public static void main(String [] bla)
	{
		//Aufruf der statischen Methode showConfirmDialog()
		int button = JOptionPane.showConfirmDialog(null, "Geben Sie Ihr Einverst�ndnis?", "Einverst�ndnis", JOptionPane.YES_NO_CANCEL_OPTION);
		
		System.out.println(button);
		
		
		//Aufruf der statischen Methode showInputDialog()
		String eingabe = JOptionPane.showInputDialog(null, "Geben Sie Ihren Namen ein", "Eine Eingabeaufforderung", JOptionPane.PLAIN_MESSAGE);
		System.out.println(eingabe);
		
		//Aufruf der statischen Methode showMessageDialog()
		JOptionPane.showMessageDialog(null, "Haben Sie noch einen sch�nen Tag", "Abschied", JOptionPane.WARNING_MESSAGE);
		
		//Aufruf der statischen showOptionDialog()
		Object[] options = {"FIW", "AI", "IMI", "WI", "Alle"};
			
			int selected = JOptionPane.showOptionDialog(null, "Bester Studiengang?","Auswahl",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.WARNING_MESSAGE, null, 
			new String[]{"FIW", "AI", "WIKO"}, "A");			
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
				System.out.println("WIKO");
			}
			
		
		System.exit(0);
				
		
	}
}
