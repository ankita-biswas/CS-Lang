package learning.assingments;

public class NumberAssignments {

	public static void main(String[] args) {
		NumberAssignments na = new NumberAssignments();
		na.compIntrestCalc();
	}

	// Add two integers and print results
	public void TestNumber1() {
		int x = 5;
		int y = 8;
		int z = x + y;

		System.out.println(z);
	}

	// Swap values between two variables
	public void SwapVariables1() {
		int a = 5;
		int b = 10;
		int c = a + b;
		a = c - a;
		b = c - b;

		System.out.println(a);
		System.out.println(b);

	}

	public void SwapVariables2() {
		int a = 4;
		int b = 8;
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);
	}

	// Check if a given number is odd or even
	public void CheckOddEven() {
		int x = 4902;
		int y = x % 2;

		if (y > 0) {
			System.out.println("Odd Number");

		} else {
			System.out.println("Even Number");
		}

	}
	// Print only even numbers from a given list of numbers

	public void printEventNumbers() {
		int myNumbers[] = { 56, 3, 47, 998, 33, 55, 90, 41 };
		for (int i = 0; i < myNumbers.length; i++) {
			// System.out.println("i=" + i + ", number = " + myNumbers[i]);

			int remainderOf2 = myNumbers[i] % 2;

			if (remainderOf2 == 0) {
				System.out.println("even number " + myNumbers[i]);
			}
		}

	}

	// Print all even numbers v 50
	public void printEvenNumbers50() {
		for (int i = 1; i <= 50; i++) {
			// System.out.println("i=" + i);

			int remainder = i % 2;
			if (remainder == 0) {
				System.out.println("even number " + i);
			}
		}
	}

	// Calculate power of two numbers
	public void calculatePowers() {
		double a = 27.0;
		double b = 3.0;
		double c = Math.pow(a, b);

		System.out.println(c);
	}

	// //Build a compound interest calculator
	public void compIntrestCalc() {
		double principal = 500; 
		double rate = 0.02;
		double years = 5;
		double numberCompound = 1;
		double amount = principal * Math.pow((1 + (rate / 1)), years * numberCompound);

		System.out.println(amount);

	}
}
