package Aufgabe2;

import javax.swing.JOptionPane;

public class MyInteger 
{
	private int value;
	static int MAX_VALUE = Integer.MAX_VALUE; //2147483647
	static int MIN_VALUE = Integer.MIN_VALUE; //-2147483648
	
	
	//Konstruktoren
	
	public MyInteger(int value)
	{
		this.value = value;
	}
		
	public MyInteger(String s) throws IllegalArgumentException
	{
		this.value = parseInt(s);
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
			if(b >=48 && b <= 57 || b == 45 || b == 46 || b == 43)
			{
				zahl = b;
			}
		}
		return zahl;
	}
	
	public static int parseInt(String message)
    {
        boolean eingabeOk = false;
        int zahl = 0;
        if(message.length()==0) throw new IllegalArgumentException("leere Eingabe");
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

	
	//Objektmethode
	
	public int intValue()
	{
		return this.value;
	}
	
	public double doubleValue()
	{
		return this.value;
	}
	
	public static MyInteger valueOf(String s) throws IllegalArgumentException
	{
		return new MyInteger(s);
	}
	
	public static MyInteger valueOf(int value)
	{	
		return new MyInteger(value);
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(other == null) return false;
		if(this == other) return true; 
		if(this.getClass() != other.getClass())	return false; 	

		MyInteger otherInt = (MyInteger)other; 	
		return (this.value == otherInt.value); 
	}
	
	@Override
	public int hashCode()
	{
		return this.value;
	}
	
	@Override
	public String toString() 
	{
		return "MyInteger [value=" + value + "]";
	}

}
