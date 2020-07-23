package com.sample.app.layout.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class HBoxController implements Initializable {

	@FXML
	private Circle circle1;

	@FXML
	private Rectangle rectangle1;

	@FXML
	private Ellipse ellipse1;

	@FXML
	private HBox hBox1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		hBox1.setEffect(dropShadow);
	}

}