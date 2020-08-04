package com.sample.app.diaogs;

import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class ButtonTypeDemo extends Application {

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
			Alert dialog = new Alert(AlertType.INFORMATION);
			dialog.setTitle("Dialog Demo");
			dialog.setHeaderText("Simple Dialog");
			dialog.setContentText("You clicked on " + informationButton.getText() + " button");
			dialog.setResizable(true);
			dialog.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
			dialog.getDialogPane().setMinWidth(Region.USE_PREF_SIZE);

			ButtonType approveButtonType = new ButtonType("Approve");
			ButtonType rejectButtonType = new ButtonType("Reject");
			ButtonType remindMeLaterButtonType = new ButtonType("remindMeLater");

			dialog.getButtonTypes().setAll(approveButtonType, rejectButtonType, remindMeLaterButtonType);

			Optional<ButtonType> result = dialog.showAndWait();
			if (result.get() == approveButtonType) {
				System.out.println("Approve Button is clicked");
			} else if (result.get() == rejectButtonType) {
				System.out.println("Reject Button is clicked");
			} else {
				System.out.println("'Remind me later' Button is clicked");
			}

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

		primaryStage.setTitle("Button Type Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}