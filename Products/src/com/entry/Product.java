package com.entry;

import com.productDetails.ProductDetails;
import java.util.List;
import java.util.ArrayList;

public class Product {
    private static final List<ProductDetails> products = new ArrayList<>();

    public void addProduct(String productName, int price, String seller) {
        ProductDetails p1 = new ProductDetails(productName,price,seller);
        products.add(p1);
    }

    public void displayProducts() {
        for (ProductDetails p : products) System.out.println(p);
    }

}
