package com.sample.app.effects;

import java.io.InputStream;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ColorAdjustEffectDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group group = new Group();

		ColorAdjust colorAdjust = new ColorAdjust();
		colorAdjust.setHue(0.7);
		colorAdjust.setContrast(0.2);
		colorAdjust.setBrightness(0.7);
		colorAdjust.setSaturation(0.4);

		String filename = "house.png";
		InputStream in = this.getClass().getClassLoader().getResourceAsStream(filename);

		Image image = new Image(in);
		ImageView imageView = new ImageView(image);
		imageView.setFitWidth(400);
		imageView.setFitHeight(400);
		imageView.setPreserveRatio(true);
		imageView.setEffect(colorAdjust);

		group.getChildren().add(imageView);

		Scene scene = new Scene(group, 400, 400);
		primaryStage.setTitle("Color Adjust Demo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String args[]) {
		launch(args);
	}

}