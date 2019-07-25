package com.xailabs.kontaktliste;





import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;





public class Emf {

	private static EntityManagerFactory emFactory;
	public static String Kontakten = "kontakten";
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if(emFactory == null) {
			emFactory = Persistence.createEntityManagerFactory("kontakten");
		
		}
		return emFactory;
	}

	

	public static EntityManager getEntityManager() {
		return getEntityManagerFactory().createEntityManager();
	}

	public static void close() {
		getEntityManagerFactory().close();
	}

	

}