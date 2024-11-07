package org.babot;

public class FoodProduct extends Product {

    // TODO estudiar si puedo refactorizar el descuento
    private double discountPercentage;

    public FoodProduct(int id, String name, double price) {
        super(id, name, price);  // Llamo al constructor de la clase padre para inicializar id, name y price
        this.discountPercentage = 0.0; // Sin descuento por defecto
    }

    // Método para aplicar el descuento
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    // Sobrescribimos getFinalPrice() para devolver el precio con descuento
    @Override
    public double getFinalPrice() {
        return getPrice() * (1 - discountPercentage / 100);
    }

    private double getPrice() {
        return 0;
    }
}
