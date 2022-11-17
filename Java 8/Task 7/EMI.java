package com.yash.Task_7;

public class EMI {
	
	public static void main(String[] args) {

	       Result r = new Result();
	        Cal c;
	        double d = 0;
	        c = r.emiCalculation();

	       d = r.input(c, 1200, 10, 12, 1);

	       System.out.println(d);
	   }

}
