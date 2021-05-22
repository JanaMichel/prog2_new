package Aufgabe5;

import java.util.*;

public class SetOperationsTest {

	public static void main(String[] args) 
	{
		SetOperations neu = new SetOperations();
		neu.fill();
		System.out.printf("%n----------------------------------------------------------------------%n");
		System.out.printf("         A                         B                      A %c B", '\u222a');
		System.out.printf("%n----------------------------------------------------------------------%n");
		neu.print();
		SetOperations a1 = new SetOperations();
		a1.fillBothUnion();
		System.out.printf("%n----------------------------------------------------------------------%n");
		System.out.printf("         A                         B                      A %c B", '\u222a');
		System.out.printf("%n----------------------------------------------------------------------%n");
		a1.print();
	}
	

}
