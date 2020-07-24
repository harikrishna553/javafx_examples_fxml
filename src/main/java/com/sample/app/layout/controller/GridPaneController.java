package com.sample.app.layout.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class GridPaneController implements Initializable {

	@FXML
	private GridPane gridPane1;

	@FXML
	private Rectangle rectangle1;
	
	@FXML
	private Rectangle rectangle2;

	@FXML
	private Circle circle1;
	
	@FXML
	private Circle circle2;

	@FXML
	private Ellipse ellipse1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		GridPane.setColumnIndex(rectangle1, 0);
		GridPane.setRowIndex(rectangle1, 0);

		GridPane.setColumnIndex(circle1, 1);
		GridPane.setRowIndex(circle1, 0);

		GridPane.setColumnIndex(ellipse1, 2);
		GridPane.setRowIndex(ellipse1, 0);
		GridPane.setColumnSpan(ellipse1, 2);

		GridPane.setColumnIndex(circle2, 2);
		GridPane.setRowIndex(circle2, 1);
		
		GridPane.setColumnIndex(rectangle2, 3);
		GridPane.setRowIndex(rectangle2, 1);
		
		gridPane1.setEffect(dropShadow);
		gridPane1.setAlignment(Pos.TOP_CENTER);
		gridPane1.setPadding(new Insets(20, 20, 20, 20));
		
		gridPane1.setGridLinesVisible(true);
	}

}