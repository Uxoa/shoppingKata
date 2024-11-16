import org.example.FoodProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodProductTest {
    
    @Test
    @DisplayName("A los productos de alimentación (FoodProduct) se les puede añadir un descuento (%)")
    void testALosProductosDeAlimentacionSePuedeAgregarDescuentoPorcentaje(){
        FoodProduct foodProduct = new FoodProduct("pan", 4);
        foodProduct.applyDiscount(50);
        assertEquals(2,foodProduct.getPrice());
    }
}
