/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restserver;

import java.util.ArrayList;
import java.util.List;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.apache.cxf.endpoint.Server;
import org.eclipse.jetty.server.ConnectionFactory;
/**
 *
 * @author biar
 */
public class RestServer {

    public static void main(String args[]) throws Exception {
        JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
        List<Class<?>> classes = new ArrayList<>();
        classes.add(IdentityRepository.class);
        classes.add(CatalogRepository.class);
        factoryBean.setResourceClasses(classes);
        factoryBean.setResourceProvider( new SingletonResourceProvider(new IdentityRepository()) );
        factoryBean.setResourceProvider( new SingletonResourceProvider(new CatalogRepository()) );
        factoryBean.setAddress("http://localhost:8080/");
        Server server = factoryBean.create();
    }
    
}
