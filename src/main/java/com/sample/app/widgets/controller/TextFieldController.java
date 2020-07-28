package com.sample.app.widgets.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class TextFieldController implements Initializable {

	@FXML
	private VBox container;

	@FXML
	private HBox titleHBox;

	@FXML
	private HBox buttonHBox;

	@FXML
	private HBox resultHBox;
	
	@FXML
	private Button squareButton;
	
	@FXML
	private Button cubeButton;
	
	@FXML
	private TextField textField;
	
	@FXML
	private Label result;

	@FXML
	private Label title;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		container.setEffect(dropShadow);
		
		textField.setMinHeight(25);
		textField.setMaxWidth(100);
		
		titleHBox.setSpacing(15);
		titleHBox.setPadding(new Insets(10, 50, 10, 50));
		resultHBox.setPadding(new Insets(10, 50, 10, 50));
		
		buttonHBox.setSpacing(15);
		buttonHBox.setPadding(new Insets(10, 50, 10, 50));
		
		result.setFont(Font.font("Arial", FontPosture.REGULAR, 20));
		title.setFont(Font.font("Arial", FontPosture.REGULAR, 20));
		squareButton.setStyle("-fx-font-size:20");
		cubeButton.setStyle("-fx-font-size:20");

		squareButton.setOnAction((event) -> {
			String data = textField.getText();

			try {
				int dataNum = Integer.valueOf(data);

				result.setText("Result : " + (dataNum * dataNum));
			} catch (Exception e) {
				result.setText("Please Enter Valid integer");
			}
		});

		cubeButton.setOnAction((event) -> {
			String data = textField.getText();

			try {
				int dataNum = Integer.valueOf(data);

				result.setText("Result : " + (dataNum * dataNum * dataNum));
			} catch (Exception e) {
				result.setText("Please Enter Valid integer");
			}
		});

	}
}