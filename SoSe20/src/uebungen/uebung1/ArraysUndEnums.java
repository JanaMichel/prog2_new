package uebungen.uebung1;

public class ArraysUndEnums {

	enum Weekday { MO, DI, MI, DO, FR, SA, SO };
	
	public static void printDay(Weekday day)
	{
		switch(day)
		{
			case MO : System.out.println("Montag"); break;
			case DI : System.out.println("Dienstag"); break;
			case MI : System.out.println("Mittwoch"); break;
			case DO : System.out.println("Donnerstag"); break;
			case FR : System.out.println("Freitag"); break;
			case SA : System.out.println("Samstag"); break;
			case SO : System.out.println("Sonntag"); break;
			default: System.out.println("Kein Tag");
		}
	}
	
	public static void printDay(int day)
	{
		switch(day)
		{
			case 0 : System.out.println("Montag"); break;
			case 1 : System.out.println("Dienstag"); break;
			case 2 : System.out.println("Mittwoch"); break;
			case 3 : System.out.println("Donnerstag"); break;
			case 4 : System.out.println("Freitag"); break;
			case 5 : System.out.println("Samstag"); break;
			case 6 : System.out.println("Sonntag"); break;
			default: System.out.println("Kein Tag");
		}
	}
	
	public static void printDay(String day)
	{
		switch(day)
		{
			case "MO" : System.out.println("Montag"); break;
			case "DI" : System.out.println("Dienstag"); break;
			case "MI" : System.out.println("Mittwoch"); break;
			case "DO" : System.out.println("Donnerstag"); break;
			case "FR" : System.out.println("Freitag"); break;
			case "SA" : System.out.println("Samstag"); break;
			case "SO" : System.out.println("Sonntag"); break;
			default: System.out.println("Kein Tag");
		}
	}
	
	public static void main(String[] args) 
	{
		int [][] mdIntArray = new int [3][4];
		
		for (int i = 0; i < mdIntArray.length; i++) 
		{
			for (int j = 0; j < mdIntArray[i].length; j++) 
			{
				mdIntArray[i][j] = i * j;
				
			}
		}
		
		for (int i = 0; i < mdIntArray.length; i++) 
		{
			System.out.print(i + ": ");
			for (int j = 0; j < mdIntArray[i].length; j++) 
			{
				System.out.print(mdIntArray[i][j] + " ");
								
			}
			System.out.println();
		}
		
		String [][] mdIntArrayb = new String [3][4];
		
		for (int i = 0; i < mdIntArray.length; i++) 
		{
			for (int j = 0; j < mdIntArray[i].length; j++) 
			{
				mdIntArrayb[i][j] = "(" + i + ", "+ j + ")";
				
			}
		}
		
		for (int i = 0; i < mdIntArrayb.length; i++) 
		{
			System.out.print(i + ": ");
			for (int j = 0; j < mdIntArrayb[i].length; j++) 
			{
				System.out.print(mdIntArrayb[i][j] + " ");
								
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Switch:");
		printDay(2);
		printDay("MO");
		printDay(Weekday.SA);
		
		Weekday day = Weekday.MO;
		System.out.println(day);
	}

}
