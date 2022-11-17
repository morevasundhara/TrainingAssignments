package collectionassignments;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapMaster{

	public static void main(String[] args) {
		Map<String,Integer>m=new HashMap<>();
		m.put("Sangli", 200000);
		m.put("pune", 100000);
		m.put("satara", 5000);
		m.put("Kolhapur", 47386);
		System.out.println(m);
		System.out.println(".....................................");

		List<String> ks = new ArrayList<>(m.keySet());
		Collections.sort(ks);
		for (String s : ks) {
			System.out.println(s+"  "+m.get(s));
		}



	}
}


