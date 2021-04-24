package uebungen.uebung2;

public class TicTacTest {

	public static void main(String[] args) 
	{
		TicTacToe ttt = new TicTacToe();
        ttt.print();
        /*
        ttt.makeMove(1, 1, State.RED);
        ttt.printResultat();
        ttt.print();
        ttt.makeMove(1, 2, State.BLACK);
        ttt.printResultat();
        ttt.print();
        ttt.makeMove(1, -1, State.BLACK);
        ttt.printResultat();
        ttt.print();
        ttt.makeMove(0, 1, State.RED);
        ttt.printResultat();
        ttt.print();
        ttt.makeMove(2, 1, State.BLACK);
        ttt.printResultat();
        ttt.print();
        ttt.makeMove(1, 0, State.RED);
        ttt.printResultat();
        ttt.print();
        ttt.makeMove(0, 0, State.BLACK);
        ttt.printResultat();
        ttt.print();
        ttt.makeMove(0, 2, State.RED);
        ttt.printResultat();
        ttt.print();
        ttt.makeMove(2, 0, State.BLACK);
        ttt.printResultat();
        ttt.print();
        ttt.makeMove(2, 2, State.RED);
        ttt.printResultat();
        ttt.print();
        */
        ttt.spielen();
        // ttt.makeRandomMove(State.RED);
        // ttt.print();
		
	}

}
