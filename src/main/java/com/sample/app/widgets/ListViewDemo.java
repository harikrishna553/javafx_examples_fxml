package com.sample.app.widgets;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ListViewDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		HBox hBox = new HBox();
		hBox.setSpacing(40);
		hBox.setPadding(new Insets(50, 0, 0, 0));
		hBox.setAlignment(Pos.CENTER);

		VBox leftVBox = new VBox();

		ObservableList<String> leftList = FXCollections.observableArrayList("Cricket", "Football", "Tennis", "Hockey",
				"Trekking", "Singing", "Shopping");

		ObservableList<String> rightList = FXCollections.observableArrayList();

		ListView<String> leftListView = new ListView<>(leftList);
		leftListView.setMaxWidth(250);
		leftListView.setMaxHeight(350);
		leftListView.setEffect(dropShadow);
		leftListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		leftVBox.getChildren().add(leftListView);
		leftVBox.setPadding(new Insets(20));

		VBox rightVBox = new VBox();
		ListView<String> rightListView = new ListView<>(rightList);
		rightListView.setMaxWidth(250);
		rightListView.setMaxHeight(350);
		rightListView.setEffect(dropShadow);
		rightListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		rightVBox.getChildren().add(rightListView);
		rightVBox.setPadding(new Insets(20));

		VBox buttonsVBox = new VBox();
		Button leftButton = new Button("<-");
		leftButton.setMinWidth(40);

		Button rightButton = new Button("->");
		rightButton.setMinWidth(40);

		rightButton.setOnAction((event) -> {
			ObservableList<String> selectedItems = FXCollections
					.observableArrayList(leftListView.getSelectionModel().getSelectedItems());

			leftList.removeAll(selectedItems);
			rightList.addAll(selectedItems);
		});

		leftButton.setOnAction((event) -> {
			ObservableList<String> selectedItems = FXCollections
					.observableArrayList(rightListView.getSelectionModel().getSelectedItems());

			rightList.removeAll(selectedItems);
			leftList.addAll(selectedItems);
		});

		buttonsVBox.getChildren().addAll(leftButton, rightButton);
		buttonsVBox.setSpacing(25);
		buttonsVBox.setPadding(new Insets(100, 0, 0, 0));

		hBox.getChildren().addAll(leftVBox, buttonsVBox, rightVBox);
		hBox.setStyle("-fx-background-color:lightgreen");

		Scene scene = new Scene(hBox, 700, 500);
		primaryStage.setTitle("ListView Example");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String args[]) {
		launch(args);
	}

}
