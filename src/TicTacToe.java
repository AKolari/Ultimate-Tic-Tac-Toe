import java.util.Scanner;

public class TicTacToe {

	private char[][] board;
	private char currentPlayer;
	private int size;
	private Scanner input;
	private boolean win;
	
	public TicTacToe(int n) {
		size = n;
		board = new char[n][n];
		currentPlayer = 'x';
		input = new Scanner(System.in);
	}
	
	public void start() {
		//Game Logic.
		System.out.println("Welcome to CSC330 Tic Tac Toe!");
		initializeBoard();
		do {
			printBoard();     //print board
			System.out.println("It is " + currentPlayer + "'s turn.");
			//Get input.
			int row, col;
			do {
				try {
					row = getRow();
				} catch (TicTacToeException ttte) {
					System.out.println(ttte.getMessage());
					row = -1;
				}
				try {
					col = getCol();
				} catch (TicTacToeException ttte) {
					System.out.println(ttte.getMessage());
					col = -1;
				}
				if (row != -1 && col != -1 && isOccupied(row, col)) {
					System.out.println("That location is occupied. Try again.");
				}
			} while(row == -1 || col == -1 || isOccupied(row, col));
			//We have a valid row and column.
			board[row][col] = currentPlayer;
			win = isWinner();
			if (win) {
				System.out.println("Congratulations! " + currentPlayer + " wins!!!");
			} else {
				changePlayer();
			}
			if (isDraw()) {
				System.out.println("DRAW! No one has won. I guess the only way to win is to not play the game.");
			}			
		} while (!win && !isDraw());
		System.out.println("GAME OVER.");
	}
	
	public void initializeBoard() {
		for(int r = 0; r < size; r++) {
			for(int c = 0; c < size; c++) {
				board[r][c] = ' ';
			}
		}
	}
	
	public void printBoard() {	
		System.out.println("Here is the current board:\n");
		for(int r = 0; r < size; r++) {
			System.out.print("|");
			for(int c = 0; c < size; c++) {
				System.out.print(board[r][c]);
				if (c < size) {
					System.out.print("|");
				}				
			}
			System.out.println();
			if (r < size-1) {
				for(int i = 0; i < 7; i++) {
					System.out.print('-');
				}
			}
			System.out.println();
		}
	}
	
	public int getRow() throws TicTacToeException {
		System.out.print("Please enter a valid row: ");
		int row = input.nextInt();
		if (row >= size || row < 0) {
			throw new TicTacToeException("Invalid row: " + row);
		}
		return row;
	}
	
	public int getCol() throws TicTacToeException {
		System.out.print("Please enter a valid column: ");
		int col = input.nextInt();
		if (col >= size || col < 0) {
			throw new TicTacToeException("Invalid column: " + col);
		}
		return col;
	}
	
	public boolean isOccupied(int row, int col) {
		return board[row][col] == 'x' || board[row][col] == 'o';
	}
	
	public boolean isWinner() {
		//sum checks
		int sum;
		//check horizontals
		for(int row = 0; row < size; row++) {
			sum = 0;
			for(int col = 0; col < size; col++) {
				if (board[row][col] == currentPlayer) {
					sum++;
				}
			}
			//Done with the row
			if (sum == size) return true;
		}
		//check verticals
		for(int col = 0; col < size; col++) {
			sum = 0;
			for(int row = 0; row < size; row++) {
				if (board[row][col] == currentPlayer) {
					sum++;
				}
			}
			//Done with the row
			if (sum == size) return true;
		}
		//check minor diagonal
		sum = 0;
		for(int i = 0; i < size; i++) {
			if (board[i][i] == currentPlayer) sum++;
		}
		if (sum == size) return true;
		sum = 0;
		for(int i = 0; i < size; i++) {
			if (board[size-i-1][i] == currentPlayer) sum++;
		}		
		return sum == size;		
	}
	
	public boolean isDraw() {
		for(int row = 0; row < size; row++) {			
			for(int col = 0; col < size; col++) {
				if (board[row][col] == ' ') return false;
			}
		}
		//if we are here, all spaces are occupied
		return true;
	}
	
	public void changePlayer() {
		if (currentPlayer == 'x') currentPlayer = 'o';
		else currentPlayer = 'x';
	}
	
}
