package learning.basics;

public class JavaStrings {

	public void learningString1() {
		System.out.println("Hello World!");

		String line1 = "My name is";
		String line2 = "Ann";
		String line3 = "Bishop";

		System.out.println(line1);

		System.out.println(line2);

		System.out.println(line3);

		String myLine = line1 + " " + line2.toUpperCase() + " " + line3.toUpperCase();
		System.out.print(myLine);
	}

	public static void main(String[] args) {
		JavaStrings myClass = new JavaStrings();
		myClass.learningString1();
	}

}
