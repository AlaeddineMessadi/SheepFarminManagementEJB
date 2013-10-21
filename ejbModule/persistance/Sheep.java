package persistance;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;



/**
 * Entity implementation class for Entity: Sheep
 *
 */
@Entity

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

	@ManyToOne(cascade = MERGE)
	@JoinColumn(name="batiment")

	public Batiment getBatiment() {
		return batiment;
	}



	public void setBatiment(Batiment batiment) {
		this.batiment = batiment;
	}
	

	@OneToMany(mappedBy="sheep",cascade={ PERSIST, MERGE })
	public List<Vaccine> getVaccin() {
		return vaccin;
	}



	public void setVaccin(List<Vaccine> vaccin) {
		this.vaccin = vaccin;
	}
	@OneToMany(mappedBy="sheep",cascade={ PERSIST, MERGE })

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
	
	
   
}
