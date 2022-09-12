package Aggregation;

import java.util.ArrayList;
import java.util.List;

// java program to illustrate concept of Aggregation

public class Student {

	String name;
	int id;
	String dept;

//	 constructor
	public Student(String name, int id, String dept) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
		this.dept = dept;

	}
}

class Department {

	String name;
	private List<Student> student;

	public Department(String name, List<Student> student) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.student = student;
	}

//	Method of Department class
	public List<Student> getStudents() {
//	Returning list of user defined type
//		Student type
		return student;
	}
}


// class 3
// Institute class contains list of Department objects.
// It is associated with Department class through its objects.

class Institute
{
	// Attribute of Institute
	String instituteName;
	private List<Department> departments;
//	Constructor of institute class
	public Institute(String instituteName, List<Department> department) {
		// TODO Auto-generated constructor stub
	this.instituteName = instituteName;
	this.departments = department;
	}
	
	
//	Method of institute class
//	Counting total students of all departments in a given institute
	
	public int getTotalStudentsInInstitute()
	{
		int noOfStudents = 0;
		List<Student> students;
		
		for(Department dept : departments)
		{
			students = dept.getStudents();
			for(Student s : students)
			{
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
	}

class GFG
{
//	main driver method
	
	public static void main(String[] args) {
//		Creating object of student class inside main()
		Student s1 = new Student("Miaa",1, "CSE");
		Student s2 = new Student("Priyaa",2, "CSE");
		Student s3 = new Student("JOHN",3, "EE");
		Student s4 = new Student("Rahul",4, "EE");
		
		
//		Creating a list of CSE students
		List <Student> cse_students = new ArrayList<Student>();
		
//		Adding CSE students
		cse_students.add(s1);
		cse_students.add(s2);
		
		
//		Creating a List of EE students
		List<Student> ee_students = new ArrayList<Student>();
		
//		Adding EE students
		ee_students.add(s3);
		ee_students.add(s4);
		
//		Creating objects of EE and CSE class inside main
		
		Department CSE = new Department("CSE", cse_students);
		Department EE = new Department("EE", ee_students);
		
		List<Department> departments = new ArrayList<Department>();
		departments.add(CSE);
		departments.add(EE);
		
//		Lastly creating an instance of Institute
		Institute institute = new Institute("BITS", departments);
//		Display message for  better readability
		System.out.println("Total students in institute: ");

//		Calling method to get total number of students in institute and printing on console
		
		System.out.println(institute.getTotalStudentsInInstitute());
		
	}
	}











