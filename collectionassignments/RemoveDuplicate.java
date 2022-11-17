package collectionassignments;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
	
	  public static void main(String[] args) {
	        List <Integer> l=new ArrayList<Integer>();
	        List <Integer> l2=new ArrayList<Integer>();
	        l.add(1);
	        l.add(7);
	        l.add(4);
	        l.add(99);
	        l.add(34);
	        l.add(4);
	        l.add(7);
	        System.out.println(l);
	        
	        
	        for(int i=0;i<l.size();i++)
	        {
	            
	            for(int j=i+1;j<l.size();j++)
	            {
	                if(l.get(i)==l.get(j))
	                {
	                l.remove(j);
	                
	                }
	            }    
	            
	        }
	        System.out.println("after removing duplicate:"+l);
	        l.sort(null);
	        System.out.println("after sorting:"+l);
	    }



}
