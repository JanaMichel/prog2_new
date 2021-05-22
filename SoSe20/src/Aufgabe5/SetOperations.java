package Aufgabe5;

	import java.util.*;

import uebungen.uebung6.Stadt;

public class SetOperations 
{
	/*
	 * Erstellen Sie drei Objektvariablen (z.B. numbers1, numbers2 und both) vom Typ Set<Integer>.
	 *  Erzeugen Sie für diese Objektvariablen TreeSet-Objekte.
	 */
	Set<Integer>number1;
	Set<Integer>number2;
	Set<Integer>both;
	
	/*
	 *	Erstellen Sie eine Objektmethode fill(). Sets numbers1 und numbers2 mit Zufallszahlen im Wertebereich 0..99 befüllt werden. 
	 *	Erzeugen Sie jeweils 100 Zufallszahlen (die numbers-Sets < 100 Einträge, da doppelte Elemente nicht aufgenommen werden.)
	 *	Beachten Sie, dass die nextInt()-Methode ein int zurückliefert.
	 *	Dieses int muss zunächst in ein Integer-Objekt umgewandelt werden (Integer.valueOf(int)) und dieses Integer-Objekt wird dann dem Set hinzugefügt (wenn es nicht schon enthalten ist).
	 */
	public SetOperations()
	{
		this.number1 = new TreeSet<>();
		this.number2 = new TreeSet<>();
		this.both = new TreeSet<>();
	}
	
	public void fill()
	{
		Random r = new Random();
		for(int i = 0; i<100; i ++)
		{
			this.number1.add(Integer.valueOf(r.nextInt(100)));
			this.number2.add(Integer.valueOf(r.nextInt(100)));
		}
		
	}
	/*
	 * Erstellen Sie eine Objektmethode fillBothUnion(). 
	 * In dieser Methode wird die both-Menge derart befüllt, dass both einer Vereinigung der Mengen numbers1 und numbers2 entspricht.
	 */
	public void fillBothUnion()
	{
		this.both.addAll(number1);
		this.both.addAll(number2);
	}
	
	//fillBothIntersection
	//boolean contains(element e)
	//if contains(0)
	//set.add(0);
	//else ++
	
	public void fillBothIntersection()
	{
		this.both.clear(); //inhalt von both löschen
		for (int i = 0; i < 100; i++) 
		{
			if(this.number1.contains(i) && this.number2.contains(i))
			{
				this.both.add(Integer.valueOf(i));
			}
		}
		
	}
	
	
	/*
	 * fillBothDifference
	 * if Integer number1 >=  number2
	 * add(element)
	 * else
	 * remove element
	 */
	
	public void fillBothDifference()
	{
		this.both.addAll(number1);
		this.both.removeAll(number2);
	}
	
	public void print()
	{
		int numberEins = 0;
		int numberZwei = 0;
		int numberBoth = 0;
		for (int i = 1; i < 10; i++) //reihe
		{
			for (int j = 0; j < 10; j++) //spalte
			{
				if(this.number1.contains(Integer.valueOf(numberEins)))
				{
					System.out.print(" " + "o");
				}
				else
				{
					System.out.print(" " +  " ");
				}
				numberEins++;
			}
			
			for (int j = 0; j < 5; j++) //leerzeichen zwischen A und B
			{
				System.out.print(" ");
			}
			
			for (int j = 0; j < 10; j++) //spalte
			{
				if(this.number2.contains(Integer.valueOf(numberZwei)))
				{
					System.out.print(" " + "o");
				}
				else
				{ 
					System.out.print(" " + " ");
				}
				numberZwei++;
			}
			
			for (int j = 0; j < 5; j++) //leerzeichen zwischen b und Vereinigung/Schnitt
			{
				System.out.print(" ");
			}
			
			for (int j = 0; j < 10; j++) //spalte
			{
				if(this.both.contains(Integer.valueOf(numberBoth)))
				{
					System.out.print(" " + "o");
				}
				else
				{
					System.out.print(" " + " ");
				}
				numberBoth++;
			}
			System.out.println();
		}
			
	}
	
}
