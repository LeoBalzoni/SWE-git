package com.mycompany.aaaws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class BankClient implements BankClientInterface{
    
    private int id;
    private String name;
    
    public BankClient(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    @XmlElement(name="ID")
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
    
}
