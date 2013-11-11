package persistance;

import static javax.persistence.CascadeType.MERGE;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Monitoring
 *
 */
@Entity
@XmlRootElement
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gmq;
		result = prime * result
				+ ((grossess == null) ? 0 : grossess.hashCode());
		result = prime * result + id_monitoring;
		result = prime * result
				+ ((last_date_gain == null) ? 0 : last_date_gain.hashCode());
		result = prime * result + Float.floatToIntBits(last_weight);
		result = prime * result + ((sheep == null) ? 0 : sheep.hashCode());
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
		Monitoring other = (Monitoring) obj;
		if (gmq != other.gmq)
			return false;
		if (grossess == null) {
			if (other.grossess != null)
				return false;
		} else if (!grossess.equals(other.grossess))
			return false;
		if (id_monitoring != other.id_monitoring)
			return false;
		if (last_date_gain == null) {
			if (other.last_date_gain != null)
				return false;
		} else if (!last_date_gain.equals(other.last_date_gain))
			return false;
		if (Float.floatToIntBits(last_weight) != Float
				.floatToIntBits(other.last_weight))
			return false;
		if (sheep == null) {
			if (other.sheep != null)
				return false;
		} else if (!sheep.equals(other.sheep))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Monitoring [id_monitoring=" + id_monitoring + ", gmq=" + gmq
				+ ", last_weight=" + last_weight + ", grossess=" + grossess
				+ ", last_date_gain=" + last_date_gain + ", sheep=" + sheep
				+ "]";
	}
	
   
}
