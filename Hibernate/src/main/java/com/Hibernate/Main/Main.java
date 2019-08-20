package com.Hibernate.Main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Annotation.FruitPrimaryKey;
import com.Hibernate.Annotation.Fruits;
import com.Hibernate.OneToOneMapping.StudentDetail;
import com.Hibernate.OneToOneMappingUniBidirectional.Order;
import com.Hibernate.OneToOneMappingUniBidirectional.OrderDetail;
import com.Hibernate.TableCreate.Employee;
import com.Hibernate.TableCreate.Student;
import com.Hiberntate.HibernateUtil.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student Details from Package TableCreate
		/*
		 * Student student=new Student(); student.setId(2);
		 * student.setName("Manmath M");
		 */
		// Employee details from Package TableCreate
		/*
		 * Employee employee=new Employee(); employee.setEid(11);
		 * employee.setEname("Manmath M");
		 */
		// Fruit Details from Package Annotation
		/*
		 * Fruits fruits=new Fruits(); fruits.setFruitCount(10);
		 * fruits.setFruitName("Apple"); fruits.setFruitDelivery("New Dehli");
		 * fruits.setDeliveryDate(new Date());
		 */
		// FruitPrimaryKey Details from Package Annotation
		/*
		 * FruitPrimaryKey fruitPrimaryKey=new FruitPrimaryKey();
		 * fruitPrimaryKey.setFruitName("CrusterApple"); FruitPrimaryKey
		 * fruitPrimaryKey1=new FruitPrimaryKey();
		 * fruitPrimaryKey1.setFruitName("PineApple");
		 */
		// Student and StudentDetail class from Package OneToOneMapping
		/*
		 * com.Hibernate.OneToOneMapping.Student studentt=new
		 * com.Hibernate.OneToOneMapping.Student();
		 * studentt.setStudent_name("Manmath M");
		 * 
		 * StudentDetail studentDetail=new StudentDetail();
		 * studentDetail.setStudent_mobile_nuumber("92XXXX92XX"); //This is an important
		 * step studentDetail.setStudent(studentt);
		 */
		// Order and OrderDetail class from Package OneToOneMappingUniBidirectional
		/*
		 * Order order = new Order(); order.setOrderName("Pizza");
		 * 
		 * OrderDetail orderDetail = new OrderDetail();
		 * orderDetail.setOrderStatus("Cooking"); orderDetail.setOrder(order);
		 * 
		 * order.setOrderDetail(orderDetail);
		 */

		HibernateUtil hibernateUtil = new HibernateUtil();
		// hibernateUtil.Hibernate(orderDetail);
		// hibernateUtil.Hibernate(studentDetail);
		/*
		 * hibernateUtil.Hibernate(fruitPrimaryKey1);
		 * hibernateUtil.Hibernate(fruitPrimaryKey);
		 */
		// hibernateUtil.Hibernate(fruits);
		// hibernateUtil.Hibernate(employee);
		// hibernateUtil.Hibernate(student);

	}

}
