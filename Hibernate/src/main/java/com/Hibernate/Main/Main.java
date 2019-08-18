package com.Hibernate.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.Hibernate.TableCreate.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setId(10);
		student.setName("manmath");
		
//		Configuration con=new Configuration().addResource("hibernate.cfg.xml");
//		SessionFactory sessionFactory=con.buildSessionFactory();
//		Session session=sessionFactory.openSession();
//		Transaction tx=session.beginTransaction();
//		session.save(student);
//		tx.commit();
	
		StandardServiceRegistry standardregistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata metadata=new MetadataSources(standardregistry).getMetadataBuilder().build();
		
		SessionFactoryBuilder sessionFactoryBuilder=metadata.getSessionFactoryBuilder();
		
		SessionFactory sessionFactory=sessionFactoryBuilder.build();
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(student);
		tx.commit();

	}

}
