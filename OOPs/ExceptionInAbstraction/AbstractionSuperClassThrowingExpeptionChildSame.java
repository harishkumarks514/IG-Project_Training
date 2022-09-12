package ExceptionInAbstraction;

import java.io.IOException;

interface Myinterface {
	abstract void display() throws IOException;
}

public class AbstractionSuperClassThrowingExpeptionChildSame implements Myinterface {

	@Override
	public void display() throws IOException {
		// TODO Auto-generated method stub
		throw new IOException("IO EXCEPTION");
	};

	public static void main(String[] args) {
		Myinterface intfact = new AbstractionSuperClassThrowingExpeptionChildSame();
		try {
			intfact.display();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}