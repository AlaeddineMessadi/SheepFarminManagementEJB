package persistance;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.MERGE;


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
		private int capacity;
		private List<Employee> employee = new ArrayList<Employee>() ;
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
		@OneToMany(mappedBy="batiment",cascade={ PERSIST, MERGE })
		public List<Sheep> getSheeps() {
			return sheeps;
		}
		public void setSheeps(List<Sheep> sheeps) {
			this.sheeps = sheeps;
		}
		
			
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		public void SheepToBatiment(List<Sheep> sheeps){
			for(Sheep sheep:sheeps){
				sheep.setBatiment(this);
			}
			this.sheeps = sheeps ;
		} 
		
		@OneToMany (mappedBy="batiment", cascade = { PERSIST, MERGE } )
		public List<Employee> getEmployee() {
			return employee;
		}
		public void setEmployee(List<Employee> employee) {
			this.employee = employee;
		}

		public void EmployeeToBatiment(List<Employee> employees){
			for(Employee employee:employees){
				employee.setBatiment(this);
				}
			this.employee=employees;
		}
		@ManyToOne(cascade = MERGE)
		@JoinColumn(name="farm")
		public Farm getFarm() {
			return farm;
		}
		public void setFarm(Farm farm) {
			this.farm = farm;
		}
		public Batiment(int id_batiment, String name_batiment,int capacity) {
			super();
			this.id_batiment = id_batiment;
			this.name_batiment = name_batiment;
			this.capacity=capacity;
		}
	
		
	}