package com.xailabs;

import java.util.List;

import javax.persistence.EntityManager;


import com.xailabs.kontaktliste.Emf;

public class Connect {

	public void speichern(Kontaktliste kontaktliste) {

		EntityManager entityManager = Emf.getEntityManager();
		entityManager.getTransaction().begin();

		entityManager.persist(kontaktliste);
		entityManager.getTransaction().commit();
		entityManager.close();
		Emf.close();
	}

	public List<Kontaktart> getAllKontaktarten() {
		
		  
		
		 EntityManager entityManager = Emf.getEntityManager();
		 
		 return entityManager.createNamedQuery("kontaktarten",Kontaktart.class).getResultList();
	}

}
