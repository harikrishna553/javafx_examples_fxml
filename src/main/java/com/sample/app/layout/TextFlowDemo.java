package com.sample.app.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class TextFlowDemo extends Application {

	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Text text1 = new Text("Hello World, JavaFX is fun to learn");
		text1.setFont(Font.font("Verdana", FontPosture.ITALIC, 50));
		text1.setFill(Color.BLUE);

		TextFlow textFlow = new TextFlow(text1);
		textFlow.setTextAlignment(TextAlignment.JUSTIFY);

		Scene scene = new Scene(textFlow, 1000, 400, Color.LIGHTYELLOW);

		primaryStage.setTitle("TextFlow layout Demo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
