package com.sample.app;

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
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.effect.*;

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

		
	}

}

