package uebungen.uebung2;

import uebungen.uebung2.TicTacToe.State;

public class TicTacTest {

	public static void main(String[] args) 
	{
		TicTacToe a1 = new TicTacToe();
		a1.makeMove(1, 1, State.BLACK);
		a1.print();
		a1.makeMove(1, 2, State.RED);
		a1.print();
		a1.makeMove(0, 0, State.BLACK);
		a1.print();
		a1.makeMove(0, 2, State.RED);
		a1.print();
		a1.makeMove(2, 0, State.BLACK);
		a1.print();
		a1.makeMove(2, 2, State.RED);
		a1.print();
		a1.gewonnen();
		a1.unentschieden();
		
		
	}

}
