package com.hany.jpa.primer02;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class StudentTest {

	private EntityManagerFactory emf;
	private EntityManager em;

	@BeforeEach
	public void setup() {
		emf = Persistence.createEntityManagerFactory("jpa-entity-definition");
		em = emf.createEntityManager();
	}


    @AfterEach
	public void destroy() {
		if (em != null) {
			em.close();
		}
		if (emf != null) {
			emf.close();
		}
	}
    
}