public interface Shape {

  /* The shape interface includes all the shapes (rectangle, circle
  and cylinder) and their methods (perimeter, area and the volume). */

	double getPerimeter();
	double getArea();
	double getVolume();
}

/* TwoDShape is an interface which extends the interface Shape, and
contains two abstract methods that gets the perimeter and area of a shape. */

interface TwoDShape extends Shape {
	double getPerimeter();
	double getArea();
}

/* ThreeDShape is an interface which also extends the interface Shape,
and contrains one abstract method which gets the volume. */

interface ThreeDShape extends TwoDShape {
	double getVolume();
}

// The class circle is an extension of the TwoDShape
class Circle implements TwoDShape {

	// Creating a radius and PI variable
	double r;
	final double p = Math.PI;

	public Circle() {}

	public Circle(double r) {
		this.r = r;
	}

	public double getPerimeter() {
		return 2 * p * r;
	}

	public double getArea() {
		return p * (r * r);
	}

	public double getVolume() {
		return 0;
	}
}

// The class rectangle is an extension of the TwoDShape
class Rectangle implements TwoDShape {

	// Creating the width and height variables
	double w, h;

	public Rectangle() {}

	public Rectangle(double w, double h) {
		this.h = h;
		this.w = w;
	}

	public double getPerimeter() {
		return (w + h) * 2;
	}

	public double getArea() {
		return w * h;
	}

	public double getVolume() {
		return 0;
	}
}

// The class cylinder is an extension of the ThreeDShape
class Cylinder implements ThreeDShape {

	// Creating the variables depth, radius and PI for the 3D shape
	double d, r;
	final double p = Math.PI;

	public Cylinder() {}

	public Cylinder(double d, double r) {
		this.d = d;
		this.r = r;
	}

	public double getVolume() {
		return (p * (r * r)) * d;
	}

	public double getPerimeter() {

		// Creating a variable for the diameter
		double diam = r * 2;
		return 2 * (p * diam + d);
	}

	public double getArea() {
		return (2 * p * r * d + 2 * p * (r * r));
	}
}