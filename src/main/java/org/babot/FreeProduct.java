package org.babot;

public class FreeProduct extends Product{

    public FreeProduct(String perejil, double freeProduct) {
        super();
    }

    public double getProductPrice() {
        return 0.0;
    }

    @Override
    public double getFinalPrice() {
        return 0;
    }

}
