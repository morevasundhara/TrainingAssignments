package array_assignments;
/*
WAP to sort array on the basis of unit place. For example we are
having following numbers:- 10,2,3,41,12,13,19,81,9. Output will 
be 10,41,81,2,12,3,13,19,9. 
*/

public class ArrayUnitPlaced {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 3, 41, 12, 13, 19, 81, 9 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 2; j < arr.length; j++) {

				if ((arr[i] % 10) > arr[j] % 10) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " , ");
		}
	}
}
