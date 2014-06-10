package company.test;

import java.util.Date;

import company.employees.ManutARisque;
import company.employees.Personnel;
import company.employees.Representant;
import company.employees.TechnARisque;
import company.employees.Vendeur;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author USER
 */
class Salaires {

	public static void main(String[] args) {

		Personnel p = new Personnel();
		p.ajouterEmploye(new Vendeur("Pierre", "Business", 45, new Date(),
				30000));

		p.ajouterEmploye(new Representant("Léon", "Vendtout", 25, new Date(),
				20000));

		p.ajouterEmploye(new TechnARisque("Yves", "Bosseur", 28, new Date(),
				1000));

		p.ajouterEmploye(new ManutARisque("Jeanne", "Stocketout", 32,
				new Date(), 45));

		p.ajouterEmploye(new TechnARisque("Jean", "Flippe", 28, new Date(),
				1000));

		p.ajouterEmploye(new ManutARisque("Al", "Abordage", 30, new Date(), 45));

		p.afficherEmploye();

		p.afficherSalaires();

		System.out.println("Le salaire moyen dans l'entreprise est de "
				+ p.salaireMoyen() + " dinars.");

	}
}
