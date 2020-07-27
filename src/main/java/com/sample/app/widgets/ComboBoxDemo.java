package com.sample.app.widgets;

import javafx.application.Application;
import javafx.beans.binding.ObjectBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application {

	public static void main(String args[]) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		ObservableList<Object> observableList = FXCollections.observableArrayList("Cricket", "Trekking", "Blogging",
				"Chess");

		HBox hBox1 = new HBox();
		Label label1 = new Label("Please select your hobby");
		label1.setFont(Font.font("Verdana", FontPosture.REGULAR, 30));
		hBox1.getChildren().add(label1);
		hBox1.setPadding(new Insets(20, 20, 20, 20));

		Label selectedHobbies = new Label("");
		selectedHobbies.setFont(Font.font("Verdana", FontPosture.REGULAR, 30));
		selectedHobbies.setTextFill(Color.BLUE);
		selectedHobbies.setWrapText(true);
		selectedHobbies.setEffect(dropShadow);

		ComboBox<String> comboBox = new ComboBox<>();
		comboBox.getItems().addAll("Cricket", "Trekking", "Blogging", "Chess");
		comboBox.getSelectionModel().selectFirst();
		comboBox.setEditable(true);
		comboBox.setVisibleRowCount(3);

		ObjectBinding<String> labelBinding = new ObjectBinding<String>() {

			{
				super.bind(comboBox.valueProperty());
			}

			@Override
			protected String computeValue() {
				String newValue = comboBox.getValue();

				if (newValue != null && !comboBox.getItems().contains(newValue)) {
					comboBox.getItems().add(newValue);
				}

				if (newValue != null) {
					return "Your hobby is : " + newValue;
				}
				
				return "Please choose tour hobby";

			}

		};

		selectedHobbies.textProperty().bind(labelBinding);

		HBox hBox2 = new HBox();
		hBox2.setSpacing(10);
		hBox2.setPadding(new Insets(20, 20, 20, 20));
		hBox2.getChildren().addAll(comboBox);

		HBox hBox3 = new HBox();
		hBox3.setSpacing(10);
		hBox3.setPadding(new Insets(20, 20, 20, 20));
		hBox3.getChildren().addAll(selectedHobbies);

		VBox vBox = new VBox();
		vBox.getChildren().addAll(hBox1, hBox2, hBox3);
		vBox.setEffect(dropShadow);
		vBox.setStyle("-fx-background-color:white");

		Scene scene = new Scene(vBox, 500, 500, Color.WHITE);

		primaryStage.setTitle("ComboBox Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}