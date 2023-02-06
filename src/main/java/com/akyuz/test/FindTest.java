package com.akyuz.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.akyuz.pojo.Personel;

public class FindTest {
	
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		Personel personel = manager.find(Personel.class, 1);
		if(personel != null) {
			
			System.out.println("Personel Name : "+personel.getFirstName()+" Personel Surname : "+personel.getLastName());
		}else {
			System.out.println("Personel not found!");
		}

	}

}
