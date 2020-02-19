package eu.ensup.demoformation.service;

import eu.ensup.demoformation.dao.FormationDao;
import eu.ensup.demoformation.dao.IFormationDao;
import eu.ensup.demoformation.domaine.Formation;

public class FormationService implements IFormationService{

	IFormationDao dao = new FormationDao();
	
	public int creerEtudiant(Formation formation) {
		// TODO Auto-generated method stub
		return dao.creerEtudiant(formation);
	}

}
