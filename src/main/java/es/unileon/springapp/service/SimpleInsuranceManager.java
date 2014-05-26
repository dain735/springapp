package es.unileon.springapp.service;

import java.util.Iterator;
import java.util.List;

import es.unileon.springapp.domain.Client;
import es.unileon.springapp.domain.Insurance;

public class SimpleInsuranceManager implements InsuranceManager {

	private static final long serialVersionUID = 1L;
	
	private List<Insurance> insurances;

	public void setInsurances(Client client, Insurance insurance) {
		client.insurance = insurance;
	}

	public void setInsurances(List<Insurance> insurances) {
		this.insurances = insurances;
	}

	public List<Insurance> getInsurances() {
		return insurances;
	}
	
//	public Insurance get(String insuranceId) {
//		Insurance found = null, insurance;
//		int i = 0;
//		while ( found == null && i < this.insurances.size() ) {
//			insurance = this.insurances.get(i);
//			if ( insuranceId.compareTo(insurance.getInsuranceID()) == 0 ) {
//				found = insurance;
//			}
//		}
//		return found;
//	}
	
	public Insurance get(String insuranceId) {
		Insurance insurance = null;
		boolean found = false;
		Iterator it = this.insurances.iterator();
		while (it.hasNext() && !found) {
			insurance = (Insurance)it.next();
			if (insuranceId.compareTo(insurance.getInsuranceID()) == 0) {
				found = true;
			}
		}
		
		return insurance;
	}

}
