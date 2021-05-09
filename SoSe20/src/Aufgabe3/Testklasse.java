package Aufgabe3;

public class Testklasse {

	public static void main(String[] args) 
	{
		Solitaire game = new Solitaire();
		game.print();
		System.out.println();
		int zug =1;
		while(game.moveFirstPossible())
		{
			System.err.println("After "+ zug+". move:");
			System.out.println();
			zug++;
			game.print();	
		}

		System.out.println("No possible move");
		game.print();



	}

}
