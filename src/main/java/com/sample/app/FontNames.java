package com.sample.app;

import java.util.List;

import javafx.scene.text.Font;

public class FontNames {
	
	public static void main(String args[]) {
		List<String> fontNames = Font.getFontNames();
		
		for(String fontName: fontNames) {
			System.out.println(fontName);
		}
	}

}
