package collectionassignments;

	
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

	class Binary {
		public int binarySearch(int array[], int x, int low, int high) {

			while (low <= high) {
				int mid = low + (high - low) / 2;

				if (array[mid] == x)
					return mid;

				if (array[mid] < x)
					low = mid + 1;

				else
					high = mid - 1;
			}

			return -1;
		}
	}

	public class BinarySearch {
		public static void main(String[] args) {

			List<Integer> al = new ArrayList<>();
			int arr[] = new int[5];
			al.add(34);
			al.add(54);
			al.add(98);
			al.add(9342);
			al.add(32);
			
			// System.out.println(al.get(0));

			for (int i = 0; i < arr.length; i++) {
				arr[i] = al.get(i);
			}
			Arrays.sort(arr);

			for (int i : arr) {
				System.out.print(i+" ");
			}

			Binary b = new Binary();
			int binarySearch = b.binarySearch(arr, 54, 0, arr.length - 1);
			System.out.println("Perform the binary seach");
////		int binarySearch = Collections.binarySearch(al, 98);
			System.out.println(binarySearch);
		}

	}



