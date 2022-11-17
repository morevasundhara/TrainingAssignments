package com.yash;

import java.util.Scanner;

public class EmployeeMaster {
public static void main(String[] args) {
	//Employee e = new Employee(01, "Ranjit", 15000);
//	System.out.println(e.netSal());
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter the EMployee Id");
		int id=sc.nextInt();
		System.out.println("Enter the EMployee Name");
		String Name=sc.next();
		System.out.println("Enter the EMployee Basic Salary");
		int bsal=sc.nextInt();
		Employee e = new Employee(id,Name, bsal);
		e.netSal();
		e.Display();
		
	}
}
}
