package com.unicauca.pay.crudproducts.common;

import java.util.ArrayList;


/**
 * Producto para entrega
 *
 * @author Libardo, Julio
 */
public class ProductDelivery {

    private int productId;
    private String productName;
    private String productDescripcion;
    private double productPrice;
    private int productStock;
    private String keywords;
    private String productCaracteristc;

    // Constructor
    public ProductDelivery() {
    }
    public ProductDelivery(int productId, String productName, String productDescripcion, double productPrice, int productStock, String keywords, String productCaracteristc) {
        this.productId = productId;
        this.productName = productName;
        this.productDescripcion = productDescripcion;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.keywords = keywords;
        this.productCaracteristc = productCaracteristc;
    }


    // Getters y setters

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescripcion() {
        return productDescripcion;
    }

    public void setProductDescripcion(String productDescripcion) {
        this.productDescripcion = productDescripcion;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getProductCaracteristc() {
        return productCaracteristc;
    }

    public void setProductCaracteristc(String productCaracteristc) {
        this.productCaracteristc = productCaracteristc;
    }


/*
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
*/
    @Override
    public String toString() {
        return "ProductDelivery{" + "productId=" + productId + ", productName=" + productName 
            + ", productDescripcion=" + productDescripcion + ", productPrice=" + productPrice 
            + ", productStock=" + productStock + ", keywords=" + keywords 
            + ", productCaracteristc=" + productCaracteristc  + '}';
    }
}

