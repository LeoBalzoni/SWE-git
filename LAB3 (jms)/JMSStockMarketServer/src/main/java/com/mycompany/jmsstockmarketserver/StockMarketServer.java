package com.mycompany.jmsstockmarketserver;

import org.apache.activemq.broker.BrokerService;

public class StockMarketServer {

    public static void main(String args[]) throws Exception {
        BrokerService broker = new BrokerService();
        // configure the broker
        broker.addConnector("tcp://localhost:61616");

        broker.start();
        NotificatoreAcquisto n = new NotificatoreAcquisto();
        n.start();	

        ProduttoreQuotazioni q = new ProduttoreQuotazioni();
        q.start();

    }
}