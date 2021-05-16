package Vorlesung5;

import java.util.*;

public class Wrapper {

	public static void main(String[] args) 
	{
		Set<String> s1 = new HashSet<>();
		Set <MyInteger>s2 = new HashSet<>();
		
		MyInteger il = new MyInteger(7);
		s2.add(il);
		
		for(MyInteger element : s2)
		{
			System.out.println(element.getValue());
		}
		
		//3 Möglichkeiten der Objekteerzeugung
		//--> Konstruktor - nicht mehr verwenden
		//--> valueOf() 
		//--> sogenanntes Boxing
		
		/*
		 * Konstrukter
		 * int iWert1 = 12;
		 * Integer iReferenz1 = new Integer(iWert1);
		 * Syso(iRef1.toString());
		 */
		
		//valueOf()
		int iWert1 = 12;
		String iString1 = "12";
		Integer iRef3 = Integer.valueOf(iWert1);
		Integer iRef4 = Integer.valueOf(iString1);
		
		System.out.println("Integer "+iRef3.toString());
		System.out.println("String "+iRef4.toString());
		
		//Auto-Boxing
		Integer iRef5 = 1000; //automatisch wird die zahl als int erkannt und integer fungiert als wrapper
		Integer iRef6 = 1000;
		System.out.println(iRef5.toString());
		System.out.println(iRef6.toString());
		System.out.println(iRef5 == iRef6); //referenzvergleich, da zwei versch. Objekte
		System.out.println(iRef5 >= iRef6);	//auto-unboxing
		
		//Double d1 = 5.5;
		
		
	}

}
