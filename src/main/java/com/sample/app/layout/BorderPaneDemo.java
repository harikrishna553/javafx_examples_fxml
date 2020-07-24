package com.sample.app.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {

	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane borderPane = new BorderPane();

		Text topText = new Text("Top");
		topText.setFont(Font.font("verdana", FontWeight.BOLD, 30));

		Text bottomText = new Text("Bottom");
		bottomText.setFont(Font.font("verdana", FontWeight.BOLD, 30));

		Text leftText = new Text("Left");
		leftText.setFont(Font.font("verdana", FontWeight.BOLD, 30));

		Text rightText = new Text("Right");
		rightText.setFont(Font.font("verdana", FontWeight.BOLD, 30));

		Text centerText = new Text("Center");
		centerText.setFont(Font.font("verdana", FontWeight.BOLD, 30));

		StackPane topStackPane = new StackPane();
		topStackPane.setStyle("-fx-background-color:lightsalmon");
		topStackPane.getChildren().add(topText);
		topStackPane.setPadding(new Insets(15, 15, 15, 15));

		StackPane bottomStackPane = new StackPane();
		bottomStackPane.setStyle("-fx-background-color:lightgreen");
		bottomStackPane.getChildren().add(bottomText);
		bottomStackPane.setPadding(new Insets(15, 15, 15, 15));

		StackPane leftStackPane = new StackPane();
		leftStackPane.setStyle("-fx-background-color:lightyellow");
		leftStackPane.getChildren().add(leftText);
		leftStackPane.setPadding(new Insets(15, 15, 15, 15));

		StackPane rightStackPane = new StackPane();
		rightStackPane.setStyle("-fx-background-color:lightblue");
		rightStackPane.getChildren().add(rightText);
		rightStackPane.setPadding(new Insets(15, 15, 15, 15));

		StackPane centerStackPane = new StackPane();
		centerStackPane.setStyle("-fx-background-color:lightpink");
		centerStackPane.getChildren().add(centerText);
		centerStackPane.setPadding(new Insets(15, 15, 15, 15));

		borderPane.setTop(topStackPane);
		borderPane.setBottom(bottomStackPane);
		borderPane.setLeft(leftStackPane);
		borderPane.setRight(rightStackPane);
		borderPane.setCenter(centerStackPane);

		Scene scene = new Scene(borderPane, 500, 400, Color.WHITE);

		primaryStage.setTitle("Border Pane Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}