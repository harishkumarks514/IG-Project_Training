package Interface_Default_Method;

interface InterfaceName {
	default void methodName() {
//		Body of default method
	}
}

interface InterfaceWithDefaultMethod {

	default void show() {
		System.out.println("This is default method...");
	}

	void printDate();
}

public class MainClass implements InterfaceWithDefaultMethod {

	@Override
	public void printDate() {
		System.out.println("Implementing abstract method in separate class");

	}

	public static void main(String[] args) {

		MainClass obj = new MainClass();
//		calling default method.
		obj.show();

//		calling implemented method of same class
		obj.printDate();
	}

}


//	1. The default methods help to extend the functionality of interfaces without breaking the implementation of existing classes.
//	2. By the use of default methods in interfaces, the Collections API was enhanced in Java 8 to support lambda expressions.