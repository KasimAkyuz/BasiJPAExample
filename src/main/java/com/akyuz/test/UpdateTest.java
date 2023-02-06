package com.akyuz.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.akyuz.pojo.Personel;



public class UpdateTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		Personel personel= manager.find(Personel.class, 1);
		personel.setLastName("kara");
		
		manager.getTransaction().begin();
		manager.merge(personel);
		manager.getTransaction().commit();
		
		
		
		
		
		
	}

}
