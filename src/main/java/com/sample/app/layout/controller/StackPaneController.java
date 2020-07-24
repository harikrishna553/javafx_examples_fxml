package com.sample.app.layout.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class StackPaneController implements Initializable {

	@FXML
	private StackPane stackPane1;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);
		

		stackPane1.setEffect(dropShadow);
		stackPane1.setAlignment(Pos.TOP_CENTER);
		stackPane1.setPadding(new Insets(20, 20, 20, 20));

	}

}