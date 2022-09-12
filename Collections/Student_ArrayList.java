package Collections;

import java.util.ArrayList;
import java.util.Iterator;

import Aggregation.Student;

public class Student_ArrayList {

	int rollno;
	String name;
	int age;

	public Student_ArrayList(int rollno, String name, int age) {
		// TODO Auto-generated constructor stub
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class main{
	 public static void main(String[] args) {
		Student_ArrayList s1 = new Student_ArrayList(01, "Pavan", 22);
		Student_ArrayList s2 = new Student_ArrayList(02, "Ravan", 24);
		Student_ArrayList s3 = new Student_ArrayList(03, "Ravi", 25);
		
//		Creating arraylist
		ArrayList<Student_ArrayList> al = new ArrayList<Student_ArrayList>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
//		Getting Iterator
		Iterator itr = al.iterator();
//		traversing elements of ArrayList object
		while(itr.hasNext())
		{
			Student_ArrayList st = (Student_ArrayList) itr.next();
			System.out.println(st.rollno + " " + st.name + " "
					+st.age);
		}
	} 
}