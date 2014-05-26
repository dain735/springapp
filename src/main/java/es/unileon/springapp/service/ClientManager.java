package es.unileon.springapp.service;

import java.io.Serializable;
import java.util.List;

import es.unileon.springapp.domain.Client;
import es.unileon.springapp.domain.Insurance;

public interface ClientManager extends Serializable {
    
    public List<Client> getClients();
    
    public void setClients(List<Client> clients);
    // No se recibe identificador de cliente por tener solo uno
    // En la versión final sería información incluída dentro de la sesión
    public void hireInsurance(Insurance insurance);
}