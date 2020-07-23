package com.sample.app.effects.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.DisplacementMap;
import javafx.scene.effect.FloatMap;
import javafx.scene.text.Text;

public class DisplacementMapController implements Initializable {

	@FXML
	private Text text1;

	@FXML
	private Text text2;

	@FXML
	private Text text3;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		int width = 300;
		int height = 100;

		FloatMap floatMap1 = new FloatMap(300, 100);
		FloatMap floatMap2 = new FloatMap(300, 100);
		FloatMap floatMap3 = new FloatMap(300, 100);

		for (int i = 0; i < width; i++) {
			double v1 = (Math.sin(i / 20.0 * Math.PI) - 0.5) / 40.0;
			double v2 = (Math.sin(i / 30.0 * Math.PI) - 0.5) / 40.0;
			double v3 = (Math.sin(i / 40.0 * Math.PI) - 0.5) / 40.0;
			for (int j = 0; j < height; j++) {
				floatMap1.setSamples(i, j, 0.0f, (float) v1);
				floatMap2.setSamples(i, j, 0.0f, (float) v2);
				floatMap3.setSamples(i, j, 0.0f, (float) v3);
			}
		}

		DisplacementMap displacementMap1 = new DisplacementMap(floatMap1);
		displacementMap1.setScaleX(5);
		displacementMap1.setScaleY(2);

		DisplacementMap displacementMap2 = new DisplacementMap(floatMap2);
		displacementMap2.setScaleX(5);
		displacementMap2.setScaleY(2);

		DisplacementMap displacementMap3 = new DisplacementMap(floatMap3);
		displacementMap3.setScaleX(5);
		displacementMap3.setScaleY(2);

		text1.setEffect(displacementMap1);
		text2.setEffect(displacementMap2);
		text3.setEffect(displacementMap3);

	}

}