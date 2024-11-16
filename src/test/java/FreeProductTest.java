import org.example.FreeProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreeProductTest {
    @Test
    @DisplayName("elPrecioDeLosProductosGratuitosEsSiempreCero")
    void testElPrecioDeLosProductosGratuitosEsSiempreCero() {
        FreeProduct freeProduct = new FreeProduct("perejil", 0.0);
        freeProduct.getprice();
        assertEquals(0.0, freeProduct.getPrice());
    }
    
}
