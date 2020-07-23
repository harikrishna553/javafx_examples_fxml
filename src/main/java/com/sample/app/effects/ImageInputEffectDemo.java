package com.sample.app.effects;

import java.io.InputStream;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ImageInputEffectDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		String filename = "house.png";
		InputStream in = this.getClass().getClassLoader().getResourceAsStream(filename);
		Image image = new Image(in, 350, 350, true, true);

		ImageInput imageInput = new ImageInput(image, 50, 50);

		BoxBlur boxBlur = new BoxBlur(5, 10, 10);
		boxBlur.setInput(imageInput);

		Group group = new Group();
		group.setEffect(boxBlur);

		Scene scene = new Scene(group, 400, 400);
		primaryStage.setTitle("Image Input Demo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String args[]) {
		launch(args);
	}

}