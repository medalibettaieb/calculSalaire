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

public class TechnARisque extends Technicien {

	public float PRIME = 200;

	public TechnARisque(String prenom, String nom, int age, Date date,
			int unites) {

		super(prenom, nom, age, date, unites);

	}

	@Override
	public double calculerSalaire() {
		return super.getUnites() * 5 + PRIME;
	}
}
