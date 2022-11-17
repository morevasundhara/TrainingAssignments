package com.yash;

public class Employee {
	private int eId;
	private String eName;
	private double basicSal;
	private double DA;
	private double IT;
	private double nSalaray;
	private double gsalaray;
	public Employee(int eId, String eName, double basicSal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.basicSal = basicSal;
		
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
	public double getDA() {
		return DA;
	}
	public void setDA(double dA) {
		DA = dA;
	}
	public double getIT() {
		return IT;
	}
	public void setIT(double iT) {
		IT = iT;
	}
	public double getnSalaray() {
		return nSalaray;
	}
	public void setnSalaray(int nSalaray) {
		this.nSalaray = nSalaray;
	}
	public double netSal() {
		
		DA=basicSal*52/100;
		
		gsalaray=basicSal+DA;
		
		IT=gsalaray*30/100;
		
		nSalaray=gsalaray-IT;
		
		return nSalaray;
		
	}
	public void Display()
	{
		System.out.println("Employee Name:-"+eName+"\n"+"Basic Salary:-"+basicSal+"\n"+"DA:-"+DA+"Income Tax:-"+IT+"\n"+"Net Saraary:-"+nSalaray);
	}
	

}
