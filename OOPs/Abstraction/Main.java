package Abstraction;

abstract class Animal
{
	public abstract void animalSound();
	public void sleep()
	{
		System.out.println("Zzzzz");
	}
}

//Animal an = new Animal(); // Its not possible to create an object of the Animal class:  
//To access the animal class, it must be inherited from another class. 

//Subclass (inherit from Animal)
class Pig extends Animal {
	public void animalSound()
	{
//		The body of animalSound() is provided here.
		System.out.println("The pig says: Wee Wee");
	}
}




public class Main {

	public static void main(String[] args) {
		Pig myPig = new Pig(); // creating the pig object.
		myPig.animalSound();
		myPig.sleep();
	
	
	}
}
