package learning.inheritence;

public class JavaShapesMain {

	public static void main(String[] args) {
		JavaShapesMain myJavaClassObject = new JavaShapesMain();
		// myJavaClassObject.testCircile();
		myJavaClassObject.testRectangle();
	}

	public void testCircile() {
		// Create circle object
		Circle myCircleObject = new Circle();

		// Call the setRadius method to set the radius value
		myCircleObject.setRadius(3);

		// Call the area() method to calculate and return area
		double area = myCircleObject.area();

		// Print calculated area value
		System.out.println(area);
	}

	public void testRectangle() {
		Rectangle myRectangleObject = new Rectangle();

		myRectangleObject.setHeight(8);

		myRectangleObject.setWidth(6);

		double area = myRectangleObject.area();

		System.out.println(area);

	}
}
