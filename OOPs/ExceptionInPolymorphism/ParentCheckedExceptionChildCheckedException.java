package ExceptionInPolymorphism;

import java.io.IOException;

class ParentClass8 {
	void testMethod() throws IOException {
		throw new IOException("IO exception");
	}
}

public class ParentCheckedExceptionChildCheckedException {

	void testMethod() throws IOException
	{
		throw new IOException("IO Exception");
	}
	
	public static void main(String[] args) {
		ParentClass8 pc = new ParentCheckedExceptionChildCheckedException();
		try{
			pc.testMethod();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
