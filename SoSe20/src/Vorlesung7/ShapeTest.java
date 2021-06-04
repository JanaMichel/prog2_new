package Vorlesung7;

public class ShapeTest {

	public static void printPerimeter(Shape s)
	{
		System.out.printf("Umfang:        %.2f %n", s.perimeter());	
	}
	
	public static void printArea(Shape s)
	{
		System.out.printf("Flächeninhalt  %.2f %n", s.area());
	}
	
	public static void sortieren(Comparable [] unsorted)
	{
		for (int bubble = 1; bubble < unsorted.length; bubble++) 
		{
			for (int index = 0; index < unsorted.length-bubble; index++) 
			{
				if(unsorted[index].compareTo(unsorted[index+1])>0)
				{
					Comparable tmp = unsorted[index];
					unsorted[index] = unsorted[index+1];
					unsorted[index+1]= tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.printf("%n%n------------Rectangle-------------%n%n");
		Shape s = new Rectangle(10, 20);
		printPerimeter(s);
		printArea(s);
		
		System.out.printf("%n%n------------Circle-------------%n%n");
		Shape t = new Circle(1.0);
		printPerimeter(t);
		printArea(t);
		
		System.out.printf("%n%n------------Circle oder Rectangle-------------%n%n");
		printPerimeter(new Rectangle(5, 15));
		printArea(new Rectangle(5,15));
		printPerimeter(new Circle(5.0));
		printArea(new Circle(5.0));
		
		System.out.printf("%n%n------------Comparable-------------%n%n");
		System.out.println("A".compareTo("B"));
		System.out.println("C".compareTo("B"));
		System.out.println("B".compareTo("B"));
		System.out.printf("%n%n------------Unsortiert-------------%n%n");
		
		Rectangle [] rectArr = new Rectangle[10];
		rectArr[0] = new Rectangle(10,10);
	}

}
