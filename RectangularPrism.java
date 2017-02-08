//RectangularPrism
//Adam Crutchfield
//NBHS
//2/7/17
//class for a RectangularPrism
import java.lang.Math;

public class RectangularPrism {
	private double length;
	private double width;
	private double height;
	private double volume;
	private double surfaceArea;

	//default constructor
	public RectangularPrism() {
		length = 1.0;
		width = 1.0;
		height = 1.0;
		volume = length * width * height;
		surfaceArea = 2 * ( width * length + width * height + length * height);

	}
	//normal constructor
	public RectangularPrism(double l, double w, double h) {
		length = l;
		width = w;
		height = h;
		volume = length * width * height;
		surfaceArea = 2 * ( width * length + width * height + length * height);
	}
	//accessors
	public char getLength() {
		return length;
	}
	public char getWidth() {
		return width;
	}
	public char getHeight() {
		return height;
	}
	public char getvolume() {
		return volume;
	}
	public char getsurfaceArea() {
		return surfaceArea;
	}

	//mutators
	public void setlength(double l) {
		length = l;
		//update other values
		volume = length * width * height;
		surfaceArea = 2 * ( width * length + width * height + length * height);
	}
	public void setWidth(double w) {
		width = w;
		//update other values
		volume = length * width;
		surfaceArea = 2 * ( width * length + width * height + length * height);
	}
}
