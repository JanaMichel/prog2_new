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
			case 43 : System.out.print("+"); break;
			case 45 : System.out.print("-"); break;
			case 46 : System.out.print("."); break;
			case 48 : System.out.print("0"); break;
			case 49 : System.out.print("1"); break;
			case 50 : System.out.print("2"); break;
			case 51 : System.out.print("3"); break;
			case 52 : System.out.print("4"); break;
			case 53 : System.out.print("5"); break;
			case 54 : System.out.print("6"); break;
			case 55: System.out.print("7"); break;
			case 56: System.out.print("8"); break;
			case 57: System.out.print("9"); break;
			default: System.out.print("Keine Zahl");
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
	
	public static boolean charAtIndex(String message)
	{
		for (int i = 0; i < message.length(); i++) 
		{
			int b = message.charAt(i);
			if(b >=48 && b <= 57 || b == 45 || b == 46 || b == 43)
			{
				return true;
			}
		}
		return false;
	}
	
	public static int charAtIndexValue(String message)
	{
		int zahl = 0;
		for (int i = 0; i < message.length(); i++) 
		{
			int b = message.charAt(i);
			char d = (char) b;
			if(b >=48 && b <= 57 || b == 45 || b == 46 || b == 43)
			{
				
			}
		}
		return zahl;
	}
	
	public static int inputInt(int min, int max, String message)
    {
        boolean eingabeOk = false;
        int zahl = 0;
        // String message = "Geben Sie eine Zahl ein : ";
        while(!eingabeOk)
        {
            String eingabe1 = JOptionPane.showInputDialog(message);
            if(charAtIndex(eingabe1)==true);
            {
            	try 
            	{
            		zahl = charAtIndexValue(eingabe1);            		
            		eingabeOk = true;
            	}
             
            	catch (NumberFormatException e) 
            	{
            		message = "Eingabe war keine Zahl! Bitte Zahl eingeben";
            	}
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
	
	public static String valueOf(int value)
	{
		String message = "";
		return message;
	}
}
