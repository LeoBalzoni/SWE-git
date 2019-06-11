/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restserver;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import model.Catalog;
import model.Product;

/**
 *
 * @author biar
 */
@Path("catalog")
@Produces("text/xml")
public class CatalogRepository {
    Catalog catalog;
    {
        catalog = new Catalog();
        catalog.setName("CATALOGO");
        Product p = new Product(0, "A", 100);
        catalog.getProducts().add(p);
    }
    
    @GET
    @Path("")
    public Catalog getAllCatalog(){
        return catalog;
    }
    
}
