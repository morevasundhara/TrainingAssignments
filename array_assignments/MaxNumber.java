package array_assignments;

//WAP to find third maximum number from list of numbers.

public class MaxNumber {

	public static void main(String[] args) {
		int arr[] = { 10, 30, 20, 50, 60, 80, 40 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println("third maximum number of given array is");
		System.out.println(arr[2]);

	}
}
