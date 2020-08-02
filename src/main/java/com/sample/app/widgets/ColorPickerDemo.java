package com.sample.app.widgets;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ColorPickerDemo extends Application {

	@Override
	public void start(Stage stage) {

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		Circle circle = new Circle();
		circle.setRadius(120);
		circle.setFill(Color.AQUA);

		circle.setEffect(dropShadow);

		HBox hBox1 = new HBox();

		Label label = new Label("Choose color");
		label.setFont(Font.font("Verdana", 15));

		ColorPicker colorPicker = new ColorPicker();

		colorPicker.setOnAction(event -> {
			Color color = colorPicker.getValue();
			circle.setFill(color);
		});

		hBox1.getChildren().addAll(label, colorPicker);
		hBox1.setSpacing(25);

		VBox vBox = new VBox();
		vBox.setPadding(new Insets(80, 0, 0, 140));
		vBox.setSpacing(25);
		vBox.setStyle("-fx-background-color:white");

		vBox.getChildren().addAll(circle, hBox1);

		Scene scene = new Scene(vBox, 600, 400);

		stage.setTitle("ColorPicker Demo");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}