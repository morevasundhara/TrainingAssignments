package collectionassignments;

import java.util.Collections;
import java.util.Vector;

public class VectorMaster {
	public static void main(String[] args) {
		Vector<Integer> vec=new Vector<>();
		vec.add(19);
		vec.add(4);
		vec.add(34);
		vec.add(8);
		vec.add(54);
		System.out.println(vec);
		Collections.sort(vec);
		System.out.println(vec);
	}

}



