package com.sample.app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Line;

public class LineController implements Initializable {

	@FXML
	private Line line1;
	
	@FXML
	private Line line2;
	
	@FXML
	private Line line3;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		line3.getStrokeDashArray().addAll(15d);
	}

}