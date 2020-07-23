package com.sample.app.effects;

import java.io.InputStream;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ChainEffectDemo extends Application {

	private static final String STAGE_TITLE = "Chain effect Demo";

	public static void main(String args[]) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Reflection reflection = new Reflection(0.3, 1.0, 0.2, 0.5);

		PerspectiveTransform perspectiveTrasform = new PerspectiveTransform();
		perspectiveTrasform.setUlx(10.0);
		perspectiveTrasform.setUly(10.0);
		perspectiveTrasform.setUrx(350.0);
		perspectiveTrasform.setUry(100.0);
		perspectiveTrasform.setLrx(400.0);
		perspectiveTrasform.setLry(450.0);
		perspectiveTrasform.setLlx(10.0);
		perspectiveTrasform.setLly(550.0);

		perspectiveTrasform.setInput(reflection);

		String filename = "house.png";
		InputStream in = this.getClass().getClassLoader().getResourceAsStream(filename);

		Image image = new Image(in);
		ImageView imageView = new ImageView(image);
		imageView.setFitWidth(400);
		imageView.setFitHeight(400);
		imageView.setPreserveRatio(true);
		imageView.setEffect(perspectiveTrasform);

		Group g = new Group();

		g.getChildren().addAll(imageView);

		Scene scene = new Scene(g, 500, 600, Color.WHITE);

		primaryStage.setTitle(STAGE_TITLE);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}