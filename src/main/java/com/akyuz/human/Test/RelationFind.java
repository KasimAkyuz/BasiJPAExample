package com.akyuz.human.Test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.akyuz.Inventory.Entity.Product;
import com.akyuz.human.entity.Department;
import com.akyuz.human.entity.Emploee;

public class RelationFind {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		long departmentId=1L;
		
		manager.getTransaction().begin();
		
		Department department = manager.find(Department.class, departmentId);
		
		manager.getTransaction().commit();
	
		manager.close();
		
		
		List<Emploee> emploeeList= department.getEmploeeList();
		
		emploeeList.forEach(emploee -> System.out.println(emploee.getEmploeeName()));
		
	}

}
