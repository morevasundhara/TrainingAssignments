package array_assignments;
/*
An Array Contain different numbers you have to find how many 
are even, odd, perfect and prime
*/
public class ArrayPrimeOddEven {
	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 28 };

	public void evenNumber() {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("Total even number of given array is=" + count);
	}

	public void oddNumber() {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 > 0) {
				count++;
			}
		}
		System.out.println("Total odd number of given array is=" + count);

	}

	public void perfect() {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int no = 1;
			while (no <= arr[i] / 2) {
				if (arr[i] % no == 0) {
					sum = sum + no;
				}
				no++;
			}
			if (sum == arr[i]) {
				count++;
			}

		}
		System.out.println("Total perfect numbers of given array is= " + count);
	}

	public void primeNumber() {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int flag = 0;
			int m = arr[i] / 2;

			if (arr[i] <= 1) {
				flag = 1;

			} else {
				for (int j = 2; j <= m; j++) {
					if (arr[i] % j == 0) {
						flag = 1;

					}
				}
				if (flag == 0) {
					count++;
				}
			}

		}
		System.out.println("Total prime numbers of given array is= " + count);

	}

	public static void main(String[] args) {
		ArrayPrimeOddEven a = new ArrayPrimeOddEven();
		a.evenNumber();
		a.oddNumber();
		a.perfect();
		a.primeNumber();

	}

}
