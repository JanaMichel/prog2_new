package Vorlesung7;

public class Circle extends Shape
{

	private double radius;
	
	//Konstruktor
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return Math.PI * 2.0 * this.radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * this.radius * this.radius;
	}
	
}
