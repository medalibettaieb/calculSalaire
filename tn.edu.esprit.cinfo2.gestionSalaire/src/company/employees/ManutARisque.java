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

public class ManutARisque extends Manutentionnaire {

	public float PRIME = 200;

	public ManutARisque(String prenom, String nom, int age, Date date,
			int heures) {

		super(prenom, nom, age, date, heures);

	}

	@Override
	public double calculerSalaire() {

		return super.getHeures() * super.getSalaireHoraire() + PRIME;
	}

}
