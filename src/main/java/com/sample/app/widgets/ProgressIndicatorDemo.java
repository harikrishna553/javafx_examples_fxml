package com.sample.app.widgets;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class ProgressIndicatorDemo extends Application {

	public static void main(String args[]) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		HBox hBox1 = new HBox();
		Label label1 = new Label("Move slider, same will show in progress indicator");
		label1.setFont(Font.font("Verdana", FontPosture.REGULAR, 20));
		hBox1.getChildren().add(label1);
		hBox1.setPadding(new Insets(20, 20, 20, 20));

		HBox hBox2 = new HBox();
		hBox2.setPadding(new Insets(20, 20, 20, 20));
		hBox2.setSpacing(30);

		Slider slider = new Slider(0, 1, 0);
		slider.setMinHeight(20);
		slider.setMinWidth(50);
		slider.setStyle("-fx-background-color:paleblue");
		slider.setMinSize(400, 30);
		slider.setMajorTickUnit(0.2);
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);

		ProgressIndicator progressIndicator = new ProgressIndicator(0);
		progressIndicator.setMinHeight(300);
		progressIndicator.setMinWidth(300);

		slider.valueProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			progressIndicator.setProgress((Double) new_val);
		});

		hBox2.getChildren().addAll(slider, progressIndicator);

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		VBox vBox = new VBox();
		vBox.getChildren().addAll(hBox1, hBox2);
		vBox.setEffect(dropShadow);

		Scene scene = new Scene(vBox, 800, 500, Color.WHITE);

		primaryStage.setTitle("ProgressIndicator Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}