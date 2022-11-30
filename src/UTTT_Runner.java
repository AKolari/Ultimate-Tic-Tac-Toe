
public class UTTT_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UltimateTicTacToe ttt = new UltimateTicTacToe();
		
		///Will run TTT for A SINGLE turn
		//	ttt.start(); 
		
		
		//Loops until finished:
		do {
			ttt.start();
		} 
		
		while (ttt.getWin() == false);
	}

}
