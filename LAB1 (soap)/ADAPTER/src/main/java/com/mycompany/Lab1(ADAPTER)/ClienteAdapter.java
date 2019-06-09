package com.mycompany.mavenproject1;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ClienteAdapter extends XmlAdapter<ClienteImpl, Cliente> {

    @Override
    public ClienteImpl marshal(Cliente v) throws Exception {
        if(v instanceof ClienteImpl){
            return (ClienteImpl) v;
        } 
        return new ClienteImpl(v.getId(), v.getName());
    }

    @Override
    public Cliente unmarshal(ClienteImpl v) throws Exception {
        return v;
    }

}
