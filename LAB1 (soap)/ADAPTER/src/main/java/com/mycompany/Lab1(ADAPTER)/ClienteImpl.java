package com.mycompany.mavenproject1;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Cliente")
public class ClienteImpl implements Cliente {
    private int id;
    private String name;
    
    ClienteImpl() {}
    
    public ClienteImpl(int id, String name){
        this.id = id;
        this.name = name;
    }
        
    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return this.name + " " + this.id;
    }
    
}
