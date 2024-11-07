import org.babot.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductTest {
    @Test
    @DisplayName("Crear un producto con nombre y precio")
    public void test_crearUnProductoConNombreYPrecio(){
        //GIVEN
        Product product = new Product("producto01", 1000.0);
        //WHEN
        assertEquals("producto01", product.getName());
        assertEquals(1000.0, product.getPrice());


        //THEN
    }

}
