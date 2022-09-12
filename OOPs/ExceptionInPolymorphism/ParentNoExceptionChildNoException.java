package ExceptionInPolymorphism;

import ExceptionHandlingInConstructor.Parent2;

class ParentClass2 {
	public void testMethod() {

	}
}

public class ParentNoExceptionChildNoException extends ParentClass2 {
	@Override
	public void testMethod()
	{
		System.out.println("Thest class method called from child class...");
	}
	
	public static void main(String[] args) {
		ParentClass2 pc = new ParentNoExceptionChildNoException();
		pc.testMethod();
	}
	
}
