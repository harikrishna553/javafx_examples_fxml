package com.sample.app.widgets;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TreeViewDemo extends Application {

	private TreeView<String> makeTreeView() {
		TreeItem<String> rootItem = new TreeItem<>("Organization Hierarchy");

		TreeItem<String> finance = new TreeItem<>("Finance");
		TreeItem<String> financeIndia = new TreeItem<>("India");
		TreeItem<String> financeUS = new TreeItem<>("US");

		finance.getChildren().addAll(financeIndia, financeUS);

		TreeItem<String> hr = new TreeItem<>("HR");
		TreeItem<String> hrIndia = new TreeItem<>("India");
		TreeItem<String> hrUS = new TreeItem<>("US");
		hr.getChildren().addAll(hrIndia, hrUS);

		TreeItem<String> technical = new TreeItem<>("Technical");
		TreeItem<String> technicalIndia = new TreeItem<>("India");
		TreeItem<String> technicalUS = new TreeItem<>("US");
		TreeItem<String> technicalUK = new TreeItem<>("UK");

		TreeItem<String> technicalIndia_Bangalore = new TreeItem<>("Bangalore");
		TreeItem<String> technicalIndia_Chennai = new TreeItem<>("Chennai");

		technicalIndia.getChildren().addAll(technicalIndia_Bangalore, technicalIndia_Chennai);

		technical.getChildren().addAll(technicalIndia, technicalUS, technicalUK);

		rootItem.getChildren().addAll(finance, hr, technical);
		rootItem.setExpanded(true);

		TreeView<String> treeView = new TreeView<>(rootItem);

		return treeView;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		TreeView<String> treeView = makeTreeView();

		VBox vBox1 = new VBox();

		HBox hBox1 = new HBox();
		hBox1.getChildren().add(treeView);
		hBox1.setPadding(new Insets(40));
		hBox1.setSpacing(50);
		hBox1.setAlignment(Pos.TOP_CENTER);
		hBox1.setStyle("-fx-background-color:lightsalmon");

		Font font = Font.font("Verdana", 20);

		TextField textField = new TextField();
		textField.setFont(font);

		Button addButton = new Button("Add");
		addButton.setFont(font);
		addButton.setTooltip(new Tooltip("Add new item to the tree"));

		addButton.setOnAction(event -> {
			TreeItem<String> selectedItem = treeView.getSelectionModel().getSelectedItem();
			String newItemName = textField.getText();

			if (selectedItem == null || newItemName == null || newItemName.isEmpty()) {
				return;
			}

			selectedItem.getChildren().add(new TreeItem<String>(newItemName));

		});

		Button removeButton = new Button("Remove");
		removeButton.setFont(font);
		removeButton.setTooltip(new Tooltip("Remove existing item to the tree"));

		removeButton.setOnAction(event -> {
			TreeItem<String> selectedItem = treeView.getSelectionModel().getSelectedItem();

			if (selectedItem.getParent() == null) {
				return;
			}

			selectedItem.getParent().getChildren().remove(selectedItem);

		});

		HBox hBox2 = new HBox();
		hBox2.getChildren().addAll(addButton, textField, removeButton);
		hBox2.setPadding(new Insets(20));
		hBox2.setSpacing(20);
		hBox2.setAlignment(Pos.CENTER);
		hBox2.setStyle("-fx-background-color:lightsalmon");

		vBox1.getChildren().addAll(hBox1, hBox2);

		Scene scene = new Scene(vBox1, 700, 500, Color.WHITE);
		primaryStage.setTitle("TreeView Example");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String args[]) {
		launch(args);
	}

}
