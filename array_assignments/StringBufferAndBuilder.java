package array_assignments;

public class StringBufferAndBuilder {
	public static void main(String[] args) {
		 long timeStart=System.currentTimeMillis();
		 StringBuffer sb=new StringBuffer("swapnil");
		 
		 for(int i=0;i < 10000 ;i++) {
			 sb.append("mule");
		 }
		 System.out.println("time taken by StringBuffer"+(System.currentTimeMillis() - timeStart) + "ms");

	 timeStart=System.currentTimeMillis();

	StringBuilder sb2=new StringBuilder("swapnil");
	for(int i=0;i < 10000 ;i++) {
		sb2.append("mule");
		
	}
	System.out.println("time taken by StringBuilder"+(System.currentTimeMillis()- timeStart) + " ms");
}

}
