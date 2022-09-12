/package ExceptionInPolymorphism;

import java.io.IOException;

class ParentClass {
	void testMethod() throws IOException, ArithmeticException

	{
		throw new IOException("IO Exception");
	}
}

public class ParentCheckedAndUncheckedExceptionChildCheckedException extends ParentClass {

	@Override
	void testMethod() throws IOException
	{
		throw new IOException("IO Exception");
	}
	public static void main(String[] args) {
		ParentClass p1 = new ParentCheckedAndUncheckedExceptionChildCheckedException();
		try {
			p1.testMethod();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
