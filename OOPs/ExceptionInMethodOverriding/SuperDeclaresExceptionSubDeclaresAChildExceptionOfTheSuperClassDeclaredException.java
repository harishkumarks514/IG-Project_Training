package ExceptionInMethodOverriding;

//Java Program to Illustrate Exception Handling
//with Method Overriding
//Where SuperClass declares an exception and
//SubClass declares a child exception
//of the SuperClass declared Exception
public class SuperDeclaresExceptionSubDeclaresAChildExceptionOfTheSuperClassDeclaredException {

	// SuperClass declares an exception
    void method() throws RuntimeException
    {
        System.out.println("SuperClass");
    }
}
//SuperClass inherited by the SubClass
class SubClass3 extends SuperDeclaresExceptionSubDeclaresAChildExceptionOfTheSuperClassDeclaredException {

 // SubClass declaring a child exception
 // of RuntimeException
 void method() throws ArithmeticException
 {

     // ArithmeticException is a child exception
     // of the RuntimeException
     // So the compiler won't give an error
     System.out.println("SubClass");
 }

 // Driver code
 public static void main(String args[])
 {
	 SuperDeclaresExceptionSubDeclaresAChildExceptionOfTheSuperClassDeclaredException s = new SubClass3();
     s.method();
 }
}