package ExceptionInPolymorphism;

import java.io.IOException;

class ParentClass12 {
	void testMethod() throws IOException, ArithmeticException {
		throw new IOException();
	}
}

public class ParentCheckedAndUncheckedExceptionChildNoException extends ParentClass12 {

	void testMethod()
	{
		System.out.println("This is test method called from child class...");
	}
	
	public static void main(String[] args) {
		ParentClass12 pc = new ParentCheckedAndUncheckedExceptionChildNoException();
		try 
		{
			pc.testMethod();
		}catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
