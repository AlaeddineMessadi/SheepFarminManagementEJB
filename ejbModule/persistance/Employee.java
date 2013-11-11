package persistance;

import static javax.persistence.CascadeType.MERGE;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;

import persistance.User;
import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

/**
 * Entity implementation class for Entity: Farmer
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@XmlRootElement
public class Employee extends User implements Serializable {

	
	private String poste;
	private String cin;
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
	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}
	
	@ManyToOne(cascade = ALL)
	@JoinColumn(name="batiment")
	@JsonIgnore
	public Batiment getBatiment() {
		return batiment;
	}
	public void setBatiment(Batiment batiment) {
		this.batiment = batiment;
	}
	
	public Employee(String firstName, String lastName, String login,
			String pwd, String email, String phone, String adress,String poste, String cin,byte[] photo) {
		this.setAdress(adress);
		this.setEmail(email);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setLogin(login);
		this.setPwd(pwd);
		this.setPhone(phone);
		this.poste = poste;
		this.cin = cin;
		this.setPhoto(photo);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((batiment == null) ? 0 : batiment.hashCode());
		result = prime * result + ((cin == null) ? 0 : cin.hashCode());
		result = prime * result + ((poste == null) ? 0 : poste.hashCode());
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
		if (batiment == null) {
			if (other.batiment != null)
				return false;
		} else if (!batiment.equals(other.batiment))
			return false;
		if (cin == null) {
			if (other.cin != null)
				return false;
		} else if (!cin.equals(other.cin))
			return false;
		if (poste == null) {
			if (other.poste != null)
				return false;
		} else if (!poste.equals(other.poste))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [poste=" + poste + ", cin=" + cin + ", batiment="
				+ batiment + "]";
	}
   
}
