
public class UTTT_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UltimateTicTacToe ttt = new UltimateTicTacToe();
			ttt.UTTT_start(); 
//			ttt.UTTT_loop(); 
		
		do {
			ttt.UTTT_loop();
		} 
		
		while (ttt.getWin() == false);
		

} 
	
}
