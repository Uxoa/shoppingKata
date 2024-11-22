import org.example.FoodProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodProductTest {
    
    @Test
    @DisplayName("Todos los productos de alimentación tienen nombre y precio")
    void testTodosLosProductosDeAlimentacionTienenNombreYPrecio(){
        FoodProduct foodProduct = new FoodProduct("calabaza", 4);
        
        String name = foodProduct.getName();
        double price = foodProduct.getPrice();
        
        assertEquals("calabaza",name);
        assertEquals(4, price);
    }
    
    @Test
    @DisplayName("A los productos de alimentación (FoodProduct) se les puede añadir un descuento (%)")
    void testALosProductosDeAlimentacionSePuedeAgregarDescuentoPorcentaje(){
        FoodProduct foodProduct = new FoodProduct("pan", 4);
        foodProduct.applyDiscount(50);
        assertEquals(2,foodProduct.getPrice());
    }
}
