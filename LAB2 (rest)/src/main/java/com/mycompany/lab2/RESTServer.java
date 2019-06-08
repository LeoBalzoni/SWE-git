package com.mycompany.lab2;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

public class RESTServer {
        public static void main(String args[]) throws Exception {
            JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
            factoryBean.setResourceClasses(CourseRepository.class);
            factoryBean.setResourceProvider( new SingletonResourceProvider(new CourseRepository()) );
            factoryBean.setAddress("http://localhost:8080/");
            Server server = factoryBean.create();
        }
}


/*

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

*/