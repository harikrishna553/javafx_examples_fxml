package com.sample.app.widgets;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class ToggleButtonDemo extends Application {

	public static void main(String args[]) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		HBox hBox1 = new HBox();
		Label label1 = new Label("Select your gender");
		label1.setFont(Font.font("Verdana", FontPosture.REGULAR, 45));
		hBox1.getChildren().add(label1);
		hBox1.setPadding(new Insets(20, 20, 20, 20));

		ToggleButton maleRadioButton = new ToggleButton("Male");
		maleRadioButton.setAlignment(Pos.CENTER);
		maleRadioButton.setFont(Font.font("Verdana", FontPosture.REGULAR, 30));
		maleRadioButton.setPadding(new Insets(10, 10, 10, 10));

		ToggleButton femaleRadioButton = new ToggleButton("Female");
		femaleRadioButton.setAlignment(Pos.CENTER);
		femaleRadioButton.setFont(Font.font("Verdana", FontPosture.REGULAR, 30));
		femaleRadioButton.setPadding(new Insets(10, 10, 10, 10));

		ToggleGroup toggleGroup = new ToggleGroup();
		toggleGroup.getToggles().addAll(maleRadioButton, femaleRadioButton);

		maleRadioButton.setOnAction((event) -> {
			Toggle selectedToggle = toggleGroup.getSelectedToggle();

			if (selectedToggle == null) {
				showDefaultDialog();
				return;
			}

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Mr....");
			alert.setHeaderText("Hello!!!!");
			alert.setContentText("Male button selected");

			alert.showAndWait();
		});

		femaleRadioButton.setOnAction((event) -> {
			Toggle selectedToggle = toggleGroup.getSelectedToggle();

			if (selectedToggle == null) {
				showDefaultDialog();
				return;
			}
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Madam....");
			alert.setHeaderText("Hello!!!!");
			alert.setContentText("Female button selected");

			alert.showAndWait();
		});

		HBox hBox2 = new HBox();
		hBox2.setSpacing(10);
		hBox2.setPadding(new Insets(20, 20, 20, 20));
		hBox2.getChildren().addAll(maleRadioButton, femaleRadioButton);

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		VBox vBox = new VBox();
		vBox.getChildren().addAll(hBox1, hBox2);
		vBox.setEffect(dropShadow);
		vBox.setStyle("-fx-background-color:lightyellow");

		Scene scene = new Scene(vBox, 500, 500, Color.LIGHTYELLOW);

		primaryStage.setTitle("Toggle Button Demo1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void showDefaultDialog() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Mr or Madam....");
		alert.setHeaderText("Input Required!!!!");
		alert.setContentText("Please click on Male or Femal button!!!!");

		alert.showAndWait();
	}

}