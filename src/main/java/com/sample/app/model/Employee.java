package com.sample.app.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {

	private StringProperty firstName = new SimpleStringProperty();

	public final String getFirstName() {
		return firstName.get();
	}

	public final void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}

	public StringProperty firstNameProperty() {
		return firstName;
	}

}
