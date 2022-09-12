// Java proh=gram to Demonstrate Type Annotation

package Annotation_In_Java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//Using target annotation to annotate a type
@Target(ElementType.TYPE_USE)

// Declaring a simple type annotation
@interface TypeAnnoDemo {
}

//Main class
public class GFG_TypeAnnotation {

	public static void main(String[] args) {
//		Annotating the type of a String
		@TypeAnnoDemo String string = "I am annotated with a type annotation";
		System.out.println(string);
		abc();
	}
//	Annotating return type of a function
	static @TypeAnnoDemo int abc() {
		
		System.out.println("This function's return type is a annotated");
		return 0;
	}
}
