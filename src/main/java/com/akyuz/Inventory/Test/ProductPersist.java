package com.akyuz.Inventory.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.akyuz.Inventory.Entity.Product;

public class ProductPersist {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		Product product = new Product(0, "Akıllı Saat", 85.00);
		
		manager.getTransaction().begin();		
		manager.persist(product);		
		manager.getTransaction().commit();
		manager.close();

	}

}
