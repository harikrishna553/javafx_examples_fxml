package com.sample.app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.shape.Circle;

public class BlendController implements Initializable {

	@FXML
	private Group group1;
	
	@FXML
	private Circle circle1;
	
	@FXML
	private Circle circle2;
	
	@FXML
	private Circle circle3;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Blend blendEffect = new Blend();
		blendEffect.setMode(BlendMode.ADD);

		group1.setEffect(blendEffect);

	}

}