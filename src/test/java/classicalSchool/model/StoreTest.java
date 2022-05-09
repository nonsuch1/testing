package classicalSchool.model;

import com.nonsuch1.testing.java.model.Product;
import com.nonsuch1.testing.java.model.Store;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StoreTest {

    @Test
    public void addInventoryTest() {
        Store store = new Store();
        store.addInventory(Product.SHAMPOO, 6);

        assertEquals(6, store.getInventory(Product.SHAMPOO));

        store.addInventory(Product.SHAMPOO,7);

        assertEquals(13, store.getInventory(Product.SHAMPOO));
    }
}
