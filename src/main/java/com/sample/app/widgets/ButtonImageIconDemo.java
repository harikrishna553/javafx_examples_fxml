package com.sample.app.widgets;

import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class ButtonImageIconDemo extends Application {

	public static void main(String args[]) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		HBox hBox1 = new HBox();
		Label label1 = new Label("Simple button demo");
		label1.setFont(Font.font("Verdana", FontPosture.REGULAR, 45));
		hBox1.getChildren().add(label1);
		hBox1.setPadding(new Insets(20, 20, 20, 20));

		Button button1 = new Button("about me");
		button1.setAlignment(Pos.CENTER);
		button1.setFont(Font.font("Verdana", FontPosture.REGULAR, 30));
		button1.setPadding(new Insets(10, 10, 10, 10));

		String filename = "javaIcon.png";
		InputStream in = this.getClass().getClassLoader().getResourceAsStream(filename);
		Image image = new Image(in);
		ImageView imageView = new ImageView(image);

		button1.setGraphic(imageView);
		button1.setContentDisplay(ContentDisplay.RIGHT);
		// button1.setMaxHeight(50);
		// button1.setMaxWidth(100);
		button1.setOnAction((event) -> {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("About JavaFX");
			alert.setContentText("Welcome to JavaFX Tutorial series");

			alert.showAndWait();
		});

		HBox hBox2 = new HBox();
		hBox2.setSpacing(10);
		hBox2.setPadding(new Insets(20, 20, 20, 20));
		hBox2.getChildren().addAll(button1);

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		VBox vBox = new VBox();
		vBox.getChildren().addAll(hBox1, hBox2);
		vBox.setEffect(dropShadow);

		Scene scene = new Scene(vBox, 500, 500, Color.WHITE);

		primaryStage.setTitle("Button Demo 1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}