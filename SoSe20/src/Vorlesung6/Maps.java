package Vorlesung6;

import java.util.*;

public class Maps {

	public static void main(String[] args) 
	{
		/*
		 * in Maps speichern wir Schl�ssel-Werte-Paare
		 * Schl�ssel sind eindeutig, Schl�sseltyp K
		 * Werte k�nnen sich doppeln, Wertetyp V
		 * statt add(), addAll()
		 * --> put(), putAll()
		 * keine Objekte erzeugbar von Map selbst
		 */
		//zwei typen m�ssen angegeben werden (Schl�ssel, Werte)
		Map<String, Integer> mapA = new HashMap<>();
		mapA.put("A", 1); //autoboxing von Zahl 1 --> in Integer
		mapA.put("B", 2);
		mapA.put("C", 3); //wert kann auch liste sein (die wiederrum typisiert ist)
		
		/*
		 * ein einzelnes Schl�ssel-Werte-Paar ist vom
		 * Typ Map.Entry
		 * typisiert: Map.Entry<K,V> wobei K der schl�ssel und V der Wertetyp ist
		 * in unserem beispiel: Map.Entry<String, Integer>
		 */
		
		//Wie k�nnen wir uns die elemente anschauen?
		//leider nicht �ber Iterator sondern 
		//--> entrySet() erzeugt eine Set von lauter Schl�ssel-Werte-Paaren
		
		Set <Map.Entry<String, Integer>>allEntriesFromMapA = mapA.entrySet();
		for(Map.Entry<String, Integer>entry : allEntriesFromMapA) 
		{
			//getValue()	Wert auslesen
			//getKey() 		Schl�ssel auslesen
			System.out.println("Schl�ssel : " + entry.getKey() + " Wert: " + entry.getValue());
		}
		
		//bessere M�glichkeit
		//keine Erstellung von Set notwendig
		
		for(Map.Entry<String, Integer>entry : mapA.entrySet()) 
		{
			//getValue()	Wert auslesen
			//getKey() 		Schl�ssel auslesen
			System.out.println("Schl�ssel : " + entry.getKey() + " Wert: " + entry.getValue());
		}
		//erst einen Iterator erzeugen auch m�glich
		//Iterator<Map.Entry<String, Integer>>it = allEntriesFromMapA.iterator();
		
		System.out.println("MapA enth�lt B?: "+ mapA.containsKey("B")); //Boolean �berpr�fung 
		System.out.println("MapA enth�lt D?: "+ mapA.containsKey("D")); //ob �bergebener Key enthalten
		
		Set <String> allKeys = mapA.keySet(); //gibt die Menge aller Schl�ssel zur�ck
		for(String key: allKeys)
		{
			System.out.println("Key : "+key);
		}
		
		System.out.printf("%n%n------------------Map A ---------------%n%n");
		mapA.put("B", 5); //Neuer Schl�ssel hinzugef�gt, existiert bereits, darum Wert �bernommen
		for(Map.Entry<String, Integer>entry : mapA.entrySet()) 
		{
			//getValue()	Wert auslesen
			//getKey() 		Schl�ssel auslesen
			System.out.println("Schl�ssel : " + entry.getKey() + " Wert: " + entry.getValue());
		}
		
		System.out.printf("%n%n------------------Map B ---------------%n%n");
		Map <String, Integer> mapB = new HashMap<>();
		mapB.put("B", 6);
		mapB.put("D", 7);
		for(Map.Entry<String, Integer>entry : mapA.entrySet()) 
		{
			//getValue()	Wert auslesen
			//getKey() 		Schl�ssel auslesen
			System.out.println("Schl�ssel : " + entry.getKey() + " Wert: " + entry.getValue());
		}
		
		mapA.putAll(mapB);
		System.out.printf("%n%n------------------Map A ---------------%n%n");
		for(Map.Entry<String, Integer>entry : mapA.entrySet()) 
		{
			//getValue()	Wert auslesen
			//getKey() 		Schl�ssel auslesen
			System.out.println("Schl�ssel : " + entry.getKey() + " Wert: " + entry.getValue());
		}
		mapA.put("E", 1);
		
		System.out.printf("%n%n------------------Map A ---------------%n%n");
		
		Collection <Integer>allValues = mapA.values();
		for(Integer value : allValues)
		{
			System.out.println("value: " + value);
		}
		
	}

}
