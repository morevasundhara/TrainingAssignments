package com.yash.Task_7;

public class Result {
	
	public double input(Cal c,double principal,double rate, double time, double emi ) {
        return c.calculate(principal, rate, time,emi);
    }
    
    public static Cal emiCalculation() {
        Cal c1=(principal,rate,time,emi)->(principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
        return c1;
    }

}
