package array_assignments;
/*
You are having array of strings. Now you have to arrange 
strings in array on the basis of the length of each string.
Smallest string will be first and so on.
*/

public class ArrayString {
public static void main(String[] args) {

		String arr[] = { "vasu", "urmila", "nikita", "sumedha", "vidya", "amruta" };

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].length() >= arr[j].length()) {

					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+" , ");
		}
	}
}
