package com.akyuz.Inventory.Test;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



import com.akyuz.Inventory.Entity.Product;





public class QueryList {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		
		String sorgu = "select product from Product as product where product.salesPrice> :salesPrices";
		
		
		
		Query query = manager.createQuery(sorgu);
		
		query.setParameter("salesPrices", 110.00);
		
		List<Product> productList = query.getResultList();
		
		
		manager.close();
		
		for(Product product : productList) {
			
			System.out.println(product.getProductName());
		}
		
	}
	

	
	
	

}
