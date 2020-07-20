package com.sample.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CircleDemo  extends Application {

	public static void main(String args[]) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = (Parent) FXMLLoader.load(CircleDemo.class.getResource("/circleDemo.fxml"));

		Scene scene = new Scene(root, 600, 300, Color.WHITE);

		primaryStage.setTitle("Circle Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
