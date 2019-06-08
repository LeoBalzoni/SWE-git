package com.mycompany.aaaws;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

@WebService( endpointInterface = "com.mycompany.aaaws.ServerInterface" )
public class ServerImpl implements ServerInterface{
    
    List<BankClient> bankClients = new ArrayList<>();
    
    @Override
    public String[] getBankClients() {
        String[] result = new String[this.bankClients.size()];
        
        for(int i=0; i < this.bankClients.size(); i++){
            result[i] = this.bankClients.get(i).getId() + "," + this.bankClients.get(i).getName();
        }
        
        return result;
    }

}
