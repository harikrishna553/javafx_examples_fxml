package com.sample.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StackPaneDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Rectangle rectangle = new Rectangle(300, 100, Color.GRAY);
		rectangle.setArcHeight(30);
		rectangle.setArcWidth(30);

		Text text = new Text("Hello World");
		text.setFill(Color.LIGHTSALMON);
		text.setFont(Font.font(null, FontWeight.SEMI_BOLD, 30));

		StackPane stackPane = new StackPane();
		stackPane.getChildren().addAll(rectangle, text);

		Scene scene = new Scene(stackPane, 500, 500, Color.WHITE);

		primaryStage.setTitle("StackPane Demo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String args[]) {
		launch(args);
	}
}