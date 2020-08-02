package com.sample.app.widgets;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DatePickerDemo extends Application {

	@Override
	public void start(Stage stage) {

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		HBox hBox1 = new HBox();
		HBox hBox2 = new HBox();
		HBox hBox3 = new HBox();

		Label label = new Label("Select your date of birth");
		label.setFont(Font.font("Verdana", 15));

		Label result = new Label();
		result.setFont(Font.font("Verdana", 15));

		DatePicker datePicker = new DatePicker();

		datePicker.setOnAction(event -> {
			LocalDate localDate = datePicker.getValue();

			String month = localDate.getMonth().toString();
			int dayOfMonth = localDate.getDayOfMonth();
			int year = localDate.getYear();

			String resultStr = "You born on " + month + " " + dayOfMonth + ", " + year;

			result.setText(resultStr);
		});

		hBox1.getChildren().add(label);
		hBox1.setSpacing(25);

		hBox2.getChildren().add(datePicker);
		hBox2.setSpacing(25);

		hBox3.getChildren().add(result);
		hBox3.setSpacing(25);

		VBox vBox = new VBox();
		vBox.setPadding(new Insets(80, 0, 0, 140));
		vBox.setSpacing(25);
		vBox.setStyle("-fx-background-color:white");

		vBox.getChildren().addAll(hBox1, hBox2, hBox3);

		Scene scene = new Scene(vBox, 600, 400);

		stage.setTitle("DatePicker Demo");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}