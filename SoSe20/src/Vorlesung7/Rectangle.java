package Vorlesung7;

public class Rectangle extends Shape implements Comparable<Rectangle>
{
	
	private int width;
	private int height;
	
	//Konstruktor
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double perimeter() 
	{
		// TODO Auto-generated method stub
		return (2.0*(this.width + this.height));
	}

	@Override
	public double area() 
	{
		// TODO Auto-generated method stub
		return this.width * this.height;
	}

	@Override
	public int compareTo(Rectangle o) {
		/*
		 * wenn this > o --> positiver int
		 * wenn this < o --> negativer int
		 * wenn this = o --> 0
		 */
		
		
		return ((this.width + this.height) - (o.width + o.height));
	}

	
	
}
