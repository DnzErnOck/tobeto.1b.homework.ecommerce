package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int id;
    private static int nextorderNumber=1;
    private int orderNumber;
    private double totalPrice;
    private User user;
    List<Product> products;

    public Order(int id, User user) {
        this.id = id;
        this.user = user;
        this.orderNumber = nextorderNumber++;
        this.products = new ArrayList<>();
        this.totalPrice=calculateTotalPrice();
    }
    private double calculateTotalPrice(){
        totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getUnitPrice()-product.getDiscount();
        }
        return totalPrice;
    }
    public void addProduct(Product product){
        products.add(product);
        calculateTotalPrice();
    }
    public List<Product> getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextorderNumber() {
        return nextorderNumber;
    }

    public static void setNextorderNumber(int nextorderNumber) {
        Order.nextorderNumber = nextorderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
