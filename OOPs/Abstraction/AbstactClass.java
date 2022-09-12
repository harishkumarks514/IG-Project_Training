package Abstraction;

abstract class Shape {
	Shape() {
		System.out.println("Shape is created...");
	}

	abstract void draw();

	void redraw() {
		System.out.println("Redrawing the shape...");
	}
}

	class Rectangle extends Shape{

		@Override
		void draw() {
			// TODO Auto-generated method stub
			System.out.println("Drawing  Rectangle...");
		}
	
	}
	

public class AbstactClass {

	public static void main(String[] args) {
		Shape s = new Rectangle();
		 
		s.draw();
		s.redraw();
	}
}
