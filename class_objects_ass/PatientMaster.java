package class_objects_ass;

public class PatientMaster {

	public static void main(String[] args) {
		Patient p1=new Patient("Vasu",5.7,60);
		System.out.println("BMI :"+p1.computeBMI());
	}

}
