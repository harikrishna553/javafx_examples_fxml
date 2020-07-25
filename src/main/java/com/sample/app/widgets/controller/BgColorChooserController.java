package com.sample.app.widgets.controller;

import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class BgColorChooserController implements Initializable {

	@FXML
	private Button red;

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
		while (nodes.hasNext()) {
			Node node = nodes.next();

			if (node instanceof Button) {
				Button button = (Button) node;

				button.setFont(font);

			}
		}

		label1.setFont(Font.font("Verdana", FontPosture.REGULAR, 50));
		label1.setPadding(new Insets(20, 20, 20, 20));

		nodes = colorChooserHBox.getChildren().iterator();

		while (nodes.hasNext()) {
			Node node = nodes.next();

			if (node instanceof Button) {
				Button button = (Button) node;
				button.setOnAction((event) -> {

					vBox1.setStyle("-fx-background-color:" + button.getText());
				});
			}
		}

	}
}