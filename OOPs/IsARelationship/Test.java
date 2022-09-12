package IsARelationship;

class Parent {

	public void methodOne() {

		System.out.println("PARENT");
	}
}

class Child extends Parent {
	public void methodTwo() {

		System.out.println("CHILD");
	}
}

public class Test {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.methodOne();
//		p.methodTwo(); //CE: cannot find symbol
		Child c = new Child();
		c.methodOne();
		c.methodTwo();
		Parent p1 = new Child();
		p1.methodOne();
//		p1.methodTwo();  // parent class reference can be used to hold child child class object but by using that 
//		reference we can call only methods available in parent class and child specific methods we can't call.
//		Child c1 = new Parent(); // incompatible types  
		// child class reference cannot be used to hold parent class object.
	}
}
