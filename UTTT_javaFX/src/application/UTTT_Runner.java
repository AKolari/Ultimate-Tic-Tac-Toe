package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class UTTT_Runner extends Application {
	
	public static void main(String[] args) {
		launch(args);
		
		// TODO Auto-generated method stub
		UltimateTicTacToe ttt = new UltimateTicTacToe();
			ttt.UTTT_start(); 
//			ttt.UTTT_loop(); 
		
		do {
			ttt.UTTT_loop();
		} 
		
		while (ttt.getWin() == false);
		

	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			/* 
			 * 
			 * @author Steven
			 */
			BorderPane root = new BorderPane();
			Scene stage = new Scene(root,500,500);
			stage.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(stage);
			primaryStage.setTitle("Ultimate Tic-Tac-Toe!");
			
			//Cols
			Label col1 = new Label("Col 1");
			Label col2 = new Label("Col 2");
			Label col3 = new Label("Col 3");
			Label col4 = new Label("Col 4");
			Label col5 = new Label("Col 5");
			Label col6 = new Label("Col 6");
			Label col7 = new Label("Col 7");
			Label col8 = new Label("Col 8");
			Label col9 = new Label("Col 9");
			//Rows
			Label row1 = new Label("Row 1");
			Label row2 = new Label("Row 2");
			Label row3 = new Label("Row 3");
			Label row4 = new Label("Row 4");
			Label row5 = new Label("Row 5");
			Label row6 = new Label("Row 6");
			Label row7 = new Label("Row 7");
			Label row8 = new Label("Row 8");
			Label row9 = new Label("Row 9");
			Button testButton = new Button("Start game?");
			GridPane pane = new GridPane();
			pane.setHgap(30);
			pane.setVgap(30);
			
			pane.add(col1, 0, 0);
			pane.add(col2, 1, 0);
			pane.add(col3, 2, 0);
			pane.add(col4, 3, 0);
			pane.add(col5, 4, 0);
			pane.add(col6, 5, 0);
			pane.add(col7, 6, 0);
			pane.add(col8, 7, 0);
			pane.add(col9, 8, 0);
			
			
			pane.add(row1, 0, 0);
			pane.add(row2, 0, 1);
			pane.add(row3, 0, 2);
			pane.add(row4, 0, 3);
			pane.add(row5, 0, 4);
			pane.add(row6, 0, 5);
			pane.add(row7, 0, 6);
			pane.add(row8, 0, 7);
			pane.add(row9, 0, 8);
			
			
			pane.add(testButton, 9, 5);
			
			pane.setAlignment(Pos.CENTER);
			Scene scene = new Scene(pane,700,700);
			primaryStage.setScene(scene);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
