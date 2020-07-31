package com.sample.app.widgets;

import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ScrollBarDemo extends Application {

	private static final int sceneWidth = 500;
	private static final int sceneHeight = 400;

	public void start(Stage stage) throws FileNotFoundException {

		ScrollBar vScroll = new ScrollBar();
		vScroll.setMin(0);
		vScroll.setMax(sceneHeight);
		vScroll.setOrientation(Orientation.VERTICAL);
		vScroll.setPrefHeight(sceneHeight);
		vScroll.setPrefWidth(20);

		ScrollBar hScroll = new ScrollBar();
		hScroll.setMin(0);
		hScroll.setMax(sceneWidth);
		hScroll.setPrefWidth(sceneWidth);
		hScroll.setMaxWidth(sceneWidth);

		InputStream in = this.getClass().getClassLoader().getResourceAsStream("scenary.png");

		Image image = new Image(in);
		ImageView imageView = new ImageView(image);
		// imageView.setFitWidth(sceneWidth);
		// imageView.setFitHeight(sceneHeight);
		imageView.setPreserveRatio(true);

		VBox vBox = new VBox(10);
		vBox.getChildren().addAll(imageView);

		vScroll.valueProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			vBox.setLayoutY(-new_val.doubleValue());
		});

		hScroll.valueProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			vBox.setLayoutX(-new_val.doubleValue());
		});

		Group root = new Group();
		root.getChildren().addAll(vBox, hScroll, vScroll);
		Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.PALEGREEN);
		stage.setTitle("Scroll Bar Example");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String args[]) {
		launch(args);
	}
}
