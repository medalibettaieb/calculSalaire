package company.employees;

import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Takwa
 */
public abstract class Technicien extends Employe {

	private final static double FACTEUR_UNITE = 5.0;
	private int unites;

	public Technicien(String prenom, String nom, int age, Date date, int unites) {
		super(nom, prenom, age, date);
		this.setUnites(unites);
	}

	public String getTitre() {
		return "Le technicien ";

	}

	@Override
	public abstract double calculerSalaire();

	public static double getFacteurUnite() {
		return FACTEUR_UNITE;
	}

	public int getUnites() {
		return unites;
	}

	public void setUnites(int unites) {
		this.unites = unites;
	}

}
