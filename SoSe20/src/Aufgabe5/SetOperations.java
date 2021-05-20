package Aufgabe5;

	import java.util.*;

import uebungen.uebung6.Stadt;

public class SetOperations 
{
	
	/*
	 *	Erstellen Sie eine Objektmethode fill(). Sets numbers1 und numbers2 mit Zufallszahlen im Wertebereich 0..99 befüllt werden. 
	 *	Erzeugen Sie jeweils 100 Zufallszahlen (die numbers-Sets < 100 Einträge, da doppelte Elemente nicht aufgenommen werden.)
	 *	Beachten Sie, dass die nextInt()-Methode ein int zurückliefert.
	 *	Dieses int muss zunächst in ein Integer-Objekt umgewandelt werden (Integer.valueOf(int)) und dieses Integer-Objekt wird dann dem Set hinzugefügt (wenn es nicht schon enthalten ist).
	 */
	
	
	public static void fill()
	{
		Set <Integer >numbers1 = new TreeSet<>();
		Set <Integer >numbers2 = new TreeSet<>();
		Random r = new Random();
		int hundred = 100;
		int number = 0;
		for (int i = 0; i < hundred; i++) 
		{
			number= r.nextInt(100);
			numbers1.add(Integer.valueOf(number));
			numbers2.add(Integer.valueOf(number));
		}
		/*int number2 = 0;
		for (int i = 0; i < hundred; i++) 
		{
			number2 = r.nextInt(100);
			numbers2.add(Integer.valueOf(number2));
		}*/
		System.out.println("Menge mit  " + numbers1.size() + " Elementen:");
			
		
	}
	
	//fillbothUnion()
	//add All(collection<? extends E> c)
	
	
	//fillBothIntersection
	//boolean contains(element e)
	//if contains(0)
	//set.add(0);
	//else ++
	
	/*
	 * fillBothDifference
	 * if Integer number1 >=  number2
	 * add(element)
	 * else
	 * remove element
	 */
	
	/*
	 * print
	 * Map?
	 */
	
	
	
	
}
