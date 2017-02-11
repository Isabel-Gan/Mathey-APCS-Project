//Cone
//Adam Crutchfield
//NBHS
//2/9/17
//class for a Cone
import java.lang.Math;

public class Cone {
	private double radius;
	private double height;
	private double diameter;
	private double volume;
	private double surfaceArea;
	private double circumference;

	//default constructor
	public Cone() {
		radius = 1;
		height = 1;
		diameter = 2 * radius;
		volume = PI * radius * radius * (height  / 3.0);
		surfaceArea = PI * radius * (radius + sqrt(height * height + radius * radius)); 
		circumference = PI * diameter;

	}
	//normal constructor
	public Cone(double r, double h) {
		radius = r;
		height = h;
		diameter = 2 * radius;
		volume = PI * radius * radius * (height  / 3.0);
		surfaceArea = PI * radius * (radius + sqrt(height * height + radius * radius));
		circumference = PI * diameter;
	}
	//accessors
	public double getRadius() {
		return radius;
	}
	public double getHeight() {
		return height;
	}
	public double getDiameter() {
		return diameter;
	}
	public double getVolume() {
		return volume;
	}
	public double getSurfaceArea() {
		return surfaceArea;
	}
	public double getCircumference() {
		return circumference;
	}

	//mutators
	public void setRadius(double r) {
		radius = r;
		//update other values
		diameter = 2 * radius;
		volume = PI * radius * radius * (height  / 3.0);
		surfaceArea = PI * radius * (radius + sqrt(height * height + radius * radius));
		circumference = PI * diameter;
	}
}
