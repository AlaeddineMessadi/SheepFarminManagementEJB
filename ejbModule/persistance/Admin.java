package persistance;

import java.io.Serializable;
import javax.persistence.*;
import persistance.User;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

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
   
}
