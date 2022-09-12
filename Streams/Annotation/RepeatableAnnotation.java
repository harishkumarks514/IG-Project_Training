package Annotation_In_Java;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//Java Program to Demonstrate a Repeatable Annotation

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)

@interface Words {
	String word() default "Hello";

	int value() default 0;
}

//create container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
	Words[] value();
}

public class RepeatableAnnotation {
	@Words(word = "First",value =1)
	@Words(word = "Second", value = 2)
	
	public static void newMethod()
	{
		RepeatableAnnotation ra = new RepeatableAnnotation();
		
		try {
			Class<?> c = 	ra.getClass();
//			Obtain the annotation for newMethod
			Method m = c.getMethod("newMethod");
//			Display the repeated annotation
			Annotation anno =
					m.getAnnotation(MyRepeatedAnnos.class);
			System.out.println(anno);
		}
		catch(NoSuchMethodException e) 
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		newMethod();
	}
}
