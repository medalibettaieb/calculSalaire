package company.employees;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Takwa
 */
public class Personnel {
	private Employe[] staff;

	private int nbreEmploye;
	private final static int MAXEMPLOYE = 200;
	private double cumulSalair = 0;

	public Personnel() {
		staff = new Employe[MAXEMPLOYE];
		nbreEmploye = 0;
	}

	public void ajouterEmploye(Employe employe) {
		if (nbreEmploye < MAXEMPLOYE) {
			staff[nbreEmploye] = employe;
			nbreEmploye++;
		}
	}

	public double salaireMoyen() {

		return cumulSalair / nbreEmploye;
	}

	public void afficherEmploye() {
		for (Employe e : staff) {
			if (e != null) {
				System.out.println(e.getNom());
			}
		}
	}

	public void afficherSalaires() {
		cumulSalair = 0;
		for (Employe e : staff) {
			if (e != null) {
				System.out.println(e.calculerSalaire());
				cumulSalair += e.calculerSalaire();
			}
		}
	}
}