package Interface_Default_Method;

//1. The static methods in Interface are defined with the static keyword.
//2.  You can define static default methods in the interface. The static method will be available for all instances of the class that implements the interface.

//Syntax: To define a static default method in the interface, we must use the “static” keyword with the method signature.


interface InterfaceNamee {
	static void methodName() {
//		Body of default method
	}
}

interface InterfaceWithStaticMethod {

	static void show()
	{
		System.out.println("This is static default method");
	}
	void printData();
}

public class StaticMethod_In_Interface implements InterfaceWithStaticMethod {

	@Override
	public void printData() {
		// TODO Auto-generated method stub
		System.out.println("Implementing abstract method in separate class");
	}
	public static void main(String[] args) {
		StaticMethod_In_Interface obj = new StaticMethod_In_Interface();
//		calling static default method
		InterfaceWithStaticMethod.show();
		
//		calling implemented method of same class
		obj.printData();
	}

}
