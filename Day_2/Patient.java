package com.yash;

public class Patient {
	private String patientName;
	private double  weight;
	private double height;
	
	
	public Patient(String patientName, double weight, double height) {
		
		this.patientName = patientName;
		this.weight = weight;
		this.height = height;
	}
	public Patient() {
		
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", height=" + height + ", weight=" + weight + "]";
	}
	
	public double computeBMI()
	{
		
		return this.weight/(this.height*this.height);
		
	}

}
