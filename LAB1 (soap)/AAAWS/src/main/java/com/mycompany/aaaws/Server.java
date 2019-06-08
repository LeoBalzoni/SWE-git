
package com.mycompany.aaaws;

import javax.xml.ws.Endpoint;

public class Server {
    
    public static void main(String[] args) throws InterruptedException{
        ServerImpl implementor = new ServerImpl();
        String address = "http://localhost:8081/BankServer";
        Endpoint.publish(address, implementor);
        implementor.bankClients.add(new BankClient(1, "Massimo Mecella"));
        implementor.bankClients.add(new BankClient(2, "Miguel Ceriani"));
        implementor.bankClients.add(new BankClient(3, "Alberto Albertoni"));
        implementor.bankClients.add(new BankClient(4, "Leonardoni Fattalesi"));
        //Thread.sleep(60 * 5000);
        //System.exit(0);
    }
    
    /*
    public class ClientMain {
        public static void main(String[] args){
        ServerImplService server = new ServerImplService();
        ServerInterface port = server.getServerImplPort();
        List<String> bankClients = port.getBankClients();

        for(String bankClient: bankClients){
            System.out.println(bankClient);
        }
    }
}
    */
}