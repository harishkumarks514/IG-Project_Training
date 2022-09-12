package ExceptionInMethodOverriding;

import java.io.IOException;

//Java Program to Illustrate Exception Handling
//with Method Overriding
//Where SuperClass declares an exception and
//SubClass declares without exception

public class SuperClassDeclaresExceptionSubclassDeclaresWithoutException {

	void method() throws IOException
	{
		System.out.println("SuperClass");
	}
}

//	SuperClass inherited by the SubClass
class Subclass4 extends SuperClassDeclaresExceptionSubclassDeclaresWithoutException{
//	subclass declaring without excwption
	void method()
	{
		System.out.println("SubClass");
	}
	
//	DriverCode
	public static void main(String[] args) {
		{
			SuperClassDeclaresExceptionSubclassDeclaresWithoutException s = new SuperClassDeclaresExceptionSubclassDeclaresWithoutException();
			try {
				s.method();
			}
			catch (IOException e )
			{
				e.printStackTrace(); 
			}
		}
	}
}