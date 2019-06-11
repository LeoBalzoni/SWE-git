package com.mycompany.restserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import model.Identity;
import model.Order;
import model.Product;

@Path("identity")
@Produces("text/xml")
public class IdentityRepository {
    Map<Integer, Identity> identities = new HashMap<>();
    
    {
        
        Product p = new Product(0, "A", 100);
        Product p1 = new Product(0, "B", 150);
        Product p2 = new Product(0, "C", 140);
        
        Order o = new Order();
        o.setId(402302);
        o.getProducts().add(p);
        o.getProducts().add(p1);
        o.getProducts().add(p2);
        
        Identity identity = new Identity();
        identity.setId(0);
        identity.setName("Leonardo");
        identity.getOrders().add(o);
        identities.put(0, identity);
        identity = new Identity();
        identity.setId(1);
        identity.setName("Leonardo2");
        identities.put(1, identity);
        
    }
    
    @GET
    @Path("")
    public List<Identity> getAllIdentities(){
        List<Identity> idList = new ArrayList<>();
        for (Map.Entry<Integer, Identity> identity : identities.entrySet()) {
            idList.add(identity.getValue());
        }
        return idList;
    }
    
    @GET
    @Path("{id}")
    public Identity getIdentity(@PathParam("id") int id){
        return findById(id);
    }
        
    private Identity findById(int id) {
        for (Map.Entry<Integer, Identity> identity : identities.entrySet()) {
            if (identity.getKey() == id) {
                return identity.getValue();
            }
        }
        return null;
    }
    
}
