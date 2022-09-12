package Interface_Default_Method;
// 	The default methods in the interface are defined with the default keyword.
//  You can call a default method of the interface from the class that provides the implementation of the interface.
//  Syntax: To define a default method in the interface, we must use the “default” keyword with the method signature.

interface Drawable{
	void draw();
	
	default void msg()
	{
		System.out.println("Default Method Called From Drawable Interface...");
	}
}

interface Shapeable {
	default void msg()
	{
		System.out.println("Defaault method called from shapeable Interface");
	}
}

class Rectangle implements Drawable,Shapeable{
	public void draw()
	{
		System.out.println("Draw Method from Rectangle Called...");
	}
	
	@Override
	public void msg()
	{
		Drawable.super.msg();
	}
}

public class DefaultMethodInInterface {

	public static void main(String[] args) {
		Drawable dw = new Rectangle();
		dw.draw();
		dw.msg();
	}
}


