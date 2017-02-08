//Rectangle
//Adam Crutchfield
//NBHS
//2/7/17
//class for a Rectangle
import java.lang.Math;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	private double perimeter;

	//default constructor
	public Rectangle() {
		length = 1.0;
		width = 1.0;
		area = length * width;
		perimeter = 2 * (length + width);

	}
	//normal constructor
	public Rectangle(double l, double w) {
		length = l;
		width = w;
		area = length * width;
		perimeter = 2 * (length + width);
	}
	//accessors
	public char getLength() {
		return length;
	}
	public char getWidth() {
		return width;
	}
	public char getArea() {
		return area;
	}
	public char getPerimeter() {
		return perimeter;
	}

	//mutators
	public void setlength(double l) {
		length = l;
		//update other values
		area = length * width;
		perimeter = 2 * (length + width);
	}
	public void setWidth(double w) {
		width = w;
		//update other values
		area = length * width;
		perimeter = 2 * (length + width);
	}
}
