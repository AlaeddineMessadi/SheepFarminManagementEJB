package persistance;

import static javax.persistence.CascadeType.MERGE;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Vaccine
 *
 */
@Entity
@XmlRootElement
public class Vaccine implements Serializable {

	
	private int id_vaccin;
	private String type_vaccin;
	private Date date_vaccin;
	private Sheep sheep;
	
	private static final long serialVersionUID = 1L;

	public Vaccine() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId_vaccin() {
		return this.id_vaccin;
	}

	public void setId_vaccin(int id_vaccin) {
		this.id_vaccin = id_vaccin;
	}   
	public String getType_vaccin() {
		return this.type_vaccin;
	}

	public void setType_vaccin(String type_vaccin) {
		this.type_vaccin = type_vaccin;
	}
	public Date getDate_vaccin() {
		return date_vaccin;
	}
	@Temporal(TemporalType.DATE)
	public void setDate_vaccin(Date date_vaccin) {
		this.date_vaccin = date_vaccin;
	}
	@ManyToOne(cascade = MERGE)
	@JoinColumn(name="sheep")
	public Sheep getSheep() {
		return sheep;
	}
	public void setSheep(Sheep sheep) {
		this.sheep = sheep;
	}
	public Vaccine(String type_vaccin, Date date_vaccin, Sheep sheep) {
		super();
		this.type_vaccin = type_vaccin;
		this.date_vaccin = date_vaccin;
		this.sheep = sheep;
	}
	public Vaccine(String type_vaccin, Date date_vaccin) {
		super();
		this.type_vaccin = type_vaccin;
		this.date_vaccin = date_vaccin;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((date_vaccin == null) ? 0 : date_vaccin.hashCode());
		result = prime * result + id_vaccin;
		result = prime * result + ((sheep == null) ? 0 : sheep.hashCode());
		result = prime * result
				+ ((type_vaccin == null) ? 0 : type_vaccin.hashCode());
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
		Vaccine other = (Vaccine) obj;
		if (date_vaccin == null) {
			if (other.date_vaccin != null)
				return false;
		} else if (!date_vaccin.equals(other.date_vaccin))
			return false;
		if (id_vaccin != other.id_vaccin)
			return false;
		if (sheep == null) {
			if (other.sheep != null)
				return false;
		} else if (!sheep.equals(other.sheep))
			return false;
		if (type_vaccin == null) {
			if (other.type_vaccin != null)
				return false;
		} else if (!type_vaccin.equals(other.type_vaccin))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Vaccine [id_vaccin=" + id_vaccin + ", type_vaccin="
				+ type_vaccin + ", date_vaccin=" + date_vaccin + ", sheep="
				+ sheep + "]";
	}
	
	
	
   
}
