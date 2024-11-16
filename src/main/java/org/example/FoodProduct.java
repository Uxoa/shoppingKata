package org.example;

public class FoodProduct extends Product {
    
    private int  discount;
    
    public FoodProduct(String name, double price) {
        super(name, price);
    }
    
    public void applyDiscount(int discount){
        this.discount = discount;
    }
    
    @Override
    public double getPrice(){
        return super.getPrice() * this.discount / 100;
    }

  
}
