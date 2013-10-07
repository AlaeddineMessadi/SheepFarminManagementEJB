package persistance;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.REMOVE;
import static javax.persistence.CascadeType.ALL;
import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.FetchType.LAZY;

/**
 * Entity implementation class for Entity: Batiment
 *
 */
@Entity

public class Batiment implements Serializable {
	
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;



		public Batiment() {
			super();
		}
		private int id_batiment;
		private String name_batiment;
		private List<Employee> employee ;
		private List<Sheep> sheeps=new ArrayList<Sheep>();
		private Farm farm ;
		
		

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		public int getId_batiment() {
			return id_batiment;
		}
		public void setId_batiment(int id_batiment) {
			this.id_batiment = id_batiment;
		}
		public String getName_batiment() {
			return name_batiment;
		}
		public void setName_batiment(String name_batiment) {
			this.name_batiment = name_batiment;
		}
		public Batiment(String name_batiment) {
			super();
			this.name_batiment = name_batiment;
			
		}
		@OneToMany(mappedBy="batiment",cascade=CascadeType.PERSIST)
		public List<Sheep> getSheeps() {
			return sheeps;
		}
		public void setSheeps(List<Sheep> sheeps) {
			this.sheeps = sheeps;
		}
			
		public void TestBatiment(List<Sheep> sheeps){
			for(Sheep sheep:sheeps){
				sheep.setBatiment(this);
				this.getSheeps().add(sheep);
			}
		}
		@OneToMany (mappedBy="batiment",cascade=CascadeType.PERSIST )
		public List<Employee> getEmployee() {
			return employee;
		}
		public void setEmployee(List<Employee> employee) {
			this.employee = employee;
		}
		
		@ManyToOne(cascade = { MERGE, REMOVE, PERSIST, ALL }, fetch = LAZY)
		@JoinColumn(name="farm")
		public Farm getFarm() {
			return farm;
		}
		public void setFarm(Farm farm) {
			this.farm = farm;
		}
		public Batiment(int id_batiment, String name_batiment,
				List<Employee> employee, List<Sheep> sheeps, Farm farm) {
			super();
			this.id_batiment = id_batiment;
			this.name_batiment = name_batiment;
			this.employee = employee;
			this.sheeps = sheeps;
			this.farm = farm;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((employee == null) ? 0 : employee.hashCode());
			result = prime * result + ((farm == null) ? 0 : farm.hashCode());
			result = prime * result + id_batiment;
			result = prime * result
					+ ((name_batiment == null) ? 0 : name_batiment.hashCode());
			result = prime * result
					+ ((sheeps == null) ? 0 : sheeps.hashCode());
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
			Batiment other = (Batiment) obj;
			if (employee == null) {
				if (other.employee != null)
					return false;
			} else if (!employee.equals(other.employee))
				return false;
			if (farm == null) {
				if (other.farm != null)
					return false;
			} else if (!farm.equals(other.farm))
				return false;
			if (id_batiment != other.id_batiment)
				return false;
			if (name_batiment == null) {
				if (other.name_batiment != null)
					return false;
			} else if (!name_batiment.equals(other.name_batiment))
				return false;
			if (sheeps == null) {
				if (other.sheeps != null)
					return false;
			} else if (!sheeps.equals(other.sheeps))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Batiment [id_batiment=" + id_batiment + ", name_batiment="
					+ name_batiment + ", employee=" + employee + ", sheeps="
					+ sheeps + ", farm=" + farm + "]";
		}
		
		
	}