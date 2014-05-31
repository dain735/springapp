package es.unileon.springapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.unileon.springapp.domain.Insurance;

@Repository(value = "insuranceDao")
public class JPAInsuranceDao implements InsuranceDao {

	private EntityManager em = null;

    /*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Insurance> getInsuranceList() {
        return em.createQuery("select i from Insurance i order by i.insuranceID").getResultList();
    }

    @Transactional(readOnly = false)
    public void saveInsurance(Insurance insurance) {
        em.merge(insurance);
    }
}
