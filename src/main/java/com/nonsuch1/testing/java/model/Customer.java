package com.nonsuch1.testing.java.model;

public class Customer {
    public boolean purchase(Store store, Product product, int amount) {
        boolean ifAmountOfProductIsAvailable = store.hasEnoughInventory(product, amount);
        if (ifAmountOfProductIsAvailable) {
            store.removeInventory(Product.SHAMPOO, amount);
        }

        return ifAmountOfProductIsAvailable;
    }
}
