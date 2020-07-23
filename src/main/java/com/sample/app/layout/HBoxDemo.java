package com.sample.app.layout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HBoxDemo extends Application {

	private static final String FXML_FILE = "/hboxDemo.fxml";
	private static final String STAGE_TITLE = "HBox demo";

	public static void main(String args[]) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = (Parent) FXMLLoader.load(this.getClass().getResource(FXML_FILE));

		Scene scene = new Scene(root, 600, 400, Color.LIGHTGRAY);

		primaryStage.setTitle(STAGE_TITLE);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}