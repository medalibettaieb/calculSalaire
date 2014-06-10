package company.employees;

import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author USER
 */
public abstract class Manutentionnaire extends Employe {

	private final static double SALAIRE_HORAIRE = 65.0;
	private int heures;

	public Manutentionnaire(String prenom, String nom, int age, Date date,
			int heures) {
		super(nom, prenom, age, date);
		this.setHeures(heures);
	}

	public String getTitre() {
		return "Le manut. ";

	}

	@Override
	public abstract double calculerSalaire();

	public static double getSalaireHoraire() {
		return SALAIRE_HORAIRE;
	}

	public int getHeures() {
		return heures;
	}

	public void setHeures(int heures) {
		this.heures = heures;
	}

}