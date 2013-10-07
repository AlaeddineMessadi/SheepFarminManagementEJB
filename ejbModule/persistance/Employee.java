package persistance;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

import persistance.User;

/**
 * Entity implementation class for Entity: Farmer
 *
 */
@Entity

public class Employee extends User implements Serializable {

	
	private String poste;
	private int cin;
	private Batiment batiment ;
	private static final long serialVersionUID = 1L;

	public Employee() {
		super();
	}   
	public String getPoste() {
		return this.poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}   
	public int getCin() {
		return this.cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="batiment")
	public Batiment getBatiment() {
		return batiment;
	}
	public void setBatiment(Batiment batiment) {
		this.batiment = batiment;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cin;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (cin != other.cin)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [poste=" + poste + ", cin=" + cin + ", batiment="
				+ batiment + ", getIdUser()=" + getIdUser()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getLogin()=" + getLogin() + ", getPwd()="
				+ getPwd() + ", getEmail()=" + getEmail() + ", getPhone()="
				+ getPhone() + ", getAdress()=" + getAdress() + ", toString()=" + super.toString() + "]";
	}
   
}
