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
		Object[] options = {"FIW", "AI", "IMI", "WI", "Alle"};
			
			int selected = JOptionPane.showOptionDialog(null, "Bester Studiengang?", "Auswahl", 
					JOptionPane.DEFAULT_OPTION, 
					JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
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
				System.out.println("IMI");
			}
			if(selected==3)
			{
				System.out.println("WI");
				
			}
			else
			{
				System.out.println("alle");
				
			}
		
		System.exit(0);
				
		
	}
}
