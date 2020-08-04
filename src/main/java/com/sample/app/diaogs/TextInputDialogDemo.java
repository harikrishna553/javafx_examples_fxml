package com.sample.app.diaogs;

import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class TextInputDialogDemo extends Application {

	public static void main(String args[]) {
		launch(args);

	}

	Button getInformationButton() {
		Button informationButton = new Button("ClickMe");
		informationButton.setAlignment(Pos.CENTER);
		informationButton.setFont(Font.font("Verdana", FontPosture.REGULAR, 30));
		informationButton.setPadding(new Insets(10));
		informationButton.setStyle("-fx-background-color:salmon");

		informationButton.setOnAction(event -> {
			TextInputDialog dialog = new TextInputDialog();
			dialog.setTitle("User Name");
			dialog.setHeaderText("User Registration");
			dialog.setContentText("Please enter your name:");

			Optional<String> result = dialog.showAndWait();

			result.ifPresent(name -> System.out.println("Your name: " + name));

		});

		return informationButton;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(10);
		dropShadow.setColor(Color.GRAY);

		HBox hBox1 = new HBox();

		Button informationButton = this.getInformationButton();
		informationButton.setEffect(dropShadow);

		hBox1.getChildren().addAll(informationButton);
		hBox1.setPadding(new Insets(20));
		hBox1.setAlignment(Pos.CENTER);
		hBox1.setStyle("-fx-background-color:azure");

		Scene scene = new Scene(hBox1, 300, 200, Color.AZURE);

		primaryStage.setTitle("TextInputDialog Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}