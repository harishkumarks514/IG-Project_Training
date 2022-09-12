package DesignPatterns;
// Classical Java implementation of Singleton design pattern

public class Singleton {

	private static Singleton obj;

//	private constructor to force use of getInstance() 
//	to create Singleton object
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance()
	{
		if(obj == null)
			obj = new Singleton();
		return obj;
	}
}