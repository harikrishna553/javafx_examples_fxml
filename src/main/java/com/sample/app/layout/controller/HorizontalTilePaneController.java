package com.sample.app.layout.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;

public class HorizontalTilePaneController  implements Initializable {

	@FXML
	private TilePane tilePane1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		tilePane1.setEffect(dropShadow);
		tilePane1.setAlignment(Pos.TOP_CENTER);
		tilePane1.setPadding(new Insets(20, 20, 20, 20));
	}

}