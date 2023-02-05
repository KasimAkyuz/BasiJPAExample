package com.akyuz.Inventory.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.akyuz.Inventory.Entity.Product;

public class ProductFind {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		
		long productId = 1L;
		
		manager.getTransaction().begin();
		Product product = manager.find(Product.class, productId);
	
		manager.getTransaction().commit();
		manager.close();
		
		System.out.println("Urun : "+product.getProductName()+" Satis Fiyati : "+product.getSalesPrice());
	}

}
