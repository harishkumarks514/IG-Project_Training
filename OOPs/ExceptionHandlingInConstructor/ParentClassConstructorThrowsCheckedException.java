package ExceptionHandlingInConstructor;


//Java Program to Illustrate Exception handling with
//Constructors in inheritance where Child class constructor
//Not throwing exception of same type or its parent classes



import java.io.FileNotFoundException;

public class ParentClassConstructorThrowsCheckedException {
	// Constructor of parent class
    // Throwing checked exception
	ParentClassConstructorThrowsCheckedException() throws FileNotFoundException
    {
 
        // Print statement when
        // parent class constructor is called
        System.out.println(
            "parent class constructor throwing exception");
    }
}
//Class 2
//Child class
public class Child1 extends ParentClassConstructorThrowsCheckedException {
	   
    Child1() throws FileNotFoundException {
       
        System.out.println("child class constructor throwing same exception");
    }
 
    public static void main(String[] args) throws Exception {
       
        Child child = new Child();
    }
}
