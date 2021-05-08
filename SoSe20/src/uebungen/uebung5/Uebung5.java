package uebungen.uebung5;

import java.util.*;

public class Uebung5 {

	//1. erstelle eine Methode ... in dem eine ArrayList erstellt und befüllt wird + rückgabe
	public static List<String> createArrayList(String[] words)
	{
		List <String> list1 = new ArrayList<>();
		for (int i = 0; i < words.length; i++) 
		{
			list1.add(String.valueOf(words[i]));
		}
		return list1;
	}
	
	//2. erstelle die Methode ... die alle Elemente der Liste ausgibt
	public static void printList(List<String> list)
	{
		Iterator<String>it = list.iterator();
		System.out.println("Liste mit  " + list.size() + " Elementen:");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	//Mengen: 1. HashSet mit String Elementen
	public static Set<String> createHashSet(String[] words)
	{
		Set<String>typ = new HashSet<>();
		for (int i = 0; i < words.length; i++) 
		{
			typ.add(String.valueOf(words[i]));
		}
		return typ;
	}
	
	//Mengen: 2. printSet, ausgabe aller Elemente der Menge
	public static void printSet(Set<String> set)
	{
		Iterator<String>it = set.iterator();
		System.out.println("Menge mit  " + set.size() + " Elementen:");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	//Mengen: 3. TreeSet mit String Elementen
	public static Set<String> createTreeSet(String[] words)
	{
		Set<String>typ = new TreeSet<>();
		for (int i = 0; i < words.length; i++) 
		{
			typ.add(String.valueOf(words[i]));
		}
		return typ;
	}
	
	public static void main(String[] args) 
	{
		
		String[] words = {"Linux", "Apple", "Facebook", "Amazon", "IBM", "Lenovo", 
				"Google", "IBM", "Microsoft", "Apple", "Google", "Twitter", "Skype", 
				"Chrome", "Linux", "Firefox"};
		
		System.out.printf("%n%n-------------Liste füllen und drucken --------------%n%n");
		List<String> a1= createArrayList(words);
		printList(a1);
		
		System.out.printf("%n%n-------------Liste durchgucken und suchen--------------%n%n");
		System.out.println("Index erstmalig Apple " + a1.indexOf("Apple"));
		System.out.println("Index letztmalig Apple " + a1.lastIndexOf("Apple"));
		System.out.println("Erstes Element d. Liste " + a1.get(0));
		System.out.println("Letztes Element d. Liste " + a1.get(a1.size()-1));
		
		System.out.printf("%n%n-------------Hashset: Mengen füllen und drucken --------------%n%n");
		Set<String> a2 = createHashSet(words);
		printSet(a2);
		
		System.out.printf("%n%n-------------Treeset: Mengen füllen und drucken --------------%n%n");
		Set<String> a3 = createTreeSet(words);
		printSet(a3);
	}
	
}
