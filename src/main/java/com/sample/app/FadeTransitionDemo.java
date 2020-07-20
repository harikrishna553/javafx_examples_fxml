package com.sample.app;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeTransitionDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Rectangle rectangle = new Rectangle(300, 100, Color.GRAY);
		rectangle.setArcHeight(30);
		rectangle.setArcWidth(30);

		Text text = new Text("Hello World");
		text.setFill(Color.LIGHTSALMON);
		text.setFont(Font.font(null, FontWeight.SEMI_BOLD, 40));

		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(3), text);
		fadeTransition.setFromValue(2.0);
		fadeTransition.setToValue(0.0);
		fadeTransition.setCycleCount(Animation.INDEFINITE);
		fadeTransition.play();

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


