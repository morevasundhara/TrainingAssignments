package array_assignments;

import java.util.Scanner;

/*
User will enter the element in M*M order matrix that is square matrix 
now you have to print first row, last row, first column, and last column 
elements. Code should be applicable for matrix of any order.
*/

public class Matrix {
	public static void main(String[] args) {
		int m, i, j, temp;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows ");
		m = sc.nextInt();

		System.out.print("Enter number of columns ");
		m = sc.nextInt();

		int a[][] = new int[m][m];

		if (m == m) {
			System.out.println("Enter all the values of matrix ");

			for (i = 0; i < m; i++) {
				for (j = 0; j < m; j++) {
					a[i][j] = sc.nextInt();
				}
			}

			System.out.println("original Matrix:");

			for (i = 0; i < m; i++) {
				for (j = 0; j < m; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println("");
			}
            System.out.println("Matrix after changing");

		        for ( i = 0; i < m; i++) {
		            for( j=0;j<m;j++) {
		                if((i!=0 && j!=0) && (i!=m-1 && j!=m-1)) {
		                    System.out.print("   ");
		                    continue;
		            	}
		                System.out.print(a[i][j]+"  ");
		            }
		            System.out.println();
		        }
		    
		} else {
			System.out.println("Rows not equal to columns");
		}
	}
}
