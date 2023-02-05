package com.akyuz.human.Test;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.akyuz.Inventory.Entity.Product;
import com.akyuz.human.entity.Department;
import com.akyuz.human.entity.Emploee;

public class RelationPersist {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		Department departmentA= new Department(0,"Muhasebe");
		departmentA.setEmploeeList(new ArrayList<>());
		Emploee emploee1= new Emploee(0, "kasım", 2000.00);
		Emploee emploee2= new Emploee(0, "mustafa", 3000.00);
		emploee1.setDepartmentname(departmentA);
		emploee2.setDepartmentname(departmentA);
		departmentA.getEmploeeList().add(emploee1);
		departmentA.getEmploeeList().add(emploee2);
		
		manager.getTransaction().begin();				
		manager.persist(departmentA);
		manager.getTransaction().commit();
		manager.close();

	}
}
