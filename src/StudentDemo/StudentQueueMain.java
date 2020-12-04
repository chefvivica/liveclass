package StudentDemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class StudentQueueMain {
	public static void main(String[] args) {
		PriorityQueue<Student> student = new PriorityQueue<Student>();
		Student student1 = new Student(1, "viv", "nyv", "sports");
		Student student2 = new Student(9, "viv", "nyc", "sports");
		Student student3 = new Student(3, "viv", "nya", "sports");
		Student student4 = new Student(4, "viv", "nye", "sports");
		
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);
		
		
		Iterator<Student> itr = student.iterator();
		
		while(itr.hasNext()) {
			System.out.println("itr next "+itr.next());
		}
		
	}
}
