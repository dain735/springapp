package es.unileon.springapp.repository;

import java.util.List;

import es.unileon.springapp.domain.Insurance;

public interface InsuranceDao {

	public List<Insurance> getInsuranceList();

    public void saveInsurance(Insurance insurance);
}
