public class TicTacToeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe ttt = new TicTacToe();
		
		///Will run TTT for A SINGLE turn
		//	ttt.start(); 
		
		
		//Loops until finished:
		do {
			ttt.start('x');
		} 
		
		while (ttt.getWin() == false);
	}

};