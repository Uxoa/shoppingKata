import org.babot.FoodProduct;
import org.babot.FreeProduct;
import org.babot.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductTest {
    @Test
    @DisplayName("El Precio De Los Productos Gratuitos Es Siempre Cero")
    void elPrecioDeLosProductosGratuitosEsSiempreCero() {
        FreeProduct freeProduct = new FreeProduct("perejil", 0.0);
        assertEquals(0.0, freeProduct.getProductPrice());
    }

    @Test
    @DisplayName("Crear un producto con nombre y precio")
    void CrearUnProductoConIdNombreYPrecio(){
        FoodProduct foodProduct = new FoodProduct(1,"producto1", 47.0);
        assertEquals(1, foodProduct.getProductId());
        assertEquals("producto1", foodProduct.getProductName());
        assertEquals(47.0,foodProduct.getProductPrice());
    }

    @Test
    @DisplayName("Crear un producto de alimentación con nombre y precio sin descuento")
    void crearFoodProductSinDescuento() {
        FoodProduct foodProduct = new FoodProduct(1,"producto1", 1.2);
        assertEquals(1, foodProduct.getProductId());
        assertEquals("producto1", foodProduct.getProductName());
        assertEquals(1.2, foodProduct.getProductPrice());
    }

}
