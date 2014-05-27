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

//    @Test
//    public void testSaveInsurance() {
//        List<Insurance> insurances = insuranceDao.getInsuranceList();
//
//        Insurance p = insurances.get(0);
//        Double price = p.getPrice();
//        p.setPrice(200.12);
//        insuranceDao.saveInsurance(p);
//
//        List<Insurance> updatedInsurances = insuranceDao.getInsuranceList();
//        Insurance p2 = updatedInsurances.get(0);
//        assertEquals(p2.getPrice(), 200.12, 0);
//
//        p2.setPrice(price);
//        insuranceDao.saveInsurance(p2);
//    }

}
