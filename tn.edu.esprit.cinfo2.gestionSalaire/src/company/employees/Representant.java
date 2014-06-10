/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package company.employees;

import java.util.Date;

/**
 * 
 * @author USER
 */
public class Representant extends Commercial {

	private static final double POURCENT_REPRESENTANT = 0.2;
	private static final int BONUS_REPRESENTANT = 800;

	public Representant(String prenom, String nom, int age, Date date,
			double chiffreAffaire) {

		super(prenom, nom, age, date, chiffreAffaire);
	}

	public String getTitre() {
		return "Le représentant ";

	}

	@Override
	public double calculerSalaire() {
		return super.getChiffreAffaire() * POURCENT_REPRESENTANT
				+ BONUS_REPRESENTANT;
	}
}
