package persistance;

import static javax.persistence.CascadeType.MERGE;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

import persistance.User;

/**
 * Entity implementation class for Entity: Farmer
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
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
	
	@ManyToOne(cascade = MERGE)
	@JoinColumn(name="batiment")
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
   
}
