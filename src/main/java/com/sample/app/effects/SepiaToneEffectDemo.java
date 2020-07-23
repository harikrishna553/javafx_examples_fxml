package com.sample.app.effects;

import java.io.InputStream;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ImageInput;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class SepiaToneEffectDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		String filename = "house.png";
		InputStream in = this.getClass().getClassLoader().getResourceAsStream(filename);
		Image image = new Image(in, 400, 400, true, true);

		ImageInput imageInput = new ImageInput(image, 0, 0);

		SepiaTone sepiaToneEffect = new SepiaTone(1.0);
		sepiaToneEffect.setInput(imageInput);

		Group group = new Group();
		group.setEffect(sepiaToneEffect);

		Scene scene = new Scene(group, 400, 400);
		primaryStage.setTitle("SepiaTone effect Demo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String args[]) {
		launch(args);
	}

}