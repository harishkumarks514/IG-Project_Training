package DesignPatterns;
//Step one to create a singleton class
public class SingleObject {

//	create an object of SingleObject
	private static SingleObject instance  = new SingleObject();
	
//	 Make the constructor private so that this class cannot be instantiated
	
	private SingleObject()
	{}
	
//	Get the only object availablle 
	public static SingleObject getInstance() {
		return instance;
	}
	 public void showMessage() {
		// TODO Auto-generated method stub

		System.out.println("HELLO WORLD");
	}
}

// Step two
//get the only object from the singleton class

 
  class SingletonPatternDemo {

	public static void main(String[] args) {
		
//		illegal constructor
//		Compile time Error: The constructor SingletonObject is not visible 
		
//		SingleObject obj = new SingleObject();
		
//		Gej the only object available
		SingleObject obj = SingleObject.getInstance();
		obj.showMessage();
		
	}
}
 