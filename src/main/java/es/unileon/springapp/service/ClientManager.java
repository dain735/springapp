package es.unileon.springapp.service;

import java.io.Serializable;
import java.util.List;

import es.unileon.springapp.domain.Client;
import es.unileon.springapp.domain.Insurance;

public interface ClientManager extends Serializable {
    
    public List<Client> getClients();
    
    public void setClients(List<Client> clients);
    // No se recibe identificador de cliente por tener solo uno
    // En la versi�n final ser�a informaci�n inclu�da dentro de la sesi�n
    public void hireInsurance(Insurance insurance);
}