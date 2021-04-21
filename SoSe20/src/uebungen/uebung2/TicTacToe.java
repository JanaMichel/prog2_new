package uebungen.uebung2;

public class TicTacToe 
{
	enum State {EMPTY, RED, BLACK};
    State[][] field;
    
    public TicTacToe()
    {
        field = new State[3][3];
        for(int i=0; i<field.length; i++)
        {
        	for(int j=0; j<field[i].length; j++)
            {
        		field[i][j]=State.EMPTY;
            }
        }
          
    }

    public void makeMove(int i, int j, State player)
    {
        if(field[i][j]==State.EMPTY && player!=State.EMPTY)   
        {
        	field[i][j]=player;
        }
    }
    
    
    public void print()
	{
    	for (int i = 0; i < field.length; i++) 
    	{
			for (int j = 0; j < field[i].length; j++) 
			{
				if(field[i][j]==State.RED)
				{
					System.out.print("x");
				}
				if(field[i][j]==State.BLACK)
				{
					System.out.print("o");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
    	System.out.println();
	}
    
    public boolean gewonnen()
    {
    	boolean gewonnen = false;
    	for (int i = 0; i < field.length; i++) 
    	{
			for (int j = 0; j < field[i].length; j++) 
			{
				if(field[i][j] == State.RED && field[i][j+1] == State.RED && field[i][j+2]==State.RED)
				{
					gewonnen = true;
				}
				if(field[i][j] == State.RED && field[i+1][j] == State.RED && field[i+1][j]==State.RED)
				{
					gewonnen = true;
				}
				if(field[i][j] == State.BLACK && field[i][j+1] == State.BLACK && field[i][j+2]==State.BLACK)
				{
					gewonnen = true;
				}
				if(field[i][j] == State.BLACK && field[i+1][j] == State.BLACK && field[i+1][j]==State.BLACK)
				{
					gewonnen = true;
				}
				
			}
		}
    	return gewonnen;
    }
    
    public boolean unentschieden()
    {
    	boolean gleichstand = true;
    	if(gewonnen())
    	{
    		gleichstand = false;
    	}
    	return gleichstand;
    }
	
    
    
}
