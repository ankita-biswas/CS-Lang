package learning.basics;

public class AbstractClass {

	public static void main(String[] args) {

		// Not allowed as they are abstract classes
		// Parent p = new Parent();
		// Child c = new Child();

		// Allowed as it implements abstract methods
		Toddler t = new Toddler();
		t.draw(0, 0);
	}

}

abstract class Parent {
	void print(int x, int y) {

	}
}

abstract class Child {
	abstract void draw(int x, int y);
}

class Toddler extends Child {

	@Override
	void draw(int x, int y) {

	}

}