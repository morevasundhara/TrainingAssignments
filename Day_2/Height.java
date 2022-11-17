package com.yash;

public class Height {
	 private float feet;
	    private float inch;
	    public float getFeet() {
	        return feet;
	    }
	    public void setFeet(float feet) {
	        this.feet = feet;
	    }
	    public float getInch() {
	        return inch;
	    }
	    public void setInch(float inch) {
	        this.inch = inch;
	    }
	    
	    
	    public void  calculateInch() {
	        
	        inch = feet * 12;
	        
	        System.out.println(inch);
	    }
	    
}
