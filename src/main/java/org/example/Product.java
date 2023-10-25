package org.example;

import java.util.ArrayList;
import java.util.List;

public class Product {


    private int id;
    private String productName;
    private double unitPrice;
    private double discount;
    private String description;

    private List<Category> categories;

    public Product(int id, String productName, double unitPrice, double discount, String description) {
        this.id = id;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.description = description;
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category){
        categories.add(category);
    }
    public List<Category> getCategories() {
        return categories;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
