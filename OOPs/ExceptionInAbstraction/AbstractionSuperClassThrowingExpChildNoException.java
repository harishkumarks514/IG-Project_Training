package ExceptionInAbstraction;

import java.io.IOException;

interface MyInterface2
	{
		abstract void testMethod() throws IOException;
	}

	

public class AbstractionSuperClassThrowingExpChildNoException implements MyInterface2 {

	@Override
	public void testMethod() throws IOException {

		System.out.println("Child class throwing no exception...");
	}
	
	public static void main(String[] args) {
		MyInterface2 ie = new AbstractionSuperClassThrowingExpChildNoException();
		try {
			ie.testMethod();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	
}
