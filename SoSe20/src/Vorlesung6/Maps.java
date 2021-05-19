package Vorlesung6;

import java.util.*;

public class Maps {

	public static void main(String[] args) 
	{
		/*
		 * in Maps speichern wir Schlüssel-Werte-Paare
		 * Schlüssel sind eindeutig, Schlüsseltyp K
		 * Werte können sich doppeln, Wertetyp V
		 * statt add(), addAll()
		 * --> put(), putAll()
		 * keine Objekte erzeugbar von Map selbst
		 */
		//zwei typen müssen angegeben werden (Schlüssel, Werte)
		Map<String, Integer> mapA = new HashMap<>();
		mapA.put("A", 1); //autoboxing von Zahl 1 --> in Integer
		mapA.put("B", 2);
		mapA.put("C", 3); //wert kann auch liste sein (die wiederrum typisiert ist)
		
		/*
		 * ein einzelnes Schlüssel-Werte-Paar ist vom
		 * Typ Map.Entry
		 * typisiert: Map.Entry<K,V> wobei K der schlüssel und V der Wertetyp ist
		 * in unserem beispiel: Map.Entry<String, Integer>
		 */
		
		//Wie können wir uns die elemente anschauen?
		//leider nicht über Iterator sondern 
		//--> entrySet() erzeugt eine Set von lauter Schlüssel-Werte-Paaren
		
		Set <Map.Entry<String, Integer>>allEntriesFromMapA = mapA.entrySet();
		for(Map.Entry<String, Integer>entry : allEntriesFromMapA) 
		{
			//getValue()	Wert auslesen
			//getKey() 		Schlüssel auslesen
			System.out.println("Schlüssel : " + entry.getKey() + " Wert: " + entry.getValue());
		}
		
		//bessere Möglichkeit
		//keine Erstellung von Set notwendig
		
		for(Map.Entry<String, Integer>entry : mapA.entrySet()) 
		{
			//getValue()	Wert auslesen
			//getKey() 		Schlüssel auslesen
			System.out.println("Schlüssel : " + entry.getKey() + " Wert: " + entry.getValue());
		}
		//erst einen Iterator erzeugen auch möglich
		//Iterator<Map.Entry<String, Integer>>it = allEntriesFromMapA.iterator();
		
		System.out.println("MapA enthält B?: "+ mapA.containsKey("B")); //Boolean überprüfung 
		System.out.println("MapA enthält D?: "+ mapA.containsKey("D")); //ob übergebener Key enthalten
		
		Set <String> allKeys = mapA.keySet(); //gibt die Menge aller Schlüssel zurück
		for(String key: allKeys)
		{
			System.out.println("Key : "+key);
		}
		
		System.out.printf("%n%n------------------Map A ---------------%n%n");
		mapA.put("B", 5); //Neuer Schlüssel hinzugefügt, existiert bereits, darum Wert übernommen
		for(Map.Entry<String, Integer>entry : mapA.entrySet()) 
		{
			//getValue()	Wert auslesen
			//getKey() 		Schlüssel auslesen
			System.out.println("Schlüssel : " + entry.getKey() + " Wert: " + entry.getValue());
		}
		
		System.out.printf("%n%n------------------Map B ---------------%n%n");
		Map <String, Integer> mapB = new HashMap<>();
		mapB.put("B", 6);
		mapB.put("D", 7);
		for(Map.Entry<String, Integer>entry : mapA.entrySet()) 
		{
			//getValue()	Wert auslesen
			//getKey() 		Schlüssel auslesen
			System.out.println("Schlüssel : " + entry.getKey() + " Wert: " + entry.getValue());
		}
		
		mapA.putAll(mapB);
		System.out.printf("%n%n------------------Map A ---------------%n%n");
		for(Map.Entry<String, Integer>entry : mapA.entrySet()) 
		{
			//getValue()	Wert auslesen
			//getKey() 		Schlüssel auslesen
			System.out.println("Schlüssel : " + entry.getKey() + " Wert: " + entry.getValue());
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
