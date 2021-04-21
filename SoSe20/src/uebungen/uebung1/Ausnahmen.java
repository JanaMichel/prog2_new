package uebungen.uebung1;

public class Ausnahmen {

	public static int division(int nr1, int nr2)
	{
		return nr1/nr2;
	}
	
	public static int getValueAtIndex(int[] arr, int index)
	{
		if(index<0 || index>arr.length-1)
		{
			System.out.println("Index außerhalb der def. Groesse");
		}
		return arr [index];
				
	}
	
	public static void main(String[] args) 
	{
		int nr1 = 4;
		int nr2 = 0;
		try //Exeption möglich
		{
			int result = division(nr1, nr2); //hier entsteht exeption, block wird verlassen
			System.out.printf("%2d / %2d = %2d %n", nr1, nr2, result); //wird nicht mehr erreicht, wenn Exeption vorhanden
		}
		catch(Exception e) //wenn Exeption gefunden, abfangen und ausgabe drucken
		{
			System.out.println("Division durch 0 nicht definiert");
			// e.printStackTrace(); hier wird die Exeption zusätzlich ausgegeben
		}
		
		int [] arr = { 1, 2, 3, 4 };
		int value = getValueAtIndex(arr, 3);
		System.out.println(value);
	}

}
