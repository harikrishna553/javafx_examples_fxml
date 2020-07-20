package com.sample.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LineDemo extends Application {

	public static void main(String args[]) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = (Parent) FXMLLoader.load(LineDemo.class.getResource("/lineDemo.fxml"));

		Scene scene = new Scene(root, 400, 300, Color.WHITE);

		primaryStage.setTitle("Line Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
