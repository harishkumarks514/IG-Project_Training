package ExceptionInPolymorphism;

import java.io.IOException;

class ParentClass6 {
	void testMethod() {
		System.out.println("This is test method call od parent class...");
	}
}

public class ParentNoExceptionChildClassCheckedException extends ParentClass6 {

	 
	void testMethod() throws IOException
	{
	throw new IOException("IO Exception");	
	}
	public static void main(String[] args) {
		ParentClass6 pc = new ParentNoExceptionChildClassCheckedException();
		pc.testMethod();
	}
}
