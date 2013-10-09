package persistance;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.REMOVE;


@Entity
public class Farm implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idFarm ;
	private String nomFarm ;
	private String adress ;
	private List<Batiment> batiments = new ArrayList<Batiment>() ;

	public Farm() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdFarm() {
		return idFarm;
	}

	public void setIdFarm(int idFarm) {
		this.idFarm = idFarm;
	}

	public String getNomFarm() {
		return nomFarm;
	}

	public void setNomFarm(String nomFarm) {
		this.nomFarm = nomFarm;
	}

	@OneToMany(mappedBy="farm", cascade= CascadeType.ALL)
	public List<Batiment> getBatiments() {
		return batiments;
	}

	public void setBatiments(List<Batiment> batiment) {
		this.batiments = batiment;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Farm(int idFarm, String nomFarm, String adress) {
		super();
		this.idFarm = idFarm;
		this.nomFarm = nomFarm;
		this.adress = adress;
	}


    public void assignFarmToBatiment(List<Batiment> batiments){
    /*	this.setBatiments(batiments);
    	for (Batiment b : batiments){
    		b.setFarm(this); */
    	for(Batiment batiment:batiments){
			batiment.setFarm(this);
			this.setBatiments(batiments);
		}
    	
    	}
    	public void BatimentToFarm(List<Batiment> batiments){
			for(Batiment batiment:batiments){
				batiment.setFarm(this);
				
			}
			this.batiments=batiments;
    }

}
