package com.sample.app.widgets;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class MenuDemo extends Application {

	private TextArea textArea;
	private int fontSize = 23;
	private String fontName = "Arial";
	private FontPosture fontPosture = FontPosture.REGULAR;

	private MenuItem getFontMenuItem(String fontName, String ctrlKey) {
		MenuItem fontMenuItem = new MenuItem(fontName);
		fontMenuItem.setAccelerator(KeyCombination.keyCombination("Ctrl+" + ctrlKey));

		fontMenuItem.setOnAction((event) -> {
			this.fontName = fontMenuItem.getText();
			textArea.setFont(Font.font(fontName, fontSize));
		});
		return fontMenuItem;

	}

	private MenuItem getSizeMenuItem(int fontSize) {
		MenuItem sizeMenuItem = new MenuItem("" + fontSize);

		sizeMenuItem.setOnAction((event) -> {
			this.fontSize = Integer.valueOf(sizeMenuItem.getText());
			textArea.setFont(Font.font(fontName, fontSize));
		});
		return sizeMenuItem;
	}

	private MenuItem getStyleMenuItem(String style) {
		MenuItem styleMenuItem = new RadioMenuItem("" + style);

		styleMenuItem.setOnAction((event) -> {
			String selectedStyle = styleMenuItem.getText();

			if (FontPosture.REGULAR == FontPosture.valueOf(selectedStyle.toUpperCase())) {
				fontPosture = FontPosture.REGULAR;
			} else {
				fontPosture = FontPosture.ITALIC;
			}

			textArea.setFont(Font.font(fontName, fontPosture, fontSize));
		});
		return styleMenuItem;
	}

	private void addEditMenuItems(Menu editMenu) {
		MenuItem copyMenuItem = new MenuItem("Copy");
		copyMenuItem.setOnAction((event) -> {
			textArea.copy();
		});

		MenuItem pasteMenuItem = new MenuItem("Paste");
		pasteMenuItem.setOnAction((event) -> {
			textArea.paste();
		});

		MenuItem cutMenuItem = new MenuItem("Cut");
		cutMenuItem.setOnAction((event) -> {
			textArea.cut();
		});

		MenuItem undoMenuItem = new MenuItem("Undo");
		undoMenuItem.setOnAction((event) -> {
			textArea.undo();
		});

		MenuItem selectAllMenuItem = new MenuItem("Select All");
		selectAllMenuItem.setOnAction((event) -> {
			textArea.selectAll();
		});

		editMenu.getItems().addAll(copyMenuItem, pasteMenuItem, cutMenuItem, undoMenuItem, selectAllMenuItem);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		textArea = new TextArea();
		textArea.setMinWidth(250);
		textArea.setMinHeight(250);
		textArea.setFont(Font.font("Verdana", 20));

		Menu fontMenu = new Menu("Font");
		Menu sizeMenu = new Menu("Size");
		Menu styleMenu = new Menu("Style");
		Menu editMenu = new Menu("Edit");

		fontMenu.getItems().addAll(getFontMenuItem("Arial", "R"), getFontMenuItem("Verdana", "D"),
				getFontMenuItem("Calibri", "B"));

		sizeMenu.getItems().addAll(getSizeMenuItem(12), getSizeMenuItem(16), getSizeMenuItem(20), getSizeMenuItem(30));

		styleMenu.getItems().addAll(getStyleMenuItem("Regular"), getStyleMenuItem("Italic"));

		addEditMenuItems(editMenu);

		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fontMenu, sizeMenu, styleMenu, editMenu);

		VBox vBox1 = new VBox();

		VBox vBox2 = new VBox();
		vBox2.getChildren().addAll(textArea);
		vBox2.setPadding(new Insets(30));

		vBox1.getChildren().addAll(menuBar, vBox2);
		vBox1.setStyle("-fx-background-color:lightblue");

		Scene scene = new Scene(vBox1, 600, 500, Color.WHITE);

		primaryStage.setTitle("Menu Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String args[]) {
		launch(args);
	}

}
