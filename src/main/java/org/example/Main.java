package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("********************* - Ürün Listesi - ******************");
        //Product
        Product product1 = new Product(1,"Asus Bilgisayar",1000,100,"Asus gt500 modeli 8gb rem");
        Product product2 = new Product(2,"Blender", 1000,100,"Arçelik zh63 modeli");
        Product product3 = new Product(3,"Lenovo Bilgisayar",9600,30,"Lenovo 77ty modeli 8gb rem");

        Product[] listOfProduct =  {product1,product2,product3};

        //Category
        Category category1 = new Category(1,"Elektronik Aletler","Bilgisayar cep telefonu gibi elektronik aletler");

        Category category2 = new Category(2,"Muffak Aletleri","Muffak içinde kullanlan elektonik aletler");

        product1.addCategory(category1);
        product2.addCategory(category2);
        product3.addCategory(category1);

        for (Product product:listOfProduct) {
            System.out.println("Ürün id : " + product.getId());
            System.out.println("Ürün Adı : " + product.getProductName());
            System.out.println("Ürün Açıklaması : " + product.getDescription());
            for (Category category : product.getCategories()) {
                System.out.println("Bu ürünün kategori adı: " + category.getCategoryName());
            }
        }



        System.out.println("********************* - Kişi Listesi- ******************");

        //User

        User user1 = new User();
        user1.setId(1);
        user1.setUserName("dnzkrtg");
        user1.setUserPassword("12345");
        user1.setEmail("dnz@gmail.com");

        User user2 = new User();
        user2.setId(2);
        user2.setUserName("ernkrtg");
        user2.setUserPassword("7899");
        user2.setEmail("ern@gmail.com");

        User[] listOfUser =  {user1,user2};
        for (User users:listOfUser) {
            System.out.println("Kullanıcı id: " + users.getId());
            System.out.println("Kullanıcı adı: " + users.getUserName());
            System.out.println("Şifre adı: " + users.getUserPassword());
            System.out.println("Kullanıcı email: " + users.getEmail());
        }

        System.out.println("********************* - Kategori Listesi- ******************");



        Category[] listOfCategory =  {category1,category2};
        for (Category categories:listOfCategory) {
            System.out.println("Kategori id: " + categories.getId());
            System.out.println("Kategori adı: " + categories.getCategoryName());
            System.out.println("Kategori açıklaması: " + categories.getDescription());
        }

        System.out.println("********************* - Sipariş Listesi- ******************");

        //Order

        Order order1 = new Order(1,user1);
        order1.addProduct(product1);
        order1.addProduct(product2);
        Order order2 = new Order(2,user2);
        order2.addProduct(product3);

        Order[] listOfOrder =  {order1,order2};
        for (Order order:listOfOrder) {
            System.out.println("Sipariş id : " + order.getId());
            System.out.println("Siparis Numarası : " + order.getOrderNumber());
            System.out.println("Sipariş Tutarı : " + order.getTotalPrice());
            System.out.println("Siparişi Satın Alan : " + order.getUser().getUserName());
            for (Product product : order.getProducts()) {
                System.out.println("Siparişteki Ürünler: " + product.getProductName());
            }
        }

    }
}