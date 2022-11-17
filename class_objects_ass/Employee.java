package class_objects_ass;

import java.util.Scanner;

public class Employee {
	
	private int empId;
    private String empName;
    private double basic;
    private double DA;
    private double IT;
    private double NetSalary;
    private double GS;
    
    public Employee(int empId, String empName, double basic) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.basic = basic;
    }

    public void  readData()
     {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter EMp Id ");
        empId=sc.nextInt();
        System.out.println("Enter your name ");
        empName=sc.next();
        System.out.println("Enter Basic Salary");
        basic = sc.nextDouble();
        cal();
     }
     
     public void cal()
    {
        
        DA=((52*basic)/100);
        
         GS=basic+DA;
        
        IT=((30*GS)/100);
        
        NetSalary=GS-IT;
        
    }

     @Override
     public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", basic=" + basic + ", DA=" + DA + ", IT=" + IT
                + ", NetSalary=" + NetSalary + ", GS=" + GS + "]";
    }
    
}
