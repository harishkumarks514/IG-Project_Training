package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;


public class Main {
		public static void main(String[] args)
		{
	try
	{
	Configuration c=new Configuration().configure();
	SessionFactory sf=c.buildSessionFactory();
	Session ss= sf.openSession();
	Transaction t=ss.beginTransaction();
	
	Person pp=new Person();
        pp.setAge(22);
        pp.setName("Rakesh");
        pp.setAddress("mysore");
        t.commit();
}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
