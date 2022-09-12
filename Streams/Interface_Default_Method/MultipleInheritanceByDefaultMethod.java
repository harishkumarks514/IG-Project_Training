package Interface_Default_Method;

//Now we have basic knowledge of the default method. Let’s discuss some complex things about the default method.

//	A class can extend only one class in java but can implement N number of interfaces. Let’s say we have two interfaces having the same default method which are implemented by a single class. The class will get confused which default method to call.

interface Draw {
	default void show() {
		System.out.println("This is default method of Draw Interface.");
	}

	void DrawData();
}

interface print {
	default void show() {
		System.out.println("This is default method of print Interface");
	}

	void printData();
}

class ManageRecord implements Draw,print
{

	@Override
	public void printData() {
		// TODO Auto-generated method stub
		System.out.println("PrintData method Implemented by ManageRecord class");
	}

	@Override
	public void DrawData() {
		// TODO Auto-generated method stub
		System.out.println("DrawData method Implemented by ManageRecord class");
	}
	
	@Override
	public void show()
	{
		Draw.super.show();
		print.super.show();
	}
	
	}

public class MultipleInheritanceByDefaultMethod {

	public static void main(String[] args) {
		ManageRecord obj = new ManageRecord();
		obj.DrawData();
		obj.printData();
		obj.show();
	}
}
