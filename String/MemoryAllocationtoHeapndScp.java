package String_Assignments;

public class MemoryAllocationtoHeapndScp {

	public static void main(String[] args)
	{
		
		String s1 = "abc";
		String s2 = "abc";

		String s3 = new String("pqr");
		String s4 = new String("pqr");
		
         System.out.println("s1 -"+s1.hashCode());
         System.out.println("s2 -"+s2.hashCode());
         System.out.println("s3 -"+s3.hashCode());
         System.out.println("s4 -"+s4.hashCode());
         
		//scp  
		if (s1 == s2)
		System.out.println("Yes");
		else
		System.out.println("No");

		//Heap
		if (s3 == s4)
		System.out.println("Yes");
		else
		System.out.println("No");
		

	}

}
