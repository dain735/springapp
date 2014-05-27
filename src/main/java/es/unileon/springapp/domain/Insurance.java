package es.unileon.springapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurances") 
public class Insurance {

	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String insuranceID;
	private String insuranceDescription;
	
	public String getInsuranceDescription() {
		return insuranceDescription;
	}
	public void setInsuranceDescription(String insuranceDescriprtion) {
		this.insuranceDescription = insuranceDescriprtion;
	}
	public String getInsuranceID() {
		return insuranceID;
	}
	public void setInsuranceID(String insuranceID) {
		this.insuranceID = insuranceID;
	}
	
	@Override
	public String toString() {
		return "Insurance [insuranceID=" + insuranceID
				+ ", insuranceDescription=" + insuranceDescription + "]";
	}
	
}
