package ExceptionInPolymorphism;
import java.io.IOException;
 

 
public class ParentUncheckedExceptionChildNoException   {

	void testMethod()  
	{
		System.out.println("No exception thrown  by child class.");
	}
	
	public static void main(String[] args) {
		ParentClass33 pc = new ParentUnCheckedExceptionChildCheckedException();
	}
}