package ExceptionInPolymorphism;

import java.io.IOException;

class ParentClass122 {
	void testMethod() throws IOException, ArithmeticException {
		throw new IOException("IO Exception");
	}
}

public class ParentCheckedAndUncheckedExceptionChildUnCheckedException extends ParentClass122 {

	void testMethod()throws NullPointerException
	{
		throw new NullPointerException("Nullpointer Exception");
	}
	public static void main(String[] args) {
		ParentClass122 pc = new ParentCheckedAndUncheckedExceptionChildUnCheckedException();
		try {
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
