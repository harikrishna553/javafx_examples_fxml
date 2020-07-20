package com.sample.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RoundedRectangleDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Rectangle rectangle1 = new Rectangle(400, 200, Color.GRAY);
		rectangle1.setArcHeight(30);
		rectangle1.setArcWidth(30);
		
		Rectangle rectangle2 = new Rectangle(300, 100, Color.LIGHTBLUE);
		rectangle2.setArcHeight(30);
		rectangle2.setArcWidth(30);

		StackPane stackPane = new StackPane();
		stackPane.getChildren().addAll(rectangle1, rectangle2);

		Scene scene = new Scene(stackPane, 500, 400, Color.WHITE);

		primaryStage.setTitle("Rounded Rectangle Demo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String args[]) {
		launch(args);
	}
}