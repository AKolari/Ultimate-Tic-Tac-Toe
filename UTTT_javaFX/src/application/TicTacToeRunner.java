package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


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