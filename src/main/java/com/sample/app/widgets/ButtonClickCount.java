package com.sample.app.widgets;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class ButtonClickCount extends Application {

	public static void main(String args[]) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		HBox hBox1 = new HBox();
		Label label1 = new Label("Demo to count number of clicks");
		label1.setFont(Font.font("Verdana", FontPosture.REGULAR, 45));
		hBox1.getChildren().add(label1);
		hBox1.setPadding(new Insets(20, 20, 20, 20));

		Button button1 = new Button("Click Me");
		button1.setAlignment(Pos.CENTER);
		button1.setFont(Font.font("Verdana", FontPosture.REGULAR, 30));
		button1.setPadding(new Insets(10, 10, 10, 10));
		button1.setUserData(0);

		Button button2 = new Button("Click Count");
		button2.setAlignment(Pos.CENTER);
		button2.setFont(Font.font("Verdana", FontPosture.REGULAR, 30));
		button2.setPadding(new Insets(10, 10, 10, 10));

		HBox hBox2 = new HBox();
		hBox2.setSpacing(10);
		hBox2.setPadding(new Insets(20, 20, 20, 20));
		hBox2.getChildren().addAll(button1, button2);
		
		button1.setOnAction((event) -> {
			Integer userData = (Integer) button1.getUserData();
			userData += 1;

			button1.setUserData(userData);

		});

		button2.setOnAction((event) -> {
			Integer userData = (Integer) button1.getUserData();

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Count Checker");
			alert.setContentText("You clicked " + userData + " times");

			alert.showAndWait();

		});

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		VBox vBox = new VBox();
		vBox.getChildren().addAll(hBox1, hBox2);
		vBox.setEffect(dropShadow);

		Scene scene = new Scene(vBox, 900, 500, Color.WHITE);

		primaryStage.setTitle("Button Demo 1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}