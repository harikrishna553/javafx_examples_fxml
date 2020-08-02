package com.sample.app.widgets;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ContextMenuDemo extends Application {

	@Override
	public void start(Stage stage) {
		ContextMenu contextMenu = new ContextMenu();

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		Circle circle = new Circle();
		circle.setRadius(120);
		circle.setFill(Color.AQUA);

		circle.setEffect(dropShadow);

		circle.setOnContextMenuRequested(event -> {
			contextMenu.show(circle, event.getScreenX(), event.getScreenY());
		});

		VBox vBox = new VBox();
		vBox.setPadding(new Insets(80, 0, 0, 140));
		vBox.setSpacing(5);
		vBox.setStyle("-fx-background-color:white");

		vBox.getChildren().addAll(circle);

		MenuItem red = new MenuItem("Red");
		red.setOnAction(event -> {
			circle.setFill(Color.RED);

		});
		MenuItem green = new MenuItem("Green");
		green.setOnAction(event -> {
			circle.setFill(Color.GREEN);
		});

		contextMenu.getItems().addAll(green, red);

		Scene scene = new Scene(vBox, 600, 400);

		stage.setTitle("ContextMenu Demo");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}