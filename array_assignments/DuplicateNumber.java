package array_assignments;

/*
WAP to find duplicate numbers and there counting 
from list of numbers.
*/
public class DuplicateNumber {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 7, 7, 3, 3, 3, 3, 2, 7, 8, 3 };
		System.out.println("Duplicate number of given array and count duplicate number");

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] != -1) {
					if (arr[i] == arr[j]) {
						arr[j] = -1;
						count++;

					}
				}
				}
			if (count > 1) {
				
				//System.out.println(arr[i]);

				System.out.println(arr[i] + "= " + count);
			}
		}
	}
}           
          
   

