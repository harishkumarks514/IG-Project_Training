package Annotation_In_Java;
//Java Program to illustrate SuppressWarnings Annotation


class DeprecatedTest1
{
	@Deprecated
	public void Display()
	{
		System.out.println("Deprecatedtest Display()");
	}
	}

//class 2 
public class SuppressWarnings {
//	If we comment below annotation, program generates warning
	@SuppressWarnings({"checked","deprecated"})
	public static void main(String[] args) {
		DeprecatedTest1 d1 = new DeprecatedTest1();
		d1.Display();
	}
}

