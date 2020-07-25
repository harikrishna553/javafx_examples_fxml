package com.sample.app.widgets.controller;

import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class LabelController implements Initializable {

	@FXML
	private Label label1;

	@FXML
	private Label label2;

	@FXML
	private Label label3;

	@FXML
	private Label label4;

	@FXML
	private Label label5;

	@FXML
	private Label label6;

	@FXML
	private Label label7;

	@FXML
	private VBox vBox1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		vBox1.setEffect(dropShadow);

		label1.setFont(Font.font("Verdana", FontPosture.REGULAR, 45));

		label2.setFont(Font.font("Verdana", FontPosture.ITALIC, 45));

		label3.setFont(Font.font("Verdana", FontPosture.REGULAR, 45));
		label3.setAlignment(Pos.TOP_LEFT);

		label4.setFont(Font.font("Verdana", FontPosture.REGULAR, 45));
		label5.setFont(Font.font("Verdana", FontPosture.REGULAR, 45));

		label6.setFont(Font.font("Verdana", FontPosture.REGULAR, 45));

		label7.setFont(Font.font("Verdana", FontPosture.REGULAR, 45));
		String filename = "javaIcon.png";
		InputStream in = this.getClass().getClassLoader().getResourceAsStream(filename);
		Image image = new Image(in);
		ImageView imageView = new ImageView(image);
		label7.setGraphic(imageView);
		label7.setContentDisplay(ContentDisplay.RIGHT);

	}

}