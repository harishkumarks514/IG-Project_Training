package ExceptionInMethodOverriding;

public class SuperClassDoesnotDeclareAnExceptionSubclassDeclaresUnCheckedException {

	void method()
    {
        System.out.println("SuperClass");
    }
}

class subClass111 extends SuperClassDoesnotDeclareAnExceptionSubclassDeclaresUnCheckedException
{
	// method() declaring Unchecked Exception ArithmeticException
	void method() throws ArithmeticException
    {
 
        // ArithmeticException is of type Unchecked Exception
        // so the compiler won't give any error
 
        System.out.println("SubClass");
    }
	// Driver code
    public static void main(String args[])
    {
    	SuperClassDoesnotDeclareAnExceptionSubclassDeclaresUnCheckedException s = 
    			new SuperClassDoesnotDeclareAnExceptionSubclassDeclaresUnCheckedException();
        s.method();
    }
	}