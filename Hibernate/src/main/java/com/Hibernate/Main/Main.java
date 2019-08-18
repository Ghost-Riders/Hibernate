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

import com.Hibernate.TableCreate.Employee;
import com.Hibernate.TableCreate.Student;
import com.Hiberntate.HibernateUtil.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student Details
		Student student=new Student();
		student.setId(1);
		student.setName("Manmath M");
		
		//Employee details
		Employee employee=new Employee(10, "Manmath M");
		
		HibernateUtil hibernateUtil=new HibernateUtil();
		hibernateUtil.Hibernate(employee);
		hibernateUtil.Hibernate(student);
	
	
	}

}
