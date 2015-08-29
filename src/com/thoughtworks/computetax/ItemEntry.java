// An Item Entry has a quantity, item name, price, and its sales tax
package com.thoughtworks.computetax;

import static java.lang.Math.ceil;

public class ItemEntry {
    private int quantity;
    private String itemName;
    private double price;
    private boolean isImported;
    private boolean isTaxable;

    public ItemEntry(int quantity, String itemName, double price, boolean isImported) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.price = price;
        this.isImported = isImported;
        if(!itemName.contains("chocolate") && !itemName.contains("book") && !itemName.contains("headache pills")) {
            this.isTaxable = true;
        } else {
            this.isTaxable = false;
        }
    }

    public double tax() {
        double tax = 0;
        if(!isImported) {
            if(isTaxable)
                tax += (price * 0.1);
        }
        return tax;
    }
}
