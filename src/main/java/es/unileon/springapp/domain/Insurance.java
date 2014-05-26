package es.unileon.springapp.domain;

public class Insurance {

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
