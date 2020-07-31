package com.sample.app.widgets.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.text.Text;

public class SliderDemoController implements Initializable {

	@FXML
	private Text text;

	@FXML
	private Slider slider;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		slider.valueProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			text.setOpacity((Double) new_val);
		});

		
		slider.setMinSize(400, 30);
		slider.setMajorTickUnit(0.2);
		slider.setValue(0.5);
	}

}