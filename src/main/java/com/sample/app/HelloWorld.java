package com.sample.app;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloWorld extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Hello World");

		Group group = new Group();

		Scene scene = new Scene(group, 500, 500, Color.AZURE);

		primaryStage.setScene(scene);

		primaryStage.show();

	}

	public static void main(String args[]) {
		launch(args);
	}

}
