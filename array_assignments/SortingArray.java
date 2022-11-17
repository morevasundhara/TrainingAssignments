package array_assignments;

import java.util.Arrays;

/*
  Suppose that you are having an array of size N. now your
task is to sort the half array that is from 0 to N/2 in ascending 
order and N/2+1 to N in descending order.
*/
public class SortingArray {
	public static void main(String[] args) {
		 int arr[]= {1,2,3,4,5,6,7,8,9,10};
		 
		 for(int i=0;i<arr.length/2;i++) {
			 
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]>arr[j]) {
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
			 System.out.print(arr[i]+" ");
		 }
		 
		 for(int i=0;i<arr.length/2;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]<arr[j]) {
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
			 System.out.print(arr[i]+" ");
		 }
	}


}


