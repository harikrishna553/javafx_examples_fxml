package com.sample.app.layout.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class HBoxVBoxController implements Initializable {

	@FXML
	private VBox vBox1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		vBox1.setEffect(dropShadow);
	}

}