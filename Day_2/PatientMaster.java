package com.yash;

import java.util.Scanner;

public class PatientMaster {
	public static void main(String[] args) {
		Patient p1= new Patient("Ranjit",60,5.10);
		System.out.println(p1);
		System.out.println(p1.computeBMI());
		
		
	}

}
