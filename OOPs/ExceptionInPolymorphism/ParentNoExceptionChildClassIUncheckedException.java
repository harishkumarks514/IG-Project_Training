package ExceptionInPolymorphism;

//import java.io.ArithmeticException;

 


class ParentClass5 {
	void testMethod() {
		System.out.println("No exception in parent class...");
	}
}

public class ParentNoExceptionChildClassIUncheckedException extends ParentClass5 {

	 
	void testMethod() throws ArithmeticException
	{
	throw new ArithmeticException("ArithMatic Exception");	
	}
	public static void main(String[] args) {
		ParentClass5 pc = new ParentNoExceptionChildClassIUncheckedException();
		pc.testMethod();
	}
}
