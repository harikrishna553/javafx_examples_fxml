package com.sample.app.widgets.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PasswordFieldDemoController implements Initializable {

	@FXML
	private Label userNameLabel;

	@FXML
	private Label passwordLabel;

	@FXML
	private Label resultLabel;

	@FXML
	private TextField userNameTextField;

	@FXML
	private TextField passwordTextField;

	@FXML
	private Button signInButton;

	@FXML
	private Button clearButton;

	@FXML
	private void loginAction() {
		String userName = userNameTextField.getText();
		String password = passwordTextField.getText();

		if (password == null || userName == null || userName.trim().isEmpty() || password.trim().isEmpty()) {
			resultLabel.setText("Input shouldn't be empty");
			return;
		}

		if (userName.equals("krishna") && password.equals("krishna")) {
			resultLabel.setText("Welcome Krishna");
			return;
		}

		resultLabel.setText("Wrong Credentials");

	}

	@FXML
	private void clearAction() {
		resultLabel.setText("");
		userNameTextField.clear();
		passwordTextField.clear();

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}