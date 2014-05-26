package es.unileon.springapp.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.springapp.domain.Insurance;
import es.unileon.springapp.domain.SelectInsurance;
import es.unileon.springapp.service.ClientManager;
import es.unileon.springapp.service.InsuranceManager;

@Controller
@RequestMapping(value="/insurances.htm")
public class InsuranceController {
	
	@Autowired
    private InsuranceManager insuranceManager;
	@Autowired
	private ClientManager clientManager;
	
//	@RequestMapping(value="/insurances.htm")
	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("insurances", this.insuranceManager.getInsurances());

        return new ModelAndView("insurances", "model", myModel);
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid SelectInsurance selectInsurance, BindingResult result) {
        if (result.hasErrors()) {
            return "selectInsurance";
        }
		
        String insurance = selectInsurance.getInsurance();
        clientManager.hireInsurance(insuranceManager.get(insurance));

        return "redirect:/hello.htm";
    }
	
//	@RequestMapping(method = RequestMethod.GET)
//    protected SelectInsurance formBackingObject(HttpServletRequest request) throws ServletException {
//        SelectInsurance selectInsurance = new SelectInsurance();
//        
//        return selectInsurance;
//    }


    public void setInsuranceManager(InsuranceManager insuranceManager) {
        this.insuranceManager = insuranceManager;
    }

	public InsuranceManager getInsuranceManager() {
		return insuranceManager;
	}

}
