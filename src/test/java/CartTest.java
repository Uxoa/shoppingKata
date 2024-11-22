import org.example.Cart;
import org.example.FoodProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CartTest {
    
    @Test
    @DisplayName("Puedo Agregar Productos Al Carrito")
    void testPuedoAgregarProductosAlCarrito(){
        Cart cart = new Cart();
        FoodProduct foodProduct = new FoodProduct("mandarinas", 10);
        
    }
    
  
}
