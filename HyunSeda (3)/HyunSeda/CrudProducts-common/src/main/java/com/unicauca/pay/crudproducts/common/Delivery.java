package com.unicauca.pay.crudproducts.common;

/**
 * Envio
 * @author Libardo, Julio
 */
public class Delivery {

    private ProductDelivery product;
    private double distance;
    /**
     * Código del país donde será entregado el producto.
     * */
    private String countryCode;

    public Delivery(ProductDelivery product, double distance, String countryCode) {
        this.product = product;
        this.distance = distance;
        this.countryCode = countryCode;
    }

    public ProductDelivery getProduct() {
        return product;
    }

    public void setProduct(ProductDelivery product) {
        this.product = product;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
