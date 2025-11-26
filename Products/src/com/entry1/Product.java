package com.entry1;

import com.productDetails.ProductDetails;
import java.util.List;
import java.util.ArrayList;

public class Product {
    private static final List<ProductDetails> products = new ArrayList<>();

    public void addProduct(String productName, int price, String seller) {
        ProductDetails newProduct = new ProductDetails(productName,price,seller);
        products.add(newProduct);
    }

    public void displayProducts() {
        for (ProductDetails showProd : products) System.out.println(showProd);
    }

}
