package classicalSchool.system;

import com.nonsuch1.testing.java.model.Customer;
import com.nonsuch1.testing.java.model.Product;
import com.nonsuch1.testing.java.model.Store;
import org.junit.Test;

import static org.junit.Assert.*;

public class SystemTest {

    @Test
    public void purchaseSucceeds_whenEnoughInventory() {
        // Arrange
        Store store = new Store();
        store.addInventory(Product.SHAMPOO, 10);
        Customer customer = new Customer();

        // Act
        boolean success = customer.purchase(store, Product.SHAMPOO, 5);

        // Assert
        assertTrue(success);
        assertEquals(5, store.getInventory(Product.SHAMPOO));
    }

    @Test
    public void purchaseFails_whenNotEnoughInventory() {
        // Arrange
        Store store = new Store();
        store.addInventory(Product.SHAMPOO, 10);
        Customer customer = new Customer();

        // Act
        boolean success = customer.purchase(store, Product.SHAMPOO, 15);

        //Assert
        assertFalse(success);
        assertEquals(10, store.getInventory(Product.SHAMPOO));
    }
}
