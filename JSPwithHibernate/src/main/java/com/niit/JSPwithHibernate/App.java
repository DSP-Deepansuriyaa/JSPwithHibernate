package com.niit.JSPwithHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        
        Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		shoes e = new shoes();
		e.setSno(1);
		e.setBrand("puma");
		e.setPrice("2500");
		Session s=sessionFactory.openSession();
		Transaction txt=s.beginTransaction();
		s.save(e);
		txt.commit();
		s.close();
		sessionFactory.close();
    }
}
