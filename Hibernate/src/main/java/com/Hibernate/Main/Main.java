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

import com.Hibernate.Annotation.Fruits;
import com.Hibernate.TableCreate.Employee;
import com.Hibernate.TableCreate.Student;
import com.Hiberntate.HibernateUtil.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student Details
		/*
		 * Student student=new Student(); student.setId(2);
		 * student.setName("Manmath M");
		 */		
		//Employee details
		/*
		 * Employee employee=new Employee(); employee.setEid(11);
		 * employee.setEname("Manmath M");
		 */
		Fruits fruits=new Fruits();
		fruits.setFruitCount(12);
		fruits.setFruitName("Apple");
		fruits.setFruitDelivery("New Dehli");
		
		HibernateUtil hibernateUtil=new HibernateUtil();
		hibernateUtil.Hibernate(fruits);
		//hibernateUtil.Hibernate(employee);
		//hibernateUtil.Hibernate(student);
	
	
	}

}
