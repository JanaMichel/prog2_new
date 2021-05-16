package Vorlesung5;

public class MyInteger 
{
	private int value;
	
	public MyInteger(int value)
	{
		this.value = value;
	}

	public int getValue() 
	{
		return value;
	}
	
	public static MyInteger valueOf(int value)
	{
		return new MyInteger(value);
	}
	
	
}
