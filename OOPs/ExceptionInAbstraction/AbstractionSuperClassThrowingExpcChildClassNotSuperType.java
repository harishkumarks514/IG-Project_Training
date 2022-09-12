package ExceptionInAbstraction;

interface MyInterface1 {
	abstract void testMethod() throws ArithmeticException;
}

public class AbstractionSuperClassThrowingExpcChildClassNotSuperType  implements MyInterface1{

	@Override
	public void testMethod() throws ArithmeticException {
		// TODO Auto-generated method stub
		System.out.println("This is compiletime error...");
	}

	public static void main(String[] args) {
		MyInterface1 ie = new AbstractionSuperClassThrowingExpcChildClassNotSuperType();
		ie.testMethod();
	}
	
}
