package com.pack.org;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new FileSystemXmlApplicationContext("Info.xml");
        Student st = (Student) context.getBean("stud1");
        System.out.println(st.getId() + " " + st.getName() + " " + st.getAge());
	}

}
