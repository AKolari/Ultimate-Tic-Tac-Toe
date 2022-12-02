
public class UTTT_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UltimateTicTacToe ttt = new UltimateTicTacToe();
			ttt.UTTT_start(); 
//			 
		
		do {
			ttt.UTTT_loop();
		} 
		
		while (ttt.getWin() == false);
		

} 
	
}
