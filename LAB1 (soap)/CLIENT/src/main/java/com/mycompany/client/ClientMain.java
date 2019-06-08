
package com.mycompany.client;

import com.mycompany.aaaws.ServerImplService;
import com.mycompany.aaaws.ServerInterface;
import it.sapienza.softeng.bankws.BankIFace;
import it.sapienza.softeng.bankws.BankImplService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClientMain {
        public static void main(String[] args){
        ServerImplService server = new ServerImplService();
        ServerInterface port = server.getServerImplPort();
        List<String> bankClients = port.getBankClients();

        System.out.println("Lista clienti della banca: ");
        for(String bankClient: bankClients){
            System.out.println(bankClient);
        }
        System.out.println("_________________________________");
        
        BankImplService bankServer = new BankImplService();
        BankIFace bankPort = bankServer.getBankImplPort();
        
        
        Set<String> clientsWithBenzina = new HashSet<>();
        System.out.println("Lista operazioni di tutti i clienti della banca:");
        for (String s : bankClients) {
            List<String> clientOperations = bankPort.getOperationsByClientID(Integer.parseInt(s.substring(0, s.indexOf(','))));
            System.out.println(clientOperations);
            
            for(String op : clientOperations) {
                if (op.contains("benzina")) {
                clientsWithBenzina.add(s.substring(s.indexOf(',')+1));
                }
            }

        }
        System.out.println("_________________________________");
        
        System.out.println("Lista di utenti che hanno fatto benzina:");
        for (String cliente : clientsWithBenzina) {
            System.out.println(cliente);
        }
        System.out.println("_________________________________");
    }
}
