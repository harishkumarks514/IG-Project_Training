package ExceptionInAbstraction;

import java.io.IOException;

interface Myinterface3 {
	abstract void testMethod3() throws Exception;
}

public class AbstractionSuperClassThrowingExceptionChildSubTypeException implements Myinterface3 {

	@Override
	public void testMethod3() throws ArithmeticException {
		// TODO Auto-generated method stub
		throw new ArithmeticException("Arithmetic Exception");
	}

	public static void main(String[] args) {

		Myinterface3 intf = new AbstractionSuperClassThrowingExceptionChildSubTypeException();
		try {
			intf.testMethod3();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
