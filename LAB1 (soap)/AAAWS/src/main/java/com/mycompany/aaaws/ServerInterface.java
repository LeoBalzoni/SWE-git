package com.mycompany.aaaws;

import javax.jws.WebService;

@WebService
public interface ServerInterface {
    public String[] getBankClients();
}
