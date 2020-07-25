package com.sample.app.eventhandling;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class EventHandlingByLambdaExpression extends Application {

	public static void main(String args[]) {
		launch(args);
	}

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		Button button1 = new Button("Click Me");
		button1.setTextFill(Color.BLACK);
		button1.setFont(Font.font("Verdana", FontPosture.REGULAR, 35));

		button1.setOnAction((event) -> {
			System.out.println("button clicked");
		});

		FlowPane.setMargin(button1, new Insets(50, 50, 50, 50));

		FlowPane flowPane = new FlowPane();
		flowPane.setOrientation(Orientation.HORIZONTAL);
		flowPane.setEffect(dropShadow);
		flowPane.getChildren().add(button1);

		Scene scene = new Scene(flowPane, 500, 400, Color.LIGHTYELLOW);

		primaryStage.setTitle("Event Handling Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}