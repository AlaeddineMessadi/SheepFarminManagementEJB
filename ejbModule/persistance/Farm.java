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
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import static javax.persistence.FetchType.EAGER;



@Entity
@XmlRootElement
public class Farm implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idFarm ;
	private String nomFarm ;
	private String adress ;
	private String telephone;
	private String mail;
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
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
	//@JsonIgnore
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
	public Farm(int idFarm, String nomFarm, String adress,String telephone,String mail) {
		super();
		this.idFarm = idFarm;
		this.nomFarm = nomFarm;
		this.adress = adress;
		this.telephone = telephone;
		this.mail = mail;
	}


    public void assignFarmToBatiment(List<Batiment> batiments){
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

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((adress == null) ? 0 : adress.hashCode());
			result = prime * result
					+ ((batiments == null) ? 0 : batiments.hashCode());
			result = prime * result + idFarm;
			result = prime * result + ((mail == null) ? 0 : mail.hashCode());
			result = prime * result
					+ ((nomFarm == null) ? 0 : nomFarm.hashCode());
			result = prime * result
					+ ((telephone == null) ? 0 : telephone.hashCode());
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
			Farm other = (Farm) obj;
			if (adress == null) {
				if (other.adress != null)
					return false;
			} else if (!adress.equals(other.adress))
				return false;
			if (batiments == null) {
				if (other.batiments != null)
					return false;
			} else if (!batiments.equals(other.batiments))
				return false;
			if (idFarm != other.idFarm)
				return false;
			if (mail == null) {
				if (other.mail != null)
					return false;
			} else if (!mail.equals(other.mail))
				return false;
			if (nomFarm == null) {
				if (other.nomFarm != null)
					return false;
			} else if (!nomFarm.equals(other.nomFarm))
				return false;
			if (telephone == null) {
				if (other.telephone != null)
					return false;
			} else if (!telephone.equals(other.telephone))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Farm [idFarm=" + idFarm + ", nomFarm=" + nomFarm
					+ ", adress=" + adress + ", telephone=" + telephone
					+ ", mail=" + mail + ", batiments=" + batiments + "]";
		}

    	
}
