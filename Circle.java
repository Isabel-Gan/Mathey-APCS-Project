//Circle
//Adam Crutchfield
//NBHS
//2/5/17
//class for a circle
import java.lang.Math;

public class Circle {
	private double radius;
	private double diameter;
	private double area;
	private double circumference;

	//default constructor
	public Circle() {
		radius = 1;
		diameter = 2 * radius;
		area = PI * radius * radius;	//PI*r^2
		circumference = PI * diameter;

	}
	//normal constructor
	public Circle(double r) {
		radius = r;
		diameter = 2 * radius;
		area = PI * radius * radius;	//PI*r^2
		circumference = PI * diameter;
	}
	//accessors
	public char getRadius() {
		return radius;
	}
	public char getDiameter() {
		return diameter;
	}
	public char getArea() {
		return area;
	}
	public char getCircumference() {
		return circumference;
	}

	//mutators
	public void setRadius(double r) {
		radius = r;
		//update other values
		diameter = 2 * radius;
		area = PI * radius * radius;	//PI*r^2
		circumference = PI * diameter;
	}
}
