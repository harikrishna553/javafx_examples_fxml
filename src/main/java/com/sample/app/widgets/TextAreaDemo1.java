package com.sample.app.widgets;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class TextAreaDemo1 extends Application {

	public static void main(String args[]) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		HBox hBox1 = new HBox();
		Label label1 = new Label("Enter some text in TextArea and select respective font");
		label1.setFont(Font.font("Verdana", FontPosture.REGULAR, 20));
		hBox1.getChildren().add(label1);
		hBox1.setPadding(new Insets(20, 20, 20, 20));

		HBox hBox2 = new HBox();
		hBox2.setPadding(new Insets(20, 20, 20, 20));
		hBox2.setSpacing(30);

		TextArea textArea = new TextArea();
		textArea.setMinWidth(250);
		textArea.setMinHeight(250);
		textArea.setFont(Font.font("Verdana", 20));

		hBox2.getChildren().addAll(textArea);

		HBox hBox3 = new HBox();
		hBox3.setSpacing(20);
		hBox3.setPadding(new Insets(20, 20, 20, 20));

		Button copyButton = new Button("Copy");
		copyButton.setOnAction((event) -> {
			textArea.copy();
		});

		Button pastButton = new Button("Paste");
		pastButton.setOnAction((event) -> {
			textArea.paste();
		});

		Button cutButton = new Button("Cut");
		cutButton.setOnAction((event) -> {
			textArea.cut();
		});

		Button undoButton = new Button("Undo");
		undoButton.setOnAction((event) -> {
			textArea.undo();
		});

		Button selectAllButton = new Button("Select All");
		selectAllButton.setOnAction((event) -> {
			textArea.selectAll();
		});

		hBox3.getChildren().addAll(copyButton, cutButton, pastButton, undoButton, selectAllButton);

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		VBox vBox = new VBox();
		vBox.getChildren().addAll(hBox1, hBox2, hBox3);
		vBox.setEffect(dropShadow);

		Scene scene = new Scene(vBox, 600, 500, Color.WHITE);

		primaryStage.setTitle("TextArea Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}