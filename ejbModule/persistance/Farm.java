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

@Entity
public class Farm implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idFarm ;
	private String nomFarm ;
	private String adress ;
	private List<Batiment> batiment = new ArrayList<Batiment>() ;

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

	@OneToMany(mappedBy="farm",cascade=CascadeType.PERSIST)
	public List<Batiment> getBatiment() {
		return batiment;
	}

	public void setBatiment(List<Batiment> batiment) {
		this.batiment = batiment;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Farm(int idFarm, String nomFarm, String adress,
			List<Batiment> batiment) {
		super();
		this.idFarm = idFarm;
		this.nomFarm = nomFarm;
		this.adress = adress;
		this.batiment = batiment;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result
				+ ((batiment == null) ? 0 : batiment.hashCode());
		result = prime * result + idFarm;
		result = prime * result + ((nomFarm == null) ? 0 : nomFarm.hashCode());
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
		if (batiment == null) {
			if (other.batiment != null)
				return false;
		} else if (!batiment.equals(other.batiment))
			return false;
		if (idFarm != other.idFarm)
			return false;
		if (nomFarm == null) {
			if (other.nomFarm != null)
				return false;
		} else if (!nomFarm.equals(other.nomFarm))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Farm [idFarm=" + idFarm + ", nomFarm=" + nomFarm + ", adress="
				+ adress + ", batiment=" + batiment + "]";
	}



}
