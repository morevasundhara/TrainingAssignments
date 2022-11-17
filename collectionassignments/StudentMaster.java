package collectionassignments;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private String className;
	private int totalMarks;

	public Student() {
		super();
	}

	public Student(int id, String name, String className, int totalMarks) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
		this.totalMarks = totalMarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", className=" + className + ", totalMarks=" + totalMarks + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.totalMarks > o.getTotalMarks()) {
			return 1;
		} else
			return -1;
	}

}

public class StudentMaster {
	public static void main(String[] args) {
		List<Student> al = new ArrayList<>();
		al.add(new Student(01, "Abhi", "fifth", 50));
		al.add(new Student(02, "Ranjit", "fifth", 90));
		al.add(new Student(03, "Omkar", "third", 55));
		al.add(new Student(04, "Raju", "sixth", 40));
		al.add(new Student(05, "Ramu", "sixth", 20));

		al.add(new Student(05, "Bhushan", "fourth", 60));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		// Print the name of students who secure first, second and third position.
		System.out.println(al.get(al.size() - 1).getName() + "\n" + al.get(al.size() - 2).getName() + "\n"
				+ al.get(al.size() - 3).getName());
		// Print name of those students who�s marks are below 50%
		for (Student s : al) {
			if (s.getTotalMarks() < 50) {
				System.out.println(s.getName() + " Got Below 50% Marks In Exam");
			}

		}
		// Using Stream API
		al.stream().filter(x -> x.getTotalMarks() < 50).forEach(x -> System.out.println(x.getName()));
		// Print name of those students who�s marks are below 35% it means they are
		// fail.
		al.stream().filter(x -> x.getTotalMarks() < 35).forEach(x -> System.out.println(x.getName()));

		// Print name of those students who�s marks are above average score.
		for (Student s : al) {
			if (s.getTotalMarks() > 50) {
				System.out.println(s.getName() + " Got Average Marks In Exam");
			}

		}
		// Using Stream API
		al.stream().filter(x -> x.getTotalMarks() < 50).forEach(x -> System.out.println(x.getName()));
		System.out.println();
		// Print detail of all students on the basis of Name
		for (Student s : al) {
			System.out.println(s.getName()+"="+"\nDetails Of Student\n"+s);
		}
	}
}



