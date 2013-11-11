package persistance;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;



/**
 * Entity implementation class for Entity: Sheep
 *
 */
@Entity
@XmlRootElement

public class Sheep implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Sheep() {
		super();
	}
	private int Id;
	private int code_sheep;
	private String race_sheep ;
	private String sexe_sheep ;
	private Date date_birth ;
	private Date date_date_input ;
	private Date date_output ;
	private float price_input ;
	private float price_output ;
	private String remarque ;
	private Batiment batiment;
	private List<Vaccine> vaccin = new ArrayList<Vaccine>() ;
	private List<Monitoring> monitoring=new ArrayList<Monitoring>();
	

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public int getCode_sheep() {
		return code_sheep;
	}



	public void setCode_sheep(int code_sheep) {
		this.code_sheep = code_sheep;
	}



	public String getRace_sheep() {
		return race_sheep;
	}



	public void setRace_sheep(String race_sheep) {
		this.race_sheep = race_sheep;
	}



	public String getSexe_sheep() {
		return sexe_sheep;
	}



	public void setSexe_sheep(String sexe_sheep) {
		this.sexe_sheep = sexe_sheep;
	}



	

	@Temporal(TemporalType.DATE)

	public Date getDate_birth() {
		return date_birth;
	}



	public void setDate_birth(Date date_birth) {
		this.date_birth = date_birth;
	}


	@Temporal(TemporalType.DATE)
	public Date getDate_date_input() {
		return date_date_input;
	}



	public void setDate_date_input(Date date_date_input) {
		this.date_date_input = date_date_input;
	}
	


	@Temporal(TemporalType.DATE)
	public Date getDate_output() {
		return date_output;
	}



	public void setDate_output(Date date_output) {
		this.date_output = date_output;
	}

	public float getPrice_input() {
		return price_input;
	}



	public void setPrice_input(float price_input) {
		this.price_input = price_input;
	}



	public float getPrice_output() {
		return price_output;
	}



	public void setPrice_output(float price_output) {
		this.price_output = price_output;
	}


	public String getRemarque() {
		return remarque;
	}



	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@ManyToOne(cascade = ALL)
	@JoinColumn(name="batiment")
  //  @JsonIgnore
	public Batiment getBatiment() {
		return batiment;
	}



	public void setBatiment(Batiment batiment) {
		this.batiment = batiment;
	}
	

	@OneToMany(mappedBy="sheep", cascade = ALL)
	public List<Vaccine> getVaccin() {
		return vaccin;
	}



	public void setVaccin(List<Vaccine> vaccin) {
		this.vaccin = vaccin;
	}
	@OneToMany(mappedBy="sheep", cascade = ALL)

	public List<Monitoring> getMonitoring() {
		return monitoring;
	}



	public void setMonitoring(List<Monitoring> monitoring) {
		this.monitoring = monitoring;
	}



	public void vaccineToSheep(List<Vaccine> vaccins){
		for(Vaccine vaccin:vaccins){
			vaccin.setSheep(this);
			}
		this.vaccin=vaccins;
	}
	
	public void monitoringToSheep(List<Monitoring> monitorings){
		for(Monitoring monitoring:monitorings){
			monitoring.setSheep(this);
			}
		this.monitoring=monitorings;
	}



	public Sheep(int id, int code_sheep, String race_sheep, String sexe_sheep,
			Date date_birth, Date date_date_input, Date date_output,
			String type_vaccin, Date date_last_vaccin, Date date_next_vaccin,
			float price_input, float price_output, Date date_gain,
			float weight_gain, float gmq, String remarque) {
		super();
		Id = id;
		this.code_sheep = code_sheep;
		this.race_sheep = race_sheep;
		this.sexe_sheep = sexe_sheep;
		this.date_birth = date_birth;
		this.date_date_input = date_date_input;
		this.date_output = date_output;
		this.price_input = price_input;
		this.price_output = price_output;
		this.remarque = remarque;


	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		result = prime * result
				+ ((batiment == null) ? 0 : batiment.hashCode());
		result = prime * result + code_sheep;
		result = prime * result
				+ ((date_birth == null) ? 0 : date_birth.hashCode());
		result = prime * result
				+ ((date_date_input == null) ? 0 : date_date_input.hashCode());
		result = prime * result
				+ ((date_output == null) ? 0 : date_output.hashCode());
		result = prime * result
				+ ((monitoring == null) ? 0 : monitoring.hashCode());
		result = prime * result + Float.floatToIntBits(price_input);
		result = prime * result + Float.floatToIntBits(price_output);
		result = prime * result
				+ ((race_sheep == null) ? 0 : race_sheep.hashCode());
		result = prime * result
				+ ((remarque == null) ? 0 : remarque.hashCode());
		result = prime * result
				+ ((sexe_sheep == null) ? 0 : sexe_sheep.hashCode());
		result = prime * result + ((vaccin == null) ? 0 : vaccin.hashCode());
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
		Sheep other = (Sheep) obj;
		if (Id != other.Id)
			return false;
		if (batiment == null) {
			if (other.batiment != null)
				return false;
		} else if (!batiment.equals(other.batiment))
			return false;
		if (code_sheep != other.code_sheep)
			return false;
		if (date_birth == null) {
			if (other.date_birth != null)
				return false;
		} else if (!date_birth.equals(other.date_birth))
			return false;
		if (date_date_input == null) {
			if (other.date_date_input != null)
				return false;
		} else if (!date_date_input.equals(other.date_date_input))
			return false;
		if (date_output == null) {
			if (other.date_output != null)
				return false;
		} else if (!date_output.equals(other.date_output))
			return false;
		if (monitoring == null) {
			if (other.monitoring != null)
				return false;
		} else if (!monitoring.equals(other.monitoring))
			return false;
		if (Float.floatToIntBits(price_input) != Float
				.floatToIntBits(other.price_input))
			return false;
		if (Float.floatToIntBits(price_output) != Float
				.floatToIntBits(other.price_output))
			return false;
		if (race_sheep == null) {
			if (other.race_sheep != null)
				return false;
		} else if (!race_sheep.equals(other.race_sheep))
			return false;
		if (remarque == null) {
			if (other.remarque != null)
				return false;
		} else if (!remarque.equals(other.remarque))
			return false;
		if (sexe_sheep == null) {
			if (other.sexe_sheep != null)
				return false;
		} else if (!sexe_sheep.equals(other.sexe_sheep))
			return false;
		if (vaccin == null) {
			if (other.vaccin != null)
				return false;
		} else if (!vaccin.equals(other.vaccin))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Sheep [Id=" + Id + ", code_sheep=" + code_sheep
				+ ", race_sheep=" + race_sheep + ", sexe_sheep=" + sexe_sheep
				+ ", date_birth=" + date_birth + ", date_date_input="
				+ date_date_input + ", date_output=" + date_output
				+ ", price_input=" + price_input + ", price_output="
				+ price_output + ", remarque=" + remarque + ", batiment="
				+ batiment + ", vaccin=" + vaccin + ", monitoring="
				+ monitoring + "]";
	}
	
	
   
}
