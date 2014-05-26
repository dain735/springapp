package es.unileon.springapp.service;

import java.util.List;

import es.unileon.springapp.domain.Client;
import es.unileon.springapp.domain.Insurance;

public class SimpleClientManager implements ClientManager {

    private static final long serialVersionUID = 1L;
    
    private List<Client> clients;

    public void setClients(List<Client> clients) {
    	this.clients = clients;
    }

	public List<Client> getClients() {
		return clients;
	}

	public void hireInsurance(Insurance insurance) {
		clients.get(0).setInsurance(insurance);
		
	}
}