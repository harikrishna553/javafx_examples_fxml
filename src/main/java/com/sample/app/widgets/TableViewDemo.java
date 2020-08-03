package com.sample.app.widgets;

import com.sample.app.model.Person;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class TableViewDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		ObservableList<Person> emps = FXCollections.observableArrayList();

		emps.setAll(new Person(1, "Krishna"), new Person(2, "Ram"), new Person(3, "Joel"), new Person(4, "Gopi"),
				new Person(5, "Sharief"));

		Label label = new Label("Persons information");
		label.setFont(Font.font("Verdana", FontWeight.BOLD, 25));

		VBox vBox1 = new VBox(label);
		vBox1.setAlignment(Pos.CENTER);
		vBox1.setSpacing(20);

		VBox vBox2 = new VBox();

		TableColumn<Person, Integer> idColumn = new TableColumn<>("Id");
		idColumn.setMinWidth(50);
		idColumn.setCellValueFactory(new PropertyValueFactory<Person, Integer>("id"));

		TableColumn<Person, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setMinWidth(50);
		nameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));

		TableView<Person> tableView = new TableView<>();
		tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		tableView.setItems(emps);
		tableView.setPrefHeight(250);
		tableView.getColumns().add(idColumn);
		tableView.getColumns().add(nameColumn);
		tableView.setPadding(new Insets(20));
		tableView.setEditable(true);

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(5);
		dropShadow.setOffsetY(5);
		dropShadow.setColor(Color.GRAY);

		tableView.setEffect(dropShadow);

		vBox2.getChildren().add(tableView);

		HBox hBox = new HBox();
		hBox.setSpacing(25);
		Label nameLabel = new Label("Change person name");
		nameLabel.setFont(Font.font("Verdana", 20));

		TextField textField = new TextField();

		textField.setOnAction(event -> {
			Person person = tableView.getSelectionModel().getSelectedItem();
			person.setName(textField.getText());
			tableView.refresh();
		});

		hBox.getChildren().addAll(nameLabel, textField);

		VBox buttonVBox = new VBox();
		buttonVBox.setAlignment(Pos.CENTER);
		Button removePerson = new Button("Remove");
		removePerson.setFont(Font.font("Verdana", 20));
		removePerson.setOnAction(event -> {
			Person person = tableView.getSelectionModel().getSelectedItem();
			tableView.getItems().remove(person);
			tableView.refresh();
		});
		buttonVBox.getChildren().add(removePerson);

		VBox vBox = new VBox(vBox1, vBox2, hBox, buttonVBox);
		vBox.setStyle("-fx-background-color:lightyellow");
		vBox.setPadding(new Insets(20));
		vBox.setSpacing(20);

		Scene scene = new Scene(vBox, 600, 500, Color.WHITE);

		primaryStage.setTitle("TableView Demo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String args[]) {
		launch(args);
	}
}
