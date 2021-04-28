package Vorlesung3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void testAbs3() {
		
		int result = MyMath.abs(3);
		assertEquals(3, result, "abs(3) not 3");
	}
	
	@Test
	void testAbsMinus3() {
			
			int result = MyMath.abs(3);
			assertEquals(3, result, "abs(-3) not 3");
		
	}
	
	@Test
	void testSqrt9() {
		
		double result = MyMath.sqrt(9.0);
		assertEquals(3.0, result, 0.00001);
	}
	
	@Test
	void testSqrt25() {
		
		double result = MyMath.sqrt(25.0);
		assertTrue(MyMath.abs(5.0 - result) <= 0.0001);
	}
	
	@Test
	void testGGT44und12() {
		
		int result = MyMath.ggT(44, 12);
		assertEquals(4, result, "ggT of 44 and 12 not 4");
	}
	

}
