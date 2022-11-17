package com.yash.Task_1;

import java.util.stream.IntStream;

public class Palindrome {

	public static boolean isPalindrome(int no) {

	    return no == IntStream.iterate(no, i -> i / 10)
	        .map(n -> n % 10)
	        .limit(String.valueOf(no).length())
	        .reduce(0, (a, b) -> a = a * 10 + b);
	}
	
	public static void main(String[] args) {
		
		int number = 121;
		
		System.out.println( number+" is palindrome : " + isPalindrome(number));
	}
	
}
