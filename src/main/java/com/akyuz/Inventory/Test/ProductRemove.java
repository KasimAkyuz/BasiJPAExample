package com.akyuz.Inventory.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.akyuz.Inventory.Entity.Product;

public class ProductRemove {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		long productId=2L;
		
		manager.getTransaction().begin();	
		Product product = manager.getReference(Product.class, productId);
		
		manager.remove(product);		
		manager.getTransaction().commit();
		manager.close();

	}

}
