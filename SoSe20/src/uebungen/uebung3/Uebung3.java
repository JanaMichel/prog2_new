package uebungen.uebung3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Uebung3 {

	
	
	//Eingabe zahl1 - ist zahl?
	
	//catch keine zahl
	
	//Eingabe zahl2 - ist zahl? ist 0 ?
	//catch division durch null
	//catch keine zahl
	Uebung3()
	{
		int zahl1 = 0;
		int zahl2 = 0;
		boolean inputOk = false;
		String input = "";
		String promt1 = "Zahl1";
		String promt2 = "Zahl2";
	
		while(!inputOk)
		{
			try
			{
				input = JOptionPane.showInputDialog(promt1);
				inputOk = true;
				zahl1 = Integer.parseInt(input);
			}
			catch(NumberFormatException e)
			{
				promt1 = "Die Eingabe muss eine Zahl sein:";
				inputOk = false;
			}
		}
		
		
		while(!inputOk)
		{
			try
			{
				input = JOptionPane.showInputDialog(promt1);
				inputOk = true;
				zahl2= Integer.parseInt(input);
				JOptionPane.showMessageDialog(null,  "Das Ergebnis ist " + zahl1/zahl2, "Ergebnis", JOptionPane.PLAIN_MESSAGE);
			}
			catch(NumberFormatException e)
			{
				promt2 = "Die Eingabe muss eine Zahl sein:";
				inputOk = false;
			}
			catch(ArithmeticException e)
			{
				promt2 = "Die Eingabe darf keine 0 sein:";
				inputOk = false;
			}
		}
		
	}
	
	public int inputInt(int min, int max)
	{
		int zahl = 0;
		boolean inputOk = false;
		String input = "";
		String promt1 = "Zahl zwischen" + min + "und" + max + ":";
		while(!inputOk)
		{
			try
			{
				input = JOptionPane.showInputDialog(promt1);
				zahl = Integer.parseInt(input);
				if(zahl >= min && zahl <= max)
				{
					inputOk = true;
					return(zahl);
				}
				else
				{
					promt1 = "Die Zahl muss zwischen" + min + "und" + max + "sein";
					inputOk = false;
				}
			}
			catch(NumberFormatException e)
			{
				promt1 = "Die Eingabe muss eine Zahl sein. Bitte geben Sie eine Zahl zwischen" + min + "und" + "max" + "sein";
				inputOk = false;
			}
		}
		
		//muss zahl sein
		//muss zwischen min und max sein
		return zahl;
	}
	
	public static int inputInt()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Geben Sie hier eine Zahl ein: ");
		int zahl = scan.nextInt();
		return zahl;
	}
	
	public static void printUmrechnungSek()
	{
		int sekunden = inputInt();
		int tage = sekunden/(24*60*60);
		int stunden = sekunden/(60*60) - (tage*24);
		int minuten = sekunden/(60) - (tage*24*60) - (stunden*60);
		int sek = sekunden - (tage*24*60*60) - (stunden*60*60) - (minuten*60);
		
		//Sekunden einlesen
		
		String s = sekunden + "Sekunden sind: ";
		if(tage>1)
		{
			s+= tage + "Tage, ";
		}
		if(stunden>1)
		{
			s+= stunden + "Stunden, ";
		}
		if(minuten>1)
		{
			s+= minuten + "Minuten, ";
		}
		if(sek>1)
		{
			s+= tage + "Tage, ";
		}
		System.out.println(s);
	
		//testen zahl ok?
		//wie viele tage
		//sekunden = sekunden - (verrechnet mit Tagen)
		//wie viele stunden 
		//Sekunden = sekunden - (verrechnet mit stunden)
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Uebung3 test = new Uebung3();
		int zahl = test.inputInt(2, 10);
		System.out.println(zahl);
		System.out.printf("%n%n--------------------Aufgabe 1 ----------------%n%n");
		int prim = inputInt();
		System.out.println(prim);
		System.out.println();

	}

}
