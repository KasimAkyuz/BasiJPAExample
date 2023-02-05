package com.akyuz.Inventory.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.akyuz.Inventory.Entity.Product;

public class ProductMerge {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		long productId=2L;
		
		manager.getTransaction().begin();	
		Product product = manager.find(Product.class, productId);
		product.setProductName("Magsafe");
		manager.merge(product);		
		manager.getTransaction().commit();
		manager.close();

	}

}
