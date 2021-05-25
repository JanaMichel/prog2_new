package Aufgabe6;

import java.util.HashMap;
import java.util.Map;

public class PizzaMenu {
	
	//Punkt 3.
	public static boolean existingPizza(Map<String, Double>menu, String pizza)
	{
		return menu.containsKey(pizza);
	}
	
	//Punkt 4.
	public static void printPrice(Map<String, Double>menu, String pizza)
	{
		if(!existingPizza(menu, pizza))
		{
			System.out.println(pizza + ": Diese Pizza gibt es nicht.");
		}
		for(Map.Entry<String, Double>entry: menu.entrySet()) 
		{
			if(entry.getKey()==pizza)
			{
			System.out.println(entry.getKey() + ": " + entry.getValue() + " Euro");
			}
		}
	}
	
	//Punkt 5.
	public static void printMenu(Map<String, Double>menu)
	{
		if(menu.isEmpty()) System.out.println("Das Menu enthält 0 Pizzen");
		else
		{
			System.out.println("Das Menu enthält " + menu.size() + " Pizzen");
			for(Map.Entry<String, Double>entry : menu.entrySet()) 
			{
				System.out.println("Pizza " + entry.getKey() + " : " + entry.getValue() + " Euro");
			}
		}
	}
	
	//Punkt 7.
	public static void affordablePizza(Map<String, Double>menu, double maxPrice)
	{
		System.out.println("Eingegebener Betrag: " + maxPrice);
		double hochstPreis = 0.0;
		for(Map.Entry<String, Double>entry : menu.entrySet()) 
		{
			if(entry.getValue()>hochstPreis) hochstPreis = entry.getValue();
			if(entry.getValue()<=maxPrice)
			{
				System.out.println("Pizza " + entry.getKey() + " : " + entry.getValue() + " Euro");
			}
			
		}
		if(maxPrice<hochstPreis) System.out.println("Leider gibt es zu diesem Preis keine Pizza");
	}
	
	public static void main(String[] args) 
	{
		//Punkt 1. 
		long a = 1000;
		Integer b = 1000;
		Integer c = 1000;
		System.out.println(a == b);
		System.out.println(b <= c);
		System.out.println(b >= c);
		
		//Punkt 2.
		Map<String, Double> mapA = new HashMap<>();
		mapA.put("Margherita", 7.00); //autoboxing von Zahl double --> in Double
		mapA.put("Veggie", 7.50);
		mapA.put("Salami", 8.50);
		mapA.put("Schinken", 8.50);
		System.out.printf("%n%n----------PrintPrice---------%n%n");
		printPrice(mapA, "Salami");
		printPrice(mapA,"Margherita" );
		printPrice(mapA, "Hawaii");
		System.out.printf("%n%n----------PrintMenu---------%n%n");
		printMenu(mapA);
		
		//Punkt 6.
		mapA.put("Schinken", 8.20);
		System.out.printf("%n%n----------PrintPrice Schinken---------%n%n");
		printPrice(mapA, "Schinken");
		
		System.out.printf("%n%n----------affordablePizza---------%n%n");
		affordablePizza(mapA, 7.5);
		System.out.println();
		affordablePizza(mapA, 2.0);
		
		System.out.printf("%n%n----------Neues Menü---------%n%n");
		mapA.clear();
		mapA.put("Verde", 7.0);
		mapA.put("Hawaii", 8.20);
		mapA.put("Tradizionale", 8.50);
		printMenu(mapA);
		
		System.out.printf("%n%n----------zweites Menü---------%n%n");
		Map<String, Double>mapB = new HashMap<>();
		mapB.putAll(mapA);
		mapB.remove("Hawaii");
		printMenu(mapB);
	}

}
