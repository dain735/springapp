package es.unileon.springapp.service;

import java.io.Serializable;
import java.util.List;

import es.unileon.springapp.domain.Client;
import es.unileon.springapp.domain.Insurance;

public interface InsuranceManager extends Serializable {

	 public void setInsurances(Client client, Insurance insurance);
	
	 public void setInsurances(List<Insurance> insurance);
	 
	 public List<Insurance> getInsurances();
	 
	 public Insurance get(String insuranceId);
	
}
