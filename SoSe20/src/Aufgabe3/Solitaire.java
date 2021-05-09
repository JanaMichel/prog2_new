package Aufgabe3;

public class Solitaire 
{

	    private Moves game;
	    private State[][] field;

	    public Solitaire()
	    {
	        this.game = new Moves();
	        this.field = new State[7][7];
	        for(int row = 0; row < this.field.length; row++)
	        {
	            for(int col = 0; col < this.field[row].length; col++)
	            {
	                if((row < 2 || row > 4) && (col < 2 || col > 4))
	                {
	                    this.field[row][col] = State.NOT;
	                }
	                else
	                {
	                    this.field[row][col] = State.USED;
	                }
	            }
	        }
	        this.field[3][3] = State.FREE;
	    }

	    /*
	     * Geben Sie das Spielfeld aus! Am Anfang sollte auf der
	     * Konsole so ein Bild erscheinen:
	     *     o o o     
	     *     o o o     
	     * o o o o o o o 
	     * o o o   o o o 
	     * o o o o o o o 
	     *     o o o     
	     *     o o o 
	     * 
	     */
	    public void print()
	    {
	    	for(int row = 0; row < this.field.length; row++)
	        {
	            for(int col = 0; col < this.field[row].length; col++)
	            {
	                if(this.field[row][col]==State.NOT || this.field[row][col]==State.FREE)
	                {
	                    System.out.print("  ");
	                }
	                else
	                {
	                    System.out.print("o ");
	                }
	            }
	            System.out.println();
	        }
	    }

	    /*
	     * diese Methode gibt ein true zurueck, wenn von der
	     * uebergebenen Position (row,col) ein Zug moeglich ist
	     * d.h. 
	     * 1. auf der angegebenen Position muss ein Stein sein
	     * 2. zwei Steine weiter (oben, unten, rechts oder links)
	     *      darf kein Stein sein
	     * 3. dazwischen muss ein Stein sein
	     */
	    public boolean possibleFrom(int row, int col)
	    {
	    	if(row>=0 && row<7 && col>=0 && col<7 && this.field[row][col] == State.USED)
	    	{
	    		if(this.field[row][col+2]==State.FREE && col <5 && this.field[row][col+1]==State.USED) return true;
		    	if(this.field[row][col-2]==State.FREE && col >1 && this.field[row][col-1]==State.USED) return true;
		    	if(this.field[row+2][col]==State.FREE && row <5 && this.field[row+1][col]==State.USED) return true;
		    	if(this.field[row-2][col]==State.FREE && row >1 && this.field[row-1][col]==State.USED) return true;
	    	}
	    	
	        return false;
	    }

	    /*
	     * diese Methode gibt alle Positionen (Point) zurueck,
	     * AUF die von (fromRow,fromCol) aus gesprungen werden
	     * kann
	     */
	    public Point[] possibleTo(int fromRow, int fromCol)
	    {
	        int PointsGesamt = 0;
	    	if(!possibleFrom(fromRow, fromCol)) return new Point[PointsGesamt];
	    	if((this.field[fromRow][fromCol+2]==State.FREE && fromCol <5 && this.field[fromRow][fromCol+1]==State.USED) 
	    	  || (this.field[fromRow][fromCol-2]==State.FREE && fromCol >1 && this.field[fromRow][fromCol-1]==State.USED) 
	    	  || (this.field[fromRow+2][fromCol]==State.FREE && fromRow <5 && this.field[fromRow+1][fromCol]==State.USED) 
	    	  || (this.field[fromRow-2][fromCol]==State.FREE && fromRow >1 && this.field[fromRow-1][fromCol]==State.USED))
	    	  {
	    		  PointsGesamt++; //Anzahl/Länge des Punkte-Array festlegen
	    	  }
	  
	    	boolean up = fromRow > 1 && this.field[fromRow-1][fromCol] == State.USED && this.field[fromRow-2][fromCol] == State.FREE;
		    boolean down = fromRow < 5 && this.field[fromRow+1][fromCol] == State.USED && this.field[fromRow+2][fromCol] == State.FREE;
		    boolean right = fromCol < 5 && this.field[fromRow][fromCol+1] == State.USED && this.field[fromRow][fromCol+2] == State.FREE;
		    boolean left = fromCol > 1 && this.field[fromRow][fromCol-1] == State.USED && this.field[fromRow][fromCol-2] == State.FREE;
		    
		    Point[] a1 = new Point[PointsGesamt];
		    int index = 0;
			if(up) a1[index++] = new Point(fromRow-2, fromCol); //wenn boolean up = true, erstelle neuen Punkt mit index, erhöhe index
			if(down) a1[index++] = new Point(fromRow+2, fromCol); //wenn boolean down = true, erstelle neuen Punkt mit index, erhöhe index
			if(right) a1[index++] = new Point(fromRow, fromCol+2); //wenn boolean right = true, erstelle neuen Punkt mit index, erhöhe index
			if(left) a1[index] = new Point(fromRow, fromCol-2); //wenn boolean left = true, erstelle neuen Punkt mit index, erhöhe index
	        return a1;
	    }

	    /* 
	     * diese Methode erzeugt ein Moves-Objekt
	     * in dieses Moves-Objekt werden mithilfe der
	     * Objektmethode addMove() (aus Moves) alle
	     * moeglichen Zuege hinzugefuegt
	     * (moeglich im aktuellen Zustand von field[][])
	     */
	    public Moves possibleMoves()
	    {
	        Moves possibleMoves = new Moves(); //ein neues Moves-Objekt wird erstellt
	        for (int row = 0; row < this.field.length; row++) 
	        {
				for (int col = 0; col < field.length; col++) 
				{
					if(possibleFrom(row, col)) //wenn eine mögliche form gefunden
					{
						Point from = new Point(row, col); //erstelle einen neuen Punkt
						Point [] pM = this.possibleTo(row, col); //erstelle Punkt array, mit möglichen Zug
						for (int index = 0; index < pM.length; index++) //erhöhe index solange index < pm.length
						{
							Move move = new Move(from, pM[index]); //erzeuge einen neuen move von punkt(from), zu punkt array (possible)
							possibleMoves.addMove(move); //füge diesen Zug hinzu
						}
					}
						
				}
	        }
	        return possibleMoves;
	    }

	    /*
	     * gibt ein true zurueck, wenn im aktuellen Zustand 
	     * von field[][] ueberhaupt noch ein Zug moeglich ist
	     * sonst false
	     */
	    public boolean movePossible()
	    {
	    	for (int row = 0; row < this.field.length; row++) 
	    	{
				for (int col = 0; col < this.field.length; col++) 
				{
					if(possibleFrom(row, col)) //wenn von der aktuellen Position ein Zug möglich
					{							//dann gib true zurück
						return true;
					}
				}
			}
			return false;

	    }

	    /*
	     * ruft die Methode move(Move move) auf,
	     * wenn ein Zug moeglich ist (dann true zurueck)
	     * sonst false
	     */
	    public boolean moveFirstPossible()
	    {
	        if(!movePossible()) return false;
	        /*
	         *  hier einen moeglichen Zug ausfuehren
	         *  den ersten, den Sie finden (siehe
	         *  possibleMoves() )
	         */
	        else
	        {
	        	Moves possible = possibleMoves(); //neue Variable moves, die alle möglichen Züge enthält
	        	possible.printMoves(); //alle möglichen züge werden gedruckt
	        	Move move = possible.getMoveAtIndex(0); //der Zug an index 0 wird ermittelt
	        	move(move); // der erste zug wird ausgeführt
	        	return true;
	        }
	        //possibleMoves();
	        //printMoves();
	        //.getMoveAtIndex(0)
	    }

	    /*
	     * hier wird der Zug Move move ausgefuehrt
	     * nach dem Zug ist 
	     * 
	     * 1. die from-Position leer
	     * 2. die to-Position mit einem Stein besetzt
	     * 3. dazwischen leer (Stein wird "entfernt")
	     * falls Zug nicht moeglich, wird eine 
	     * IllegalArgumentException geworfen 
	     */
	    public void move(Move move) throws IllegalArgumentException
	    {
	    	//Methoden von move: 
	    	//Move(int fromRow, int fromCol, int toRow, int toCol)
	    	//Move(Point from, Point to)
	    	//Point getFrom()
	    	//Point getTo()
	    	
	    	//.getFrom,.getRow,getCol
	    	int middleRow = (move.getFrom().getRow() + move.getTo().getRow()) / 2;
			int middleCol = ( move.getFrom().getCol() + move.getTo().getCol()) / 2;
			try {
				this.field[move.getFrom().getRow()][move.getFrom().getCol()] = State.FREE;
				this.field[middleRow][middleCol] = State.FREE;
				this.field[move.getTo().getRow()][move.getTo().getCol()] = State.USED;	
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				throw new IllegalArgumentException("Move is not possible(" + move.getFrom().getRow() + ", " + move.getFrom().getCol() + ") --> "
						+ "( " + move.getTo().getRow() + ", " + move.getTo().getCol() + ") ");
			}

	    }

	

}
