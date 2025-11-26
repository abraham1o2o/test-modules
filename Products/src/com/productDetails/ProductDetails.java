package com.productDetails;

public class ProductDetails {
    String productName;
    int price;
    String OEM;

    public ProductDetails(String productName, int price, String OEM) {
        this.productName = productName;
        this.price = price;
        this.OEM= OEM;}

    public String getProductName() { return productName; }

    public int getPrice() { return price;}

    public String getOEM() { return OEM; }

    @Override
    public String toString() {
        return "ProductDetails{" + "productName='" + getProductName() + '\'' +
                ", price=" + getPrice() +
                ", seller='" + getOEM() + '\'' +
                '}';
    }
}
