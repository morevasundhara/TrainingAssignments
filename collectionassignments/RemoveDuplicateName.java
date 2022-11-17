package collectionassignments;
import java.util.*;
import java.util.List;

public class RemoveDuplicateName {
	
	 public List<String> removeDuplicate(List<String> l)
	    {   
	        List<String> al=new ArrayList<>();
	        
	            for (String st : l) {
	                if(!al.contains(st))
	                {
	                    al.add(st);
	                }
	            }
	            return al;
	            
	     }
	    public static void main(String[] args) {
	        List<String> al=new ArrayList<>();
	        al.add("Vasundhara");
	        al.add("Nikita");
	        al.add("Sumedha");
	        al.add("Vasundhara");
	        al.add("Urmila");
	        al.add("Vidya");
//	        System.out.println(al);
//	        Collections.sort(al);
	        List<String> rd = new RemoveDuplicateName().removeDuplicate(al);
	        Collections.sort(rd);
	        Collections.reverse(rd);
	        System.out.println(rd);
	        
	    }

}
