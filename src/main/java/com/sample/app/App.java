package com.sample.app;

import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToolBar;
import javafx.scene.effect.Blend;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.ColorInput;
import javafx.scene.effect.DisplacementMap;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.MotionBlur;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.effect.Reflection;
import javafx.scene.effect.SepiaTone;
import javafx.scene.effect.Shadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Path;
import javafx.scene.shape.PathElement;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class App {

	public static void main(String args[]) {
		Circle c1 = new Circle();
		
		//Color c1;

		Circle c2 = new Circle(3);
		Circle c3 = new Circle(3, Paint.valueOf("lightgreen"));

		Circle c4 = new Circle(5, 6, 3);
		Circle c5 = new Circle(5, 6, 3, Paint.valueOf("lightgreen"));
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(300, 100);
		Rectangle r3 = new Rectangle(300, 100, Color.GREEN);
		Rectangle r4 = new Rectangle(10, 20, 200, 100);
		
		Ellipse ellipse1 = new Ellipse();
		Ellipse ellipse2 = new Ellipse(10, 15);
		Ellipse ellipse3 = new Ellipse(50, 50, 10, 15);
		
		Polygon polygon1 = new Polygon();
		Polygon polygon2 = new Polygon(15.0, 350.0, 150.0, 350.0, 75.0, 150.0);
		
		Polyline polyline1 = new Polyline();
		Polyline polyline2 = new Polyline(15.0, 350.0, 150.0, 350.0, 75.0, 150.0);
		
		Arc arc1 = new Arc();
		Arc arc2 = new Arc(50, 100, 30, 40, 45, 240);
		arc2.setType(ArcType.CHORD);
		
		QuadCurve quadCurve1 = new QuadCurve();
		QuadCurve quadCurve2 = new QuadCurve(50, 70, 250, 250, 350, 70);
		
		CubicCurve cubicCurve1 = new CubicCurve();
		CubicCurve cubicCurve2 = new CubicCurve(50, 400, 150, 100, 250, 500, 400, 70);
		
		PathElement pathElement;
		
		Path path;
		
		Shadow shadow = new Shadow();
		shadow.setRadius(5);
		shadow.setBlurType(BlurType.THREE_PASS_BOX);
		
		DropShadow dropShaddow;
		
		InnerShadow innerShadow;
		
		BoxBlur boxBlur1;
		
		GaussianBlur gaussianBlur1;
		
		MotionBlur motionBlur;
		
		Blend blend;
		
		Bloom bloom;
		
		Glow glow;
		
		Light light;
		
		Lighting lighting;
		
		ColorAdjust colorAdjust;
		
		ColorInput colorInput;
		
		Reflection reflection1  = new Reflection();
		//Reflection reflection2 = new Reflection(topOffset, fraction, topOpacity, bottomOpacity)
		
		SepiaTone sepiaTone;
		
		DisplacementMap displacementMap;
		
		PerspectiveTransform perspectiveTranform;
		
		HBox hbox;
		
		Label label;
		
		VBox vbox;
		
		FlowPane horizontalFlowPane = new FlowPane();
		horizontalFlowPane.setOrientation(Orientation.HORIZONTAL);
		
		FlowPane verticalFlowPane = new FlowPane();
		verticalFlowPane.setOrientation(Orientation.VERTICAL);
		
		TilePane horizontalTilePane = new TilePane();
		horizontalTilePane.setOrientation(Orientation.HORIZONTAL);
		
		TilePane verticalTilePane = new TilePane();
		horizontalTilePane.setOrientation(Orientation.VERTICAL);
		
		GridPane gridPane = new GridPane();
		
		//gridPane.add(child, columnIndex, rowIndex, colspan, rowspan);
		
		StackPane stackPane = new StackPane();
		
		Text text;
		
		BorderPane borderPane;
		
		AnchorPane anchorPane;
		
		Label label1;
		
		Button button1;
		
		RadioButton radioButton1;
		
		ToggleButton toggleButton1;
		
		PasswordField passwordField;
		CheckBox checkBox;
		
		ChoiceBox choiceBox;
		
		ComboBox comboBox;
		
		TextField textField;
		
		Slider slider;
		
		ProgressIndicator progressIndicator;
		
		TextArea textArea;
		
		Hyperlink hyperLink;
		
		ToolBar toolBar;
		
		ListView listView;
		
		
		
	}

}