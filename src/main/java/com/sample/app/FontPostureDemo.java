package com.sample.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FontPostureDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = (Parent) FXMLLoader.load(FontPostureDemo.class.getResource("/fontPosture.fxml"));

		Scene scene = new Scene(root, 600, 300, Color.WHITE);

		primaryStage.setTitle("Font Posture Demo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String args[]) {
		launch(args);
	}
}