package com.akyuz.dbBasic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		Data data = new Data(0, "çakır", 145.00);
		
		manager.getTransaction().begin();
		
		manager.persist(data);
		
		manager.getTransaction().commit();
		
	}
}
