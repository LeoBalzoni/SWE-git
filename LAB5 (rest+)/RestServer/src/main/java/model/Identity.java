package model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Identity {

    private int id;
    private String name;
    private List<Order> orders = new ArrayList<>();
    private Basket basket = new Basket();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the orders
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    /**
     * @return the basket
     */
    public Basket getBasket() {
        return basket;
    }

    /**
     * @param basket the basket to set
     */
    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
