package learning.assingments;

public class StringAssignments {

	public static void main(String[] args) {
		StringAssignments na = new StringAssignments();
		na.printFirstLastName();
	}

	// Change a string to a upper case
	public void changeUppercase() {
		String givenString = "cookies";
		for (int i = 0; i < givenString.length(); i++) {
			char c = givenString.charAt(i);

			// int charInt = (int) c - 32;
			// char uc = (char) charInt;

			char uc = Character.toUpperCase(c);

			System.out.print(uc);
		}
	}

	// Find the number of occurrences of the letter ‘s’ in a string “This is my
	// school”.
	public void countS() {
		String givenString = "This is my school";
		int count = 0;

		for (int i = 0; i < givenString.length(); i++) {
			if (givenString.charAt(i) == 's') {
				count++;
			}
		}
		System.out.print(count);
	}

	// Print a string in reverse of a given string.
	public void reverseString() {
		String givenString = "I like puppies";
		for (int i = givenString.length() - 1; i >= 0; i--) {
			System.out.print(givenString.charAt(i));
		}

	}

	// Count vowels in a lower case string
	public void countVowels() {
		String givenString = "i like to eat pizza";
		int count = 0;

		for (int i = 0; i < givenString.length(); i++) {
			if (givenString.charAt(i) == 'a' || givenString.charAt(i) == 'e' || givenString.charAt(i) == 'i'
					|| givenString.charAt(i) == 'o' || givenString.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.print(count);
	}

	// Print two strings with first and last name together as full name
	public void printFullName() {
		String firstName = "John";
		String lastName = "Smith";
		String fullName = firstName + " " + lastName;

		System.out.print(fullName);
	}

	/**
	 * Print first name and last name from a full name
	 */
	public void printFirstLastName() {
		String fullName = "Bob Dylan";
		int spacePos = fullName.indexOf(' ');
		String firstName = fullName.substring(0, spacePos);
		System.out.println("First Name: " + firstName);

		String lastName = fullName.substring(spacePos + 1, fullName.length());
		System.out.println("Last Name: " + lastName);

	}

}
