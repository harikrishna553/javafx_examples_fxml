package com.sample.app.widgets.controller;

import java.net.URL;
import java.util.*;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class CheckBoxController implements Initializable {

	@FXML
	private VBox vBox1;

	@FXML
	private HBox vegetableChooserHBox;

	@FXML
	private Label selectedVegetables;

	@FXML
	private Label title;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		vBox1.setEffect(dropShadow);
		vBox1.setStyle("-fx-background-color:lightyellow");

		vegetableChooserHBox.setSpacing(10);
		vegetableChooserHBox.setPadding(new Insets(20, 20, 20, 80));

		Font font = Font.font("Verdana", FontPosture.REGULAR, 25);

		Iterator<Node> nodes = vegetableChooserHBox.getChildren().iterator();
		vegetableChooserHBox.setSpacing(10);
		List<CheckBox> checkBoxes = new ArrayList<>();

		while (nodes.hasNext()) {
			VBox vBox = (VBox) nodes.next();
			vBox.setSpacing(10);

			Iterator<Node> vBoxNodes = vBox.getChildren().iterator();

			while (vBoxNodes.hasNext()) {
				Node node = vBoxNodes.next();
				if (node instanceof CheckBox) {
					CheckBox checkBox = (CheckBox) node;
					checkBoxes.add(checkBox);

					checkBox.setFont(font);

					checkBox.setOnAction((event) -> {
						StringJoiner stringJoiner = new StringJoiner(",");

						for (CheckBox checkBoxTemp : checkBoxes) {
							if (checkBoxTemp.isSelected()) {
								stringJoiner.add(checkBoxTemp.getText());
							}
						}

						String info = "Selected items are : " + stringJoiner.toString();
						selectedVegetables.setText(info);

					});

				}
			}

		}

		title.setFont(Font.font("Verdana", FontPosture.REGULAR, 50));
		title.setPadding(new Insets(20, 20, 20, 20));

		selectedVegetables.setFont(Font.font("Verdana", FontPosture.ITALIC, 25));
		selectedVegetables.setTextFill(Color.BLUE);
		selectedVegetables.setPadding(new Insets(20, 20, 20, 20));

	}
}