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
public abstract class Commercial extends Employe {

	private double chiffreAffaire;

	public Commercial() {
	}

	public Commercial(String prenom, String nom, int age, Date date,
			double chiffreAffaire) {
		super(nom, prenom, age, date);
		this.setChiffreAffaire(chiffreAffaire);
	}

	public double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

	@Override
	public abstract double calculerSalaire();

}
