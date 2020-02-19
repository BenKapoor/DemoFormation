package eu.ensup.demoformation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eu.ensup.demoformation.domaine.Formation;

public class FormationDao implements IFormationDao {

	public int creerEtudiant(Formation formation) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demoFormation");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx =  em.getTransaction();
		try {
			tx.begin();

			em.persist(formation);
			
			tx.commit();
			
			em.close();
			emf.close();
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

}
