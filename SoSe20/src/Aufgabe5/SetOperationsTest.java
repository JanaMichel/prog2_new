package Aufgabe5;

import java.util.*;

public class SetOperationsTest {

	public static void main(String[] args) 
	{
		SetOperations a1 = new SetOperations();
		a1.fill();
		a1.fillBothUnion();
		System.out.printf("%n----------------------------------------------------------------------%n");
		System.out.printf("         A                         B                      A u B");
		System.out.printf("%n----------------------------------------------------------------------%n");
		a1.print();
		
		SetOperations a2 = new SetOperations();
		a2.fill();
		a2.fillBothIntersection();
		System.out.printf("%n----------------------------------------------------------------------%n");
		System.out.printf("         A                         B                      A ^ B", '\u222a');
		System.out.printf("%n----------------------------------------------------------------------%n");
		a2.print();
		
		SetOperations a3 = new SetOperations();
		a3.fill();
		a3.fillBothDifference();
		System.out.printf("%n----------------------------------------------------------------------%n");
		System.out.printf("         A                         B                      A - B", '\u222a');
		System.out.printf("%n----------------------------------------------------------------------%n");
		a3.print();
	}
	

}
