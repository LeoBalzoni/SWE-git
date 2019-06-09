package com.mycompany.mavenproject1;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.jws.WebService;

@WebService(endpointInterface = "com.mycompany.mavenproject1.AAAWSInterface")
public class ServerImpl implements AAAWSInterface{
    Map<Integer, Cliente> clienti = new LinkedHashMap<Integer, Cliente>();
    
    @Override
    public String hello(String name) {
        return "Ciao stronzo di " + name;
    }

    @Override
    public String helloStudent(Cliente cliente) {
        clienti.put(clienti.size() + 1, cliente);
        return "Bella " + cliente.getName();
    }

    @Override
    public Map<Integer, Cliente> getClients() {
        return clienti;
    }
    
}
