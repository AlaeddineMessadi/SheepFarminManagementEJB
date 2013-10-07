package persistance;

import java.io.Serializable;
import javax.persistence.*;
import persistance.User;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Admin extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}

	@Override
	public String toString() {
		return "Admin [getIdUser()=" + getIdUser() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName()
				+ ", getLogin()=" + getLogin() + ", getPwd()=" + getPwd()
				+ ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone()
				+ ", getAdress()=" + getAdress() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
   
	public Admin( String firstName, String lastName, String login,
			String pwd, String email, String phone, String adress){
		this.setAdress(adress);
		this.setEmail(email);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setLogin(login);
		this.setPwd(pwd);
		this.setPhone(phone);
		
	}
}
