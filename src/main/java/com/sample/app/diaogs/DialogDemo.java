package com.sample.app.diaogs;

import java.io.PrintWriter;
import java.io.StringWriter;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class DialogDemo extends Application {

	public static void main(String args[]) {
		launch(args);

	}

	Button getInformationButton() {
		Button informationButton = new Button("Information Dialog");
		informationButton.setAlignment(Pos.CENTER);
		informationButton.setFont(Font.font("Verdana", FontPosture.REGULAR, 30));
		informationButton.setPadding(new Insets(10));
		informationButton.setStyle("-fx-background-color:salmon");

		informationButton.setOnAction(event -> {
			Alert dialog = new Alert(AlertType.INFORMATION);
			dialog.setTitle("Dialog Demo");
			dialog.setWidth(100);
			dialog.setHeight(50);
			dialog.setHeaderText("Simple Dialog");
			dialog.setContentText("You clicked on " + informationButton.getText() + " button");

			dialog.showAndWait();

		});

		return informationButton;
	}

	Button getWarningButton() {
		Button warningButton = new Button("Warning Dialog");
		warningButton.setAlignment(Pos.CENTER);
		warningButton.setFont(Font.font("Verdana", FontPosture.REGULAR, 30));
		warningButton.setPadding(new Insets(10));
		warningButton.setStyle("-fx-background-color:orange");

		warningButton.setOnAction(event -> {
			Alert dialog = new Alert(AlertType.WARNING);
			dialog.setTitle("Dialog Demo");
			dialog.setWidth(100);
			dialog.setHeight(50);
			dialog.setHeaderText("Simple Dialog");
			dialog.setContentText("You clicked on " + warningButton.getText() + " button");

			dialog.showAndWait();

		});

		return warningButton;
	}

	Button getConfirmationButton() {
		Button confirmationButton = new Button("Confirmation Dialog");
		confirmationButton.setAlignment(Pos.CENTER);
		confirmationButton.setFont(Font.font("Verdana", FontPosture.REGULAR, 30));
		confirmationButton.setPadding(new Insets(10));
		confirmationButton.setStyle("-fx-background-color:green");

		confirmationButton.setOnAction(event -> {
			Alert dialog = new Alert(AlertType.CONFIRMATION);
			dialog.setTitle("Dialog Demo");
			dialog.setWidth(100);
			dialog.setHeight(50);
			dialog.setHeaderText("Simple Dialog");
			dialog.setContentText("You clicked on " + confirmationButton.getText() + " button");

			dialog.showAndWait();

		});

		return confirmationButton;
	}

	Button getErrorButton() {
		Button errorButton = new Button("Error Dialog");
		errorButton.setAlignment(Pos.CENTER);
		errorButton.setFont(Font.font("Verdana", FontPosture.REGULAR, 30));
		errorButton.setPadding(new Insets(10));
		errorButton.setStyle("-fx-background-color:red");

		errorButton.setOnAction(event -> {
			Alert dialog = new Alert(AlertType.ERROR);
			dialog.setTitle("Dialog Demo");
			dialog.setWidth(100);
			dialog.setHeight(50);
			dialog.setHeaderText("Simple Dialog");
			dialog.setContentText("You clicked on " + errorButton.getText() + " button");

			Exception ex = new Exception("NullPointer Exception occured");

			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String exceptionText = sw.toString();

			Label label = new Label("The exception stacktrace is:");
			label.setFont(Font.font("Verdana", 15));
			label.setTextFill(Color.RED);

			TextArea textArea = new TextArea(exceptionText);
			textArea.setEditable(false);
			textArea.setWrapText(true);

			textArea.setMaxWidth(Double.MAX_VALUE);
			textArea.setMaxHeight(Double.MAX_VALUE);
			GridPane.setVgrow(textArea, Priority.ALWAYS);
			GridPane.setHgrow(textArea, Priority.ALWAYS);

			VBox vBox = new VBox();
			vBox.getChildren().addAll(label, textArea);
			vBox.setSpacing(10);
			vBox.setPadding(new Insets(10));

			// Set expandable Exception into the dialog pane.
			dialog.getDialogPane().setExpandableContent(vBox);

			dialog.showAndWait();

		});

		return errorButton;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		HBox hBox1 = new HBox();
		Label label1 = new Label("Simple Dialog demo");
		label1.setFont(Font.font("Verdana", FontPosture.REGULAR, 45));
		hBox1.getChildren().add(label1);
		hBox1.setPadding(new Insets(20, 20, 20, 20));

		Button informationButton = this.getInformationButton();
		Button warningButton = this.getWarningButton();
		Button confirmationButton = this.getConfirmationButton();
		Button errorButton = this.getErrorButton();

		GridPane gridPane = new GridPane();
		gridPane.getChildren().addAll(informationButton, warningButton, confirmationButton, errorButton);
		gridPane.setConstraints(informationButton, 0, 0);
		gridPane.setConstraints(warningButton, 1, 0);
		gridPane.setConstraints(confirmationButton, 0, 1);
		gridPane.setConstraints(errorButton, 1, 1);
		gridPane.setPadding(new Insets(50));
		// gridPane.setStyle("-fx-background-color:lightsalmon");
		gridPane.setHgap(20);
		gridPane.setVgap(20);

		VBox vBox = new VBox();
		vBox.getChildren().addAll(hBox1, gridPane);
		vBox.setEffect(dropShadow);
		vBox.setStyle("-fx-background-color:azure");

		Scene scene = new Scene(vBox, 800, 500, Color.AZURE);

		primaryStage.setTitle("Dialog Demo 1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}