import org.example.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    @DisplayName("Todos los productos tienen nombre y precio")
    void testTodosLosProductosTienenNombreYPrecio(){
        Product product = new Product("manzana", 4);
        assertEquals("manzana", product.getName());
        assertEquals(4, product.getPrice());
    }
}
