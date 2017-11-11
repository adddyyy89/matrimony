package com.matrimony.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Hibernate {
	public static SessionFactory sessionFactory;
	public static String defaultFolder = "C://matrimony";

	public static void initialize() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		Hibernate.sessionFactory = configuration.buildSessionFactory(builder.build());
	}
}
