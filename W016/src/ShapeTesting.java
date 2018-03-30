public class ShapeTesting {

	public static void main(String[] args) {

		double w = 8;
		double h = 16;

		// Testing the rectangle shape, the width height, perimeter and area.
		Shape rectangleShape = new Rectangle(w, h);
		System.out.println("[Rectangle]");
		System.out.println("Width: " + w + "Height: " + h);
		System.out.println("Perimeter: " + rectangleShape.getPerimeter() + "Area: " + rectangleShape.getArea());

		double r = 6;

		// Testing the circle shape, the radius, perimeter and area.
		Shape circleShape = new Circle(r);
		System.out.println("[Circle]");
		System.out.println("Radius: " + r);
		System.out.println("Perimeter: " + circleShape.getPerimeter());
		System.out.println("Area: " + circleShape.getArea());

		double d = 12;

		// Testing the cyclinder shape, the radius, depth, perimeter, area and volume.
		Shape cylinderShape = new Cylinder(d, r);
		System.out.println("[Cylinder]");
		System.out.println("Radius: " + r);
		System.out.println("Depth: " + d);
		System.out.println("Perimeter: " + cylinderShape.getPerimeter());
		System.out.println("Area: " + cylinderShape.getArea());
		System.out.println("Volume: " + cylinderShape.getVolume());
	}
}