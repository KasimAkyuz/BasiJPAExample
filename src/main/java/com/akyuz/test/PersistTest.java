package com.akyuz.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.akyuz.pojo.Personel;

public class PersistTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		Personel personel1 = new Personel("mehmet","düz", new Date(),"11112");
		
		
		manager.getTransaction().begin();
		
		manager.persist(personel1);
		
		manager.getTransaction().commit();
		
		manager.close();

	}

}
