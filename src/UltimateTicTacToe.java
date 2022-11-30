/**
 * 
 * @author Savion 
 * -Make an UltimateTicTacToe class
 *-Make instances of TicTacToe  class
  -Have the UltimateTicTacToe class, BE COMPOSED of TicTacToes
 */
import java.util.Scanner;


public class UltimateTicTacToe extends TicTacToe {
	
	/**
	 * Creates a 2D Array of TicTacToe boards 
	 */ 
	

	private TicTacToe[][] outerBoard; 
	
	
	
	public UltimateTicTacToe() {
		super(); //Calls all original data from TTT
		outerBoard = new TicTacToe[3][3]; //Hard coded since TTT games are 3x3
		
	} 
	
	/**
	 * UTTT will need outerBoard variations of ALL TTT methods!!!
	 */ 
	
	
	public int getBoardRow() throws UTTT_Exception {
		System.out.print("Please enter a valid BOARD row: ");
		int row = input.nextInt();
		if (row >= this.size || row < 0) {
			throw new UTTT_Exception("Invalid row: " + row);
		}
		return row;
	}
	
	/**
	 * 
	 * @return valid column
	 * @throws TicTacToeException When column is out of bounds
	 */
	public int getBoardCol() throws TicTacToeException {
		System.out.print("Please enter a valid column: ");
		
		int col = input.nextInt();
		
		if (col >= size || col < 0) {
			throw new TicTacToeException("Invalid column: " + col);
		}
		return col;
	}
	
}
