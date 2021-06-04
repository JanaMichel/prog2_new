package Vorlesung7_2;

public class Rectangle implements Shape
{
	//muss nicht von shape erben, da Interface
	//darum werden Methoden implementiert
	
	private int width;
	private int height;
	
	//Konstruktor
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (2.0*(this.width + this.height));
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}


}
