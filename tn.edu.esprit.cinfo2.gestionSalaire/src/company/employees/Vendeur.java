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
public class Vendeur extends Commercial {

	private final static double POURCENT_VENDEUR = 0.2;
	private final static int BONUS_VENDEUR = 400;

	public Vendeur(String prenom, String nom, int age, Date date,
			double chiffreAffaire) {
		super(prenom, nom, age, date, chiffreAffaire);
	}

	public String getTitre() {
		return "Le vendeur ";

	}

	@Override
	public double calculerSalaire() {
		
		return super.getChiffreAffaire() * POURCENT_VENDEUR + BONUS_VENDEUR;

	}

}
