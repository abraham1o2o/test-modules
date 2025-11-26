package com.productDetails;

public class ProductDetails {
    String productName;
    int price;
    String seller;

    public ProductDetails(String productName, int price, String seller) {
        this.productName = productName;
        this.price = price;
        this.seller = seller;}

    public String getProductName() { return productName; }

    public int getPrice() { return price;}

    public String getSeller() { return seller; }

    @Override
    public String toString() {
        return "ProductDetails{" + "productName='" + getProductName() + '\'' +
                ", price=" + getPrice() +
                ", seller='" + getSeller() + '\'' +
                '}';
    }
}
