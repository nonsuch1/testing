package londonSchool.system;

import com.nonsuch1.testing.java.model.Customer;
import com.nonsuch1.testing.java.model.Product;
import com.nonsuch1.testing.java.model.Store;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class SystemTest {

    @Test
    public void purchaseSucceeds_whenEnoughInventory() {

        // Arrange
        Store storeMock = Mockito.mock(Store.class);
        when(storeMock.hasEnoughInventory(Product.SHAMPOO, 5)).thenReturn(true);
        Customer customer = new Customer();

        //Act
        boolean success = customer.purchase(storeMock, Product.SHAMPOO, 5);

        // Assert
        Assert.assertTrue(success);
        verify(storeMock, times(1)).removeInventory(Product.SHAMPOO, 5);
    }

    @Test
    public void purchaseFails_whenNotEnoughInventory() {

        // Arrange
        Store storeMock = mock(Store.class);
        when(storeMock.hasEnoughInventory(Product.SHAMPOO, 5)).thenReturn(false);
        Customer customer = new Customer();

        // Act
        boolean success = customer.purchase(storeMock, Product.SHAMPOO, 5);

        // Assert
        Assert.assertFalse(success);
        verify(storeMock, never()).removeInventory(Product.SHAMPOO, 5);
    }
}
