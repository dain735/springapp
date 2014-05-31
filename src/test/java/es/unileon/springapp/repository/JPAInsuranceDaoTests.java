package es.unileon.springapp.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.unileon.springapp.domain.Insurance;

public class JPAInsuranceDaoTests {

	private ApplicationContext context;
    private InsuranceDao insuranceDao;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
        insuranceDao = (InsuranceDao) context.getBean("insuranceDao");
    }

    @Test
    public void testGetInsuranceList() {
        List<Insurance> insurances = insuranceDao.getInsuranceList();
        assertEquals(insurances.size(), 2, 0);
    }

    @Test
    public void testSaveInsurance() {
        List<Insurance> insurances = insuranceDao.getInsuranceList();

        Insurance i = insurances.get(0);
        String description = i.getInsuranceDescription();
        i.setInsuranceDescription("Car Insurance");
        insuranceDao.saveInsurance(i);

        List<Insurance> updatedInsurances = insuranceDao.getInsuranceList();
        Insurance i2 = updatedInsurances.get(0);
        assertEquals(i2.getInsuranceDescription(), "Car Insurance");

        i2.setInsuranceDescription(description);
        insuranceDao.saveInsurance(i2);
    }

}
