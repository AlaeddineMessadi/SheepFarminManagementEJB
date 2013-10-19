package persistance;

import static javax.persistence.CascadeType.MERGE;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Monitoring
 *
 */
@Entity

public class Monitoring implements Serializable {

	
	private int id_monitoring;
	private int gmq;
	private float last_weight;
	private String grossess;
	private Date last_date_gain;
	private Sheep sheep;
	
	
	
	@ManyToOne(cascade = MERGE)
	@JoinColumn(name="sheep")
	public Sheep getSheep() {
		return sheep;
	}
	public void setSheep(Sheep sheep) {
		this.sheep = sheep;
	}
	private static final long serialVersionUID = 1L;

	public Monitoring() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	public int getId_monitoring() {
		return this.id_monitoring;
	}

	public void setId_monitoring(int id_monitoring) {
		this.id_monitoring = id_monitoring;
	}   
	public int getGmq() {
		return this.gmq;
	}

	public void setGmq(int gmq) {
		this.gmq = gmq;
	}   
	public float getLast_weight() {
		return this.last_weight;
	}

	public void setLast_weight(float last_weight) {
		this.last_weight = last_weight;
	}   
	public String getGrossess() {
		return this.grossess;
	}
	
@Temporal(TemporalType.DATE)

	public Date getLast_date_gain() {
		return last_date_gain;
	}
	public void setLast_date_gain(Date last_date_gain) {
		this.last_date_gain = last_date_gain;
	}
	public void setGrossess(String grossess) {
		this.grossess = grossess;
	}
	public Monitoring(int gmq, float last_weight, String grossess,
			Date last_date_gain, Sheep sheep) {
		super();
		this.gmq = gmq;
		this.last_weight = last_weight;
		this.grossess = grossess;
		this.last_date_gain = last_date_gain;
		this.sheep = sheep;
	}
	
   
}
