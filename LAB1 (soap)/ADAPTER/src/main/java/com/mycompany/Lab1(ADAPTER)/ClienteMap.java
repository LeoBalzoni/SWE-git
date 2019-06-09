package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClienteMap")
public class ClienteMap {
    private List<ClienteEntry> entries = new ArrayList<ClienteEntry>();
    
    @XmlElement(nillable = false, name = "entry")
    public List<ClienteEntry> getEntries() {
        return entries;
    }
 
    @XmlType(name = "ClienteEntry")
    public static class ClienteEntry {
        private Integer id;
        private Cliente cliente;
 
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }
    }
}
