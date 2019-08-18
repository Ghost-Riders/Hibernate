package com.Hiberntate.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	public void Hibernate(Object object) {
		StandardServiceRegistry standardregistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();

		Metadata metadata = new MetadataSources(standardregistry).getMetadataBuilder().build();

		SessionFactoryBuilder sessionFactoryBuilder = metadata.getSessionFactoryBuilder();

		SessionFactory sessionFactory = sessionFactoryBuilder.build();

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(object);
		tx.commit();

	}
}
