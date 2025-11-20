package com.app;
import com.account.Account;
import com.product.Product;

public class Main {
    public static void main(String[] args) {
      new Account().registerUser("James", "mycat123");
      new Account().registerUser("Jene","password123");

      new Account().displayUsers();

      new Product().addProduct("Iphone 14 Pro Max", 900, "Apple");
      new Product().addProduct("Samsung Galaxy s22 ", 800, "Samsung");

      new Product().displayProducts();
    }

}
