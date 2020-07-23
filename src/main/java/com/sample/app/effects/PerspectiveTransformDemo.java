package com.sample.app.effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PerspectiveTransformDemo extends Application {

	private static final String STAGE_TITLE = "PerspectiveTransform Demo";

	public static void main(String args[]) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		PerspectiveTransform perspectiveTrasform = new PerspectiveTransform();
		perspectiveTrasform.setUlx(10.0);
		perspectiveTrasform.setUly(10.0);
		perspectiveTrasform.setUrx(350.0);
		perspectiveTrasform.setUry(30.0);
		perspectiveTrasform.setLrx(350.0);
		perspectiveTrasform.setLry(60.0);
		perspectiveTrasform.setLlx(10.0);
		perspectiveTrasform.setLly(90.0);

		Group g = new Group();
		g.setEffect(perspectiveTrasform);
		g.setCache(true);

		Rectangle rect = new Rectangle();
		rect.setX(10.0);
		rect.setY(10.0);
		rect.setWidth(400.0);
		rect.setHeight(80.0);
		rect.setFill(Color.LIGHTBLUE);

		Text text = new Text();
		text.setX(20.0);
		text.setY(65.0);
		text.setText("Learning JavaFX");
		text.setFill(Color.BLACK);
		text.setFont(Font.font(null, FontWeight.BOLD, 50));

		g.getChildren().addAll(rect, text);

		Scene scene = new Scene(g, 600, 400, Color.WHITE);

		primaryStage.setTitle(STAGE_TITLE);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
