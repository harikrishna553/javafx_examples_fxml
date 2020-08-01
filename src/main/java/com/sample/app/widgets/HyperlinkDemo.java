package com.sample.app.widgets;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class HyperlinkDemo extends Application {

	public static void main(String args[]) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Insets insets = new Insets(10, 10, 10, 10);

		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.TOP_CENTER);
		gridPane.setPadding(new Insets(20, 20, 20, 20));
		gridPane.setStyle("-fx-background-color:white");

		Hyperlink google = new Hyperlink("https://www.google.com/");
		google.setFont(Font.font("Verdana", FontPosture.ITALIC, 25));
		google.setPadding(insets);

		Hyperlink java = new Hyperlink("https://self-learning-java-tutorial.blogspot.com/");
		java.setFont(Font.font("Verdana", FontPosture.ITALIC, 25));
		java.setPadding(insets);

		google.setOnAction((event) -> {
			getHostServices().showDocument(google.getText());
		});

		java.setOnAction((event) -> {
			getHostServices().showDocument(java.getText());
		});

		Label googleLabel = new Label("Oracle");
		googleLabel.setFont(Font.font("Verdana", 25));
		googleLabel.setPadding(insets);

		Label javaLabel = new Label("Self learning Java");
		javaLabel.setFont(Font.font("Verdana", 25));
		javaLabel.setPadding(insets);

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		gridPane.setEffect(dropShadow);

		gridPane.getChildren().addAll(google, java, googleLabel, javaLabel);

		GridPane.setConstraints(googleLabel, 0, 0);
		GridPane.setConstraints(javaLabel, 0, 1);
		GridPane.setConstraints(google, 1, 0);
		GridPane.setConstraints(java, 1, 1);

		Scene scene = new Scene(gridPane, 1000, 300, Color.WHITE);

		primaryStage.setTitle("Hyperlink Demo 1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}