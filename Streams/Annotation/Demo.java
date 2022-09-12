package Annotation_In_Java;
public class Demo {
//	Method
	public void display()
	{
		System.out.println("BASE CLASS...kkk");
	}
}
//	main class
	class Derived extends Demo
	{
//		Overriding method as already up in above class
		@Override
		public void display(int x) {
				System.out.println("Derived display (int)");
		}
		
//		Method 2 
//		Main derived method
		public static void main(String[] args) {
			Derived dv = new Derived();
			dv.display();
		}
	}
