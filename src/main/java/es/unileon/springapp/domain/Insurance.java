package es.unileon.springapp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurances") 
public class Insurance implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name = "insuranceID")
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
