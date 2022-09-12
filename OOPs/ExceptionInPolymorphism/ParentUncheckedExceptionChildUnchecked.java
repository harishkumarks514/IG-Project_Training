package ExceptionInPolymorphism;

class ParentClass32 {
	public void testMethod() throws ArithmeticException {
		throw new ArithmeticException("Arithmethic exception");
	}
}

public class ParentUncheckedExceptionChildUnchecked extends ParentClass32 {
	
	public void testMethood() throws NullPointerException
	{
		throw new NullPointerException("Null Pointer exception");
	}
	public static void main(String[] args) {
		ParentClass32 pc = new ParentUncheckedExceptionChildUnchecked();
		try{
			pc.testMethod();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
