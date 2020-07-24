package com.sample.app.layout.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

public class HorizontalFlowPaneController implements Initializable {

	@FXML
	private FlowPane flowPane1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		flowPane1.setEffect(dropShadow);
		flowPane1.setAlignment(Pos.TOP_CENTER);
		flowPane1.setPadding(new Insets(20, 20, 20, 20));
	}

}