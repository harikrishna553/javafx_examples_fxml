package com.sample.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloWorldCss extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Text text = new Text("Learning JavaFX");
		text.setId("myText");

		StackPane stackPane = new StackPane();
		stackPane.getChildren().addAll(text);

		Scene scene = new Scene(stackPane, 500, 500, Color.WHITE);
		String cssFile = HelloWorldCss.class.getResource("/hello.css").toExternalForm();
		scene.getStylesheets().add(cssFile);

		primaryStage.setTitle("StackPane Demo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String args[]) {
		launch(args);
	}
}