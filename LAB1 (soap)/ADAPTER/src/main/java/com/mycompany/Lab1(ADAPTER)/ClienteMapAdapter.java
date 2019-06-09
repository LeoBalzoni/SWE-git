package com.mycompany.mavenproject1;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ClienteMapAdapter extends XmlAdapter<ClienteMap, Map<Integer, Cliente>> {

    @Override
    public Map<Integer, Cliente> unmarshal(ClienteMap v) throws Exception {
        Map<Integer, Cliente> boundMap = new LinkedHashMap<Integer, Cliente>();
        
        for (ClienteMap.ClienteEntry clienteEntry : v.getEntries()) {
            boundMap.put(clienteEntry.getId(), clienteEntry.getCliente());
        }
        
        return boundMap;
    }

    @Override
    public ClienteMap marshal(Map<Integer, Cliente> v) throws Exception {
        ClienteMap valueMap = new ClienteMap();
        
        for (Map.Entry<Integer, Cliente> boundEntry : v.entrySet()) {
            ClienteMap.ClienteEntry valueEntry  = new ClienteMap.ClienteEntry();
            valueEntry.setCliente(boundEntry.getValue());
            valueEntry.setId(boundEntry.getKey());
            valueMap.getEntries().add(valueEntry);
        }
        
        return valueMap;
    }
    
}
