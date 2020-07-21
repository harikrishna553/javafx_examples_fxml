package com.sample.app.effects.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.text.Text;

public class LightingController implements Initializable {

	@FXML
	private Text text1;
	
	@FXML
	private Text text2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Light.Distant distantLight = new Light.Distant();
		distantLight.setAzimuth(160);

		Lighting lighting = new Lighting(distantLight);
		lighting.setSurfaceScale(10);

		text1.setEffect(lighting);

	}

}

