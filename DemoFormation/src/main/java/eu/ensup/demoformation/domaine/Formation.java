package eu.ensup.demoformation.domaine;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; // ID formation 
	private String theme; // Theme formation
	private Date dateDebut;
	private int duree;
	
	public Formation() {
		super();
	}
	public Formation(String theme) {
		super();
		this.theme = theme;
	}
	public Formation(String theme, Date dateDebut, int duree) {
		super();
		this.theme = theme;
		this.dateDebut = dateDebut;
		this.duree = duree;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	
}
