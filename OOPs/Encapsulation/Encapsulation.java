package Encapsulation;

public class Encapsulation {

//	Binding of data and corresponding methods into a single unit is called Encapsulation.

//	If any java class follows data hiding and abstraction such type of class is said to be encapsulated class.

//	Encapsulation = DataHiding + Abstraction.

//	tightly encapsulated class 
//	 A class is said to be tightly encapsulated if and only if every variable of that class declared as private
//	whether the variable has getter and setter methods are not, and whether these methods declared as public or not, these 
//	checkings are not required to perform.

//	Example 
	class Account {
		private double balance;

		public double getBalance() {
			return balance;
		}

	}

//	which of the following classes are tightly encapsulated?

	class A {
		private int x = 10; // (valid)
	}

	class B extends A {
		int y = 20; // (Invalid)
	}

	class C extends A {
		private int z = 30; // (valid)
	}

//	which of the following class are tightly encapsulated?

	class AA {
		int x = 10; // (invalid)
	}

	class BB extends AA {
		private int y = 20; // (invalid)
	}

	class CC extends BB {
		private int z = 30; // (invalid)
	}
//	 NOTE; if the parent class in not tightly encapsulated then no child class is tightly encapsulated.

}
