package String_Assignments;

public class RepeatAlphabets {
	
	 public static void main(String[] args)
	    {
	        String s = "Johhnnm";
	        
	        char [] a= s.toCharArray();
	        
	        for(int i=0; i<a.length; i++)
	        {
	            int Count=1;
	            for(int j=i+1; j<a.length; j++)
	            {
	                if(a[i]==a[j])
	                {
	                    Count++;
	                   
	                }
	                
	            }
	            if(Count > 1)
	            {
	                System.out.println(a[i]+"  no:- "+Count);
	            }
	        }
	    }

}
