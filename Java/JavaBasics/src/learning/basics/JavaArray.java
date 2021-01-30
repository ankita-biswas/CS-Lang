package learning.basics;

import java.util.Calendar;

public class JavaArray {

    public void learnArray1() {
	int[] myArray = { 34, 43, 22, 23, 56 };
	System.out.println("length: " + myArray.length);
	System.out.println("Array value index 2: " + myArray[2]);

	myArray[2] = 56;
	System.out.println("Array value index 2: " + myArray[2]);

	// System.out.println("Array value index 9: " + myArray[9]);
    }

    public void learnArray2() {
	String[] myArray = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };

	Calendar cal = Calendar.getInstance();
	int dayofWeek = cal.get(Calendar.DAY_OF_WEEK);
	System.out.println(dayofWeek);

	String day = myArray[dayofWeek - 1];
	System.out.println(day.toUpperCase());
    }

    public static void main(String[] args) {
	JavaArray myClass = new JavaArray();
	myClass.learnArray2();
    }

}
