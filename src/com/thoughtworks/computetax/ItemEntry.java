// An Item Entry has a quantity, item name, price, and its sales tax
package com.thoughtworks.computetax;

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
        if(!isImported) {
            if(itemName.contains("chocolate") || itemName.contains("book") || itemName.contains("headache pills")) {
                return 0.0;
            }
        }
        return price;
    }
}
