//Sphere
//Adam Crutchfield
//NBHS
//2/5/17
//class for a Sphere
import java.lang.Math;

public class Sphere {
	private double radius;
	private double diameter;
	private double volume;
	private double surfaceArea;
	private double circumference;

	//default constructor
	public Sphere() {
		radius = 1;
		diameter = 2 * radius;
		volume = (4 / 3.0) * PI * radius * radius * radius;	//4/3*PI*r^3
		surfaceArea = 4 * PI * radius * radius;	//4*PI*r^2
		circumference = PI * diameter;

	}
	//normal constructor
	public Sphere(double r) {
		radius = r;
		diameter = 2 * radius;
		volume = (4 / 3.0) * PI * radius * radius * radius;	//4/3*PI*r^3
		surfaceArea = 4 * PI * radius * radius;	//4*PI*r^2
		circumference = PI * diameter;
	}
	//accessors
	public char getRadius() {
		return radius;
	}
	public char getDiameter() {
		return diameter;
	}
	public char getVolume() {
		return volume;
	}
	public char getSurfaceArea() {
		return surfaceArea;
	}
	public char getCircumference() {
		return circumference;
	}

	//mutators
	public void setRadius(double r) {
		radius = r;
		//update other values
		diameter = 2 * radius;
		volume = (4 / 3.0) * PI * radius * radius * radius;	//4/3*PI*r^3
		surfaceArea = 4 * PI * radius * radius;	//4*PI*r^2
		circumference = PI * diameter;
	}
}
