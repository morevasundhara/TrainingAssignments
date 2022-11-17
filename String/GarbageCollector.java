package String_Assignments;

public class GarbageCollector {
	
	String str;

   public GarbageCollector(String str) {
	            this.str = str;
	        }



	   @Override
	    protected void finalize() throws Throwable {
	        super.finalize();
	        System.out.println(this.str + " collected");
	    }



	   public static void main(String[] args) {
	        GarbageCollector gcc = new GarbageCollector("eren");
	        System.out.println("String=" + gcc.str.toString());
	        gcc = null;
	        System.gc();



	   }

}
