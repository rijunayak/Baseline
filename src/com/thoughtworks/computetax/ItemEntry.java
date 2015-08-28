// A Entry in the receipt which should print its..
package com.thoughtworks.computetax;

import java.util.ArrayList;

public class ItemEntry {
    private int quantity;
    private String itemName;
    private double price;
    private boolean isImported;

    public static final boolean IMPORTED_ITEM = true;
    public static final boolean NOT_IMPORTED = false;

    public ItemEntry(int quantity, String itemName, double price, boolean isImported) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.price = price;
        this.isImported = isImported;
    }

    public double tax() {
        return 0.0;
    }
}
