package Association;

//Importing required classes
import java.io.*;
// class 1
// Bank class

class Bank {

//	Attribute of bank
	private String name;

//	Constructor of this class
	public Bank(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

//	Method of bank class
	public String getBankName()
	{
//		Returning the name of bank.
		return this.name;
	}
}

// 	Class 2
// Employee class
	class Employee {
//		Attribute of employee
		private String name;
//		Employee name
		Employee(String name)
		{
			this.name=name;
		}
		
//		method of employee class
		public String getEmployeeName()
		{
			return this.name;
		}
	}
	
//	class 3
//	Association between both the class in main method
	
	
	
public class Main {

	public static void main(String[] args) {
//		Creating objects of bank and Employee class
		Bank bank = new Bank("HDFC");
		Employee emp = new Employee("Harish");
//		print and display name and corresponding bank of employee
		System.out.println(emp.getEmployeeName() +  " is employee of " + bank.getBankName());
	}
}

// 	Output Explanation: In the above example, two separate classes Bank and Employee are associated through their Objects. Bank can have many employees, So it is a one-to-many relationship. 

