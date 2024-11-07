package org.babot;

public abstract class Product {

  // parametros de la clase
  private int productId;
  private String productName;
  private double productPrice;

  // constructor de los parámetros de la clase
    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // constructor vacio
    public Product() {

    }

    // getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    // Sobrescribimos getFinalPrice() para devolver el precio con descuento
    public abstract double getFinalPrice();
}
