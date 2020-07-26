package com.sample.app.widgets.controller;

import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class BgColorChooserUsingRadioButtonController implements Initializable {

	@FXML
	private VBox vBox1;

	@FXML
	private HBox colorChooserHBox;

	@FXML
	private Label label1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		vBox1.setEffect(dropShadow);

		colorChooserHBox.setSpacing(10);
		colorChooserHBox.setPadding(new Insets(20, 20, 20, 20));

		Font font = Font.font("Verdana", FontPosture.REGULAR, 25);

		Iterator<Node> nodes = colorChooserHBox.getChildren().iterator();
		colorChooserHBox.setSpacing(10);

		ToggleGroup toggleGroup = new ToggleGroup();

		while (nodes.hasNext()) {
			VBox vBox = (VBox) nodes.next();
			vBox.setSpacing(10);

			Iterator<Node> vBoxNodes = vBox.getChildren().iterator();

			while (vBoxNodes.hasNext()) {
				Node node = vBoxNodes.next();
				if (node instanceof RadioButton) {
					RadioButton button = (RadioButton) node;
					toggleGroup.getToggles().add(button);

					button.setFont(font);

					button.setOnAction((event) -> {
						vBox1.setStyle("-fx-background-color:" + button.getText());
					});

				}
			}

		}

		label1.setFont(Font.font("Verdana", FontPosture.REGULAR, 50));
		label1.setPadding(new Insets(20, 20, 20, 20));

		nodes = colorChooserHBox.getChildren().iterator();

	}
}