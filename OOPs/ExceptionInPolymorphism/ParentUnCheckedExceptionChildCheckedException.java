package ExceptionInPolymorphism;

import java.io.IOException;

class ParentClass33
{
	void testMethod() throws ArithmeticException
	{
		throw new ArithmeticException("Arithmatic Exception");
	}
}
public class ParentUnCheckedExceptionChildCheckedException extends ParentClass33 {

	void testMethod() throws IOException
	{
		throw new IOException( "IO EXCEPTION" );
	}
	
	public static void main(String[] args) {
		ParentClass33 pc = new ParentUnCheckedExceptionChildCheckedException();
	}
}
