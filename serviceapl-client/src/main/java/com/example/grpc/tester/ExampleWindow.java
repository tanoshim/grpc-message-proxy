package com.example.grpc.tester;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.TextField; 

public class ExampleWindow {

	private static Button button = new Button("send");
	private static TextField textctrl = new TextField(); 
	
	public static void createWindow(Stage primaryStage) {
		StackPane root = new StackPane();
		root.setPadding(new Insets(10, 10, 10, 10));
		StackPane.setMargin(textctrl, new Insets(30, 0, 0, 0));
		StackPane.setAlignment(textctrl, Pos.TOP_CENTER);
		StackPane.setAlignment(button, Pos.BOTTOM_CENTER);
		textctrl.setMaxWidth(200);
		root.getChildren().addAll(button, textctrl);
		Scene scene = new Scene(root, 200, 110);
		primaryStage.setTitle("Client"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
	
	public static String getText() {
		return textctrl.getText();
	}
	
	public static ButtonBase getButton() {
		return button;
	}
	
}
