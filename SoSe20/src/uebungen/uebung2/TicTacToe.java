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
				if(field[i][j]==State.EMPTY)
				{
					System.out.print("-");
				}
				else
				{
					if(field[i][j]==State.RED)
					{
						System.out.print("x");
					}
					if(field[i][j]==State.BLACK)
					{
						System.out.print("o");
					}
				}
				
			}
			System.out.println();
		}
    	System.out.println();
	}
    
    public boolean gewonnen()
    {
    	for (int i = 0; i < field.length; i++) 
    	{
			if(field[i][0] == field[i][1] 
			&& field[i][1] == field[i][2] 
			&& field[i][0]!= State.EMPTY)
			{
					return true;
			}
			if(field[0][i] == field[1][i] 
			&& field[1][i] == field[2][i] 
			&& field[0][i]!= State.EMPTY)
			{
				return true;
			}
			if(field[1][1] == field[0][0] 
			&& field[0][0] == field[2][2] 
			&& field[1][1]!= State.EMPTY)
			{
				return true;
			}
			if(field[0][2] == field[1][1] 
			&& field[0][0] == field[2][0] 
			&& field[1][1]!= State.EMPTY)
			{
				return true;
			}
		}
    	return false;
    }
    
    public boolean unentschieden()
    {
    	for (int i = 0; i < field.length; i++) 
    	{
			for (int j = 0; j < field.length; j++) 
			if(field[i][j] == State.EMPTY)
			{
				return false;
			}
		}
    	
    	if(!gewonnen())
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
	
    
    
}
