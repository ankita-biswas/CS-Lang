package learning.basics;

public class JavaBasics {

    public void learningStrings() {
	System.out.println("Hello");
	System.out.println("My name is Ann");
	String myName = "Ann Bishop";
	System.out.println(myName);
    }

    public void learningNumbers() {
	int a = 5;
	int b = 10;
	System.out.println(a);
	System.out.println(b);

	int c = a + b;
	System.out.println(c);
    }

    public void learningBoolean() {
	boolean isColdToday = false;

	if (isColdToday) {
	    System.out.println("drink hot coffee");
	} else {
	    System.out.println("drink ice coffee");
	}
    }

    public void learningComparisonOperator() {
	int price = 2000;

	if (price > 1000) {
	    System.out.println("very expensive");
	} else if (price > 100) {
	    System.out.println("expensive");
	} else {
	    System.out.println("cheap");
	}
    }

    public void calculateDiameter() {
	int radius = 21;
	double circumfrence = 2 * Math.PI * radius;
	System.out.println(circumfrence);
    }

    public double calculateDiameterParam(int radius) {
	double circumfrence = 2 * Math.PI * radius;
	return circumfrence;
    }

    public int calculateAreaParam(int height, int width) {
	int area = height * width;
	return area;
    }

    public static void main(String[] args) {

	JavaBasics myClass = new JavaBasics();
	// myClass.learningStrings();
	// myClass.learningNumbers();
	// myClass.learningBoolean();
	// myClass.learningComparisonOperator();
	// myClass.calculateDiameter();

	// double circumference = myClass.calculateDiameterParam(7);
	// System.out.println(circumference);

	int area = myClass.calculateAreaParam(3, 8);
	System.out.println(area);

    }

}

//Param, ret vakue, multiple params, scope
