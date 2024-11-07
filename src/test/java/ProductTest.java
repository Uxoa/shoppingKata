import org.babot.FreeProduct;
import org.babot.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductTest {
    @Test
    void elPrecioDeLosProductosGratuitosEsSiempreCero() {
        FreeProduct freeProduct = new FreeProduct("perejil", 0.0);
        assertEquals(0.0, freeProduct.getProductPrice());

    }
    @Test
    @DisplayName("Crear un producto con nombre y precio")
    public void testCrearUnProductoConIdNombreYPrecio(){

        Product product = new Product(1, "producto01", 47.0);
        assertEquals(1, product.getProductId());
        assertEquals("producto01", product.getProductName());
        assertEquals(47.0,product.getProductPrice());




    }

}
