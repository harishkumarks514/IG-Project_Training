package ExceptionInPolymorphism;

import java.io.IOException;

class ParentClass7
{
	void testMethod() throws IOException{
		throw new IOException("IO Exception");
	}
	}

public class ParentCheckedExceptionChildUncheckedException extends ParentClass7 {

	void testMethod() throws ArithmeticException
	{
		throw new ArithmeticException("Arithmatic Exception");
	}
	public static void main(String[] args) {
		ParentClass7 pc = new ParentCheckedExceptionChildUncheckedException();
		try {
			pc.testMethod();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	} 
}
