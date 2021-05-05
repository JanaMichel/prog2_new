package Vorlesung4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 *Collections: ähnlich wie Arrays, viele Elemente speichern
 *keine feste Länge
 *wir können nur Referenztypen speichern, kein int, boolean, char, double, ...
 *Elemente versch. Typs speicherbar --> aber fehleranfällig, deshalb Typisieren
 *Arten von Collections: 
 * --> List (wie Arrays)
 * --> Set (keine Dopplung, laut boolean)
 * --> Stack 
 * --> Queue (warteschlange, erste rein, letzte raus)
 * --> Map 2-Spaltige Tabellen, linke schlüssel (postleitzahl), rechte Werte-Paare (ortschaft)
 */

public class ListenUndMengen {

	public static void main(String[] args) 
	{
		// Mengen Set
		Set <String> set1 = new HashSet<>(); //ich typisiere meine collection und die kontrete Klasse meine mit < > , dass nur String gespeichert wird
		Set <String> set2 = new TreeSet<>(); //werden eher nicht verwendet
		
		String s1 = "erster";
		String s2 = "zweiter";
		String s3 = "dritter";
		String s4 = "zweiter";
		
		Integer i1 = 1;
		
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		set1.add(s4);
		//set1.add(i1);
		
		System.out.println(set1.add(s1));
		System.out.println(set1.add(s2));
		System.out.println(set1.add(s3));
		System.out.println(set1.add(s4));
		//System.out.println(set1.add(i1));
		
		
		
		System.out.println(set1.size()); //Anzahl elemente in collection
		
		Iterator a1 = set1.iterator(); //durchlaufen durch collection
		while(a1.hasNext()) //hasNext = ist da noch was drin?
		{
			System.out.println(a1.next()); //element herausnehmen
		}
		
		//zweite durchlauf möglichkeit
		System.out.println();
		
		for(String element : set1)
		{
			System.out.println(element);
		}
		
		/**
		 * int [] arr = new int [10];
		 * for(int p1 : arr)
		 * {
		 * 		syso(p1);
		 * }
		 */
		
		//Element löschen (+boolean gefunden?)
		System.out.println();
		System.out.println(set1.remove("erster"));
		System.out.println(set1.remove("vierter"));
		
		for(String element : set1)
		{
			System.out.println(element);
		}
		
		System.out.printf("%n%n-----------------------Listen----------------%n%n");
		
		List <String> l1 = new ArrayList<>();
		List <String >l2 = new LinkedList<>();
		
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		for(String s : l1)
		{
			System.out.println(s);
		}
		System.err.println();
		System.out.println(l1.size());
		System.out.println(l1.remove("zweiter"));
		System.out.println(l1.remove("vierter"));
		
		for(String element : l1)
		{
			System.out.println(element);
		}
		
		System.out.println();
		System.out.println("gelöscht: " + l1.remove(1));
		
		for(String element : l1)
		{
			System.out.println(element);
		}
		
		System.out.printf("%n%n-----------------------Listen l2 ----------------%n%n");
		
		l2.add("neu");
		l2.add("alt");
		
		for(String element : l2)
		{
			System.out.println(element);
		}
		
		System.out.println();
		
		l1.addAll(l2); //alle elemente von l2 werden in l1 übernommen
		
		for(String element : l1)
		{
			System.out.println(element);
		}
		
		System.out.println();
		
		l1.removeAll(l2); //alle Elemente aus l2 werden gelöscht
		for(String element : l1)
		{
			System.out.println(element);
		}
	}

}
