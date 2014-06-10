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
public abstract class Employe {

	private String nom;
	private String prenom;
	private int age;
	private Date date;

	public Employe() {
	}

	public Employe(String nom, String prenom, int age, Date date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (age != other.age)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTitre() {
		return "L'employé ";

	}

	public String getNom() {
		return getTitre() + prenom + " " + nom;

	}

	public abstract double calculerSalaire();

}
