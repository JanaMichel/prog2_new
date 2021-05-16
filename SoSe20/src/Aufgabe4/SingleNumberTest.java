package Aufgabe4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Vorlesung3.MyMath;

class SingleNumberTest {

	int [] numbs = {2,2,1};
	int [] numbs1 = {4,1,2,1,2};
	int [] numbs2 = {1};
	
	
	@Test
	void testfound() 
	{
		
		boolean found = SingleNumber.contains(numbs, 1);
		assertEquals(true, found, "Input: [2,2,1] gefunden: true");
	}
	
	@Test
	void testeinmaligtrue() 
	{
	
		boolean found = SingleNumber.einmalig(numbs1, 4);
		assertEquals(true, found, "Input: [4,1,2,1,2] einmalig: true");
	}

	@Test
	void testeinmaligFalse() 
	{
	
		boolean found = SingleNumber.einmalig(numbs, 2);
		assertEquals(false, found, "Input: [2,2,1] einmalig: false");
	}
	
	@Test
	void testSingleNumber()
	{
		assertTrue(1==SingleNumber.singleNumber(numbs), "Input: [2,2,1] Expected output: 1");
	}
}
