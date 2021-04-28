package Vorlesung3Part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UmrechnungTimeZeitTest {

	@Test
	void testConvert1amTo1() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		String zeit = utz.convert("1:00 am");
		
		//dann soll xx passieren (verifikation)
		assertEquals(zeit, "1:00", "1:00 am to 1:00 not working");
		
	}
	
	@Test
	void testConvert2amTo2() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		String zeit = utz.convert("2:00 am");
		
		//dann soll xx passieren (verifikation)
		assertEquals("2:00", zeit,"2:00 am to 2:00 not working");
		
	}
	
	@Test
	void testConvert9amTo9() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		String zeit = utz.convert("9:00 am");
		
		//dann soll xx passieren (verifikation)
		assertEquals("9:00", zeit);
		
	}
	
	@Test
	void testConvert10amTo10() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		String zeit = utz.convert("10:00 am");
		
		//dann soll xx passieren (verifikation)
		assertEquals("10:00", zeit);
		
	}

	@Test
	void testConvert1115amTo1115() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		String zeit = utz.convert("11:15 am");
		
		//dann soll xx passieren (verifikation)
		assertEquals("11:15", zeit);
		
	}
	
	@Test
	void testConvert1pmTo13() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		String zeit = utz.convert("1:00 pm");
		
		//dann soll xx passieren (verifikation)
		assertEquals("13:00", zeit);
		
	}
	
	@Test
	void testConvert3pmTo15() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		String zeit = utz.convert("3:00 pm");
		
		//dann soll xx passieren (verifikation)
		assertEquals("15:00", zeit);
		
	}
	
	@Test
	void testConvert345pmTo1545() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		String zeit = utz.convert("3:45 pm");
		
		//dann soll xx passieren (verifikation)
		assertEquals("15:45", zeit);
		
	}
	
	@Test
	void testConvert11pmTo23() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		String zeit = utz.convert("11:00 pm");
		
		//dann soll xx passieren (verifikation)
		assertEquals("23:00", zeit);
		
	}
	
	@Test
	void testGetHoursSTR11pm() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		String zeit = utz.getHoursString("11:00 pm");
		
		//dann soll xx passieren (verifikation)
		assertEquals("11", zeit);
		
	}
	
	@Test
	void testGetHoursSTR1pm() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		String zeit = utz.getHoursString("11:00 pm");
		
		//dann soll xx passieren (verifikation)
		assertEquals("11", zeit);
	}
	
	@Test
	void testGetHoursInt1pm() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		int zeit = utz.getHoursInt("1:00 pm");
		
		//dann soll xx passieren (verifikation)
		assertEquals("1", zeit);
	}
	
	@Test
	void testGetHoursInt11pm() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		int zeit = utz.getHoursInt("11:00 pm");
		
		//dann soll xx passieren (verifikation)
		assertEquals("11", zeit);
	}
	
	@Test
	void testGetMinutesInt() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		String minutes = utz.getMinutesStr("11:00 pm");
		
		//dann soll xx passieren (verifikation)
		assertEquals("00", minutes);
	}
	
	@Test
	void testGetMinutesInt11pm() 
	{
		// Gegeben (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		//when (ausführung)
		String minutes = utz.getMinutesStr("11:00 pm");
		
		//dann soll xx passieren (verifikation)
		assertEquals("00", minutes);
	}
}
