package com.sample.app.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class AnchorPaneDemo extends Application {

	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		AnchorPane anchorPane = new AnchorPane();

		Rectangle rect1 = new Rectangle(100, 100, Color.LIGHTGREEN);
		rect1.setArcHeight(15);
		rect1.setArcWidth(15);
		AnchorPane.setTopAnchor(rect1, 15d);
		AnchorPane.setLeftAnchor(rect1, 15d);

		Rectangle rect2 = new Rectangle(100, 100, Color.LIGHTCORAL);
		rect2.setArcHeight(15);
		rect2.setArcWidth(15);
		AnchorPane.setTopAnchor(rect2, 15d);
		AnchorPane.setRightAnchor(rect2, 15d);

		Rectangle rect3 = new Rectangle(100, 100, Color.LIGHTGREY);
		rect3.setArcHeight(15);
		rect3.setArcWidth(15);
		AnchorPane.setBottomAnchor(rect3, 15d);
		AnchorPane.setLeftAnchor(rect3, 15d);

		Rectangle rect4 = new Rectangle(100, 100, Color.LIGHTPINK);
		rect4.setArcHeight(15);
		rect4.setArcWidth(15);
		AnchorPane.setBottomAnchor(rect4, 15d);
		AnchorPane.setRightAnchor(rect4, 15d);

		Rectangle rect5 = new Rectangle(100, 100, Color.RED);
		rect5.setArcHeight(15);
		rect5.setArcWidth(15);
		AnchorPane.setBottomAnchor(rect5, 150d);
		AnchorPane.setLeftAnchor(rect5, 200d);

		anchorPane.getChildren().addAll(rect1, rect2, rect3, rect4, rect5);

		Scene scene = new Scene(anchorPane, 500, 400, Color.LIGHTYELLOW);

		primaryStage.setTitle("Anchor Pane Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}