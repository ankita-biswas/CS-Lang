package learning.basics;

public class NumberExamples {

	public static void main(String[] args) {
		NumberExamples obj = new NumberExamples();
		obj.averagetNumber();
	}

	public void averagetNumber() {
		int[] values = { 22, 34, 11, 43, 66 };

		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum = sum + values[i];
		}

		double averageValue = sum / values.length;

		System.out.println(averageValue);
	}

	public void smallestNumber() {
		int[] values = { 22, 34, 11, 43, 66 };

		int result = values[0];

		for (int i = 0; i < values.length; i++)
			if (values[i] < result) {
				result = values[i];
			}
		System.out.println(result);
	}

	public void largestNumber() {
		int[] values = { 34, 45, 55, 43, 67 };

		int result = values[0];

		for (int i = 0; i < values.length; i++) {
			if (values[i] > result) {
				result = values[i];
			}
		}
		System.out.println(result);
	}
}
