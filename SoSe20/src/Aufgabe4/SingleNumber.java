package Aufgabe4;

public class SingleNumber 
{
	public static boolean contains(int[] numbs, int element)
	{
	    boolean found = false;
	    for(int index=0; index<numbs.length && !found; index++)
	    {
	        if(numbs[index]==element)
	        {
	            found = true;
	        }
	    }
	    return found;
	}
	
	public static boolean einmalig(int[] numbs, int element)
	{
		boolean einmalig = true;
		if(contains(numbs, element))
		{		
				int anzahl = 0;
				for(int index=0; index<numbs.length; index++)
				{
					if(numbs[index]==element)
					{
						anzahl++;
					}
				}
				if(anzahl >1)
				{
					einmalig = false;
				}
		}
		return einmalig;
		
		
		
	}
	
	public static int singleNumber(int[] numbs)
	{
		int output = 0;	
		for (int index = 0; index < numbs.length; index++) 
		{
			if(einmalig(numbs, index))
			{
				output = index;
			}
		}
		return output;
	}
	
	public static void main(String[] args) 
	{
		int [] input = {4,2,3,4,2};
		
		System.out.println(singleNumber(input));
	}
	
}
