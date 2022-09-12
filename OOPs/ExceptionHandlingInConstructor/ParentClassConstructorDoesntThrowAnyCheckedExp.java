package ExceptionHandlingInConstructor;

public class ParentClassConstructorDoesntThrowAnyCheckedExp {

	// Constructor of Parent class
    // Not throwing any checked exception
	ParentClassConstructorDoesntThrowAnyCheckedExp()
    {
 
        // Print statement whenever parent class
        // constructor is called
        System.out.println("parent class constructor");
    }
}

//Class 2
//Child class
public class Child extends ParentClassConstructorDoesntThrowAnyCheckedExp {

 // Constructor of child class
 Child()
 {

     // Print statement whenever child class
     // constructor is called
     System.out.println("child class constructor");
 }

 // main driver method
 public static void main(String[] args)
 {

     // Creating object of child class inside main()
     Child child = new Child();
 }
}
