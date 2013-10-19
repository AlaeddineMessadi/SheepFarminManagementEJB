package persistance;

import static javax.persistence.CascadeType.MERGE;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vaccine
 *
 */
@Entity

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
	
	
   
}
