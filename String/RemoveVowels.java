package String_Assignments;

public class RemoveVowels {

	public static void main(String[] args)
	{
		 String string="meayouri";
		    char[] a=string.toCharArray();
		    
		    for (int i = 0; i < a.length; i++)
		    {
		        if (a[i]=='a' || a[i]=='e'|| a[i]=='i'|| a[i]=='o'|| a[i]=='u') {
		            
		            continue;
		            
		     }
		        System.out.println(a[i]);
		        
		    }
	

	}

}
