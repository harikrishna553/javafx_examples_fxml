package com.sample.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RectangleDemo extends Application {

	public static void main(String args[]) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = (Parent) FXMLLoader.load(RectangleDemo.class.getResource("/rectangleDemo.fxml"));

		Scene scene = new Scene(root, 600, 300, Color.WHITE);

		primaryStage.setTitle("Rectangle Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
