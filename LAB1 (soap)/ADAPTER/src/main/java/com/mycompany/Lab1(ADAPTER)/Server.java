package com.mycompany.mavenproject1;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String args[]) throws InterruptedException {
        ServerImpl implementor = new ServerImpl();
        String address = "http://localhost:8080/AAAWSInterface";
        Endpoint.publish(address, implementor);
        implementor.clienti.put(0, new ClienteImpl(1, "Massimo Mecella"));
        implementor.clienti.put(1, new ClienteImpl(2, "Miguel Ceriani"));
        implementor.clienti.put(2, new ClienteImpl(3, "Alberto Albertoni"));
        implementor.clienti.put(3, new ClienteImpl(4, "Leonardoni Fattalesi"));
        //Thread.sleep(60 * 1000);        
        //System.exit(0);
    }
}
