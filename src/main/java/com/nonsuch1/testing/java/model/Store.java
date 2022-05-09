package com.nonsuch1.testing.java.model;

import java.util.HashMap;
import java.util.Map;

public class Store {
    private Map<Product, Integer> warehouse = new HashMap<>();

    public void addInventory(Product product, int amount) {
        warehouse.merge(product, amount, (availableAmount, purchasedAmount) -> availableAmount + purchasedAmount);
    };
    public int getInventory(Product product) {
        return warehouse.get(product);
    };

    public void removeInventory(Product product, int amount) {
        warehouse.merge(product, amount, (availableAmount, purchasedAmount) -> availableAmount - purchasedAmount);
    };

//    public void removeInventory(Product shampoo, int amount) {
//    }

    public boolean hasEnoughInventory(Product product, int amount) {
        return true;
    }
}
