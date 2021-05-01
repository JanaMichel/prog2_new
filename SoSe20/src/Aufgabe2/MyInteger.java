package Aufgabe2;

import javax.swing.JOptionPane;

public class MyInteger 
{
	private int value;
	static int MAX_VALUE = Integer.MAX_VALUE;
	static int MIN_VALUE = Integer.MIN_VALUE;
	
	public static void printZahl(int zahl)
	{
		switch(zahl)
		{
			case 48 : System.out.println("0"); break;
			case 49 : System.out.println("1"); break;
			case 50 : System.out.println("2"); break;
			case 51 : System.out.println("3"); break;
			case 52 : System.out.println("4"); break;
			case 53 : System.out.println("5"); break;
			case 54 : System.out.println("6"); break;
			case 55: System.out.println("7"); break;
			case 56: System.out.println("8"); break;
			case 57: System.out.println("9"); break;
			default: System.out.println("Keine Zahl");
		}
	}
	
	//Konstruktoren
	
	public MyInteger(int value)
	{
		this.value = value;
	}
		
	public MyInteger(String s) throws IllegalArgumentException
	{
		this.value = Integer.parseInt(s);
	}
	
	public static boolean chatAtIndex(String message)
	{
		for (int i = 0; i < message.length(); i++) 
		{
			int b = message.charAt(i);
			if(b >=48 && b <=57)
			{
				printZahl(b);
				return true;
			}
		}
		return false;
	}
	
	public static int inputInt(int min, int max, String message)
    {
        boolean eingabeOk = false;
        int zahl = 0;
     
        // String message = "Geben Sie eine Zahl ein : ";
        while(!eingabeOk)
        {
            String eingabe1 = JOptionPane.showInputDialog(message);
            for (int i = 0; i < eingabe1.length(); i++) {
				
			}
            try {
                zahl = Integer.valueOf(eingabe1);
                if(zahl>=min && zahl<=max)
                {
                    eingabeOk = true;
                }
                else
                {
                    message = "Zahl muss zwischen " + min + " und " + max + " liegen!";
                }
            } 
            catch (NumberFormatException e) 
            {
                message = "Eingabe war keine Zahl! Bitte Zahl eingeben";
            }
        }
        return zahl;
    }

    public static int inputInt(String message)
    {
        return inputInt(Integer.MIN_VALUE,Integer.MAX_VALUE, message);
    }
	
	//Objektmethode
	
	public int intValue()
	{
		return this.value;
	}
	
	public double doubleValue()
	{
		double zahl = this.value;
		return zahl;
	}
	
	/*public static int valueOf(int value)
	{
		int a1 = value;
		int test = a1.MyInteger();
		return test;
	}*/
	
	/*public static string valueOf(int value)
	{
		return new MyInteger(value);
	}*/
}
