package com.mycompany.jmsstockmarketclient;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Session;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;

import java.util.Properties;
import javax.jms.MessageListener;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class StockMarketClient {
    
    public static void main(String[] args) throws NamingException, JMSException {
        Context jndiContext = null;
        ConnectionFactory connectionFactory = null;
        Connection connection = null;
        Session session = null;
        Destination destination = null;
        String destinationName = "dynamicTopics/Quotazioni";

        /*
         * Create a JNDI API InitialContext object
         */
        Properties props = new Properties();
        props.setProperty(Context.INITIAL_CONTEXT_FACTORY,"org.apache.activemq.jndi.ActiveMQInitialContextFactory");
        props.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");
        
        jndiContext = new InitialContext(props);
        connectionFactory = (ConnectionFactory)jndiContext.lookup("ConnectionFactory");
        destination = (Destination)jndiContext.lookup(destinationName);

        connection = connectionFactory.createConnection();
        connection.start();
        
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        
        MessageConsumer consumer = session.createConsumer(destination, "Nome = 'Mondadori'");
        
        MessageListener listener = new AzioniJMSListener();
        consumer.setMessageListener(listener);
    }

}


