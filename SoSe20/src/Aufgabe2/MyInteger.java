package Aufgabe2;

import javax.swing.JOptionPane;

public class MyInteger 
{
	public static int MAX_VALUE;
	public static int MIN_VALUE;
	private int value;
	
	public static int parseInt(String s)
	{
		boolean eingabeOk = false;
		int zahl = 0;
		while(!eingabeOk)
		{
			try
			{
				zahl = Integer.parseInt(s);
				eingabeOk = true;
				return zahl;
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Die Eingabe muss eine Zahl sein:");
				eingabeOk = false;
			}
		}
		return zahl;
	}
	
	//Konstruktoren
	
	public MyInteger(int value)
	{
		this.value = value;
	}
	
	public MyInteger(String s)
	{
		try
		{
			this.value = Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "Die Eingabe muss eine Zahl sein:");
		}
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
