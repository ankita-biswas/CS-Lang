package learning.inheritence;

public class Circle extends Shape {
	// Property or variables
	private int radius;

	// Method for setting radius
	public void setRadius(int r) {
		radius = r;
	}

	// Method for getting radius
	public int getRadius() {
		return radius;
	}

	// Method of circle to calculate area
	public double area() {
		double area = 2 * Math.PI * radius;
		return area;
	}

}