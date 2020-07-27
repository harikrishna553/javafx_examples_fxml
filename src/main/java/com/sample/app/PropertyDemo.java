package com.sample.app;

import com.sample.app.model.Employee;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class PropertyDemo {

	public static void main(String args[]) {
		Employee emp = new Employee();

		emp.firstNameProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				System.out.println("Employee firstName changed from " + oldValue + " -> " + newValue);
			}

		});

		emp.setFirstName("Krishna");
		emp.setFirstName("Ram");
		emp.setFirstName("Gopi");

	}

}


