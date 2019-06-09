package com.mycompany.mavenproject1;

import java.util.Map;
import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@WebService
public interface AAAWSInterface {
    public String hello(String name);
 
    public String helloStudent(Cliente student);
 
    @XmlJavaTypeAdapter(ClienteMapAdapter.class)
    public Map<Integer, Cliente> getClients();
}