package com.thoughtworks.computetax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemEntryTest {

    @Test
    public void shouldHaveZeroTaxForZeroCostItem() {
        ItemEntry itemEntry = new ItemEntry(1, "nothing", 0.0, ItemEntry.IMPORTED_ITEM);

        assertEquals(0.0, itemEntry.tax(), 0.00001);
    }

    @Test
    public void shouldHaveZeroTaxForUnimportedFoodItem() {
        ItemEntry itemEntry = new ItemEntry(1, "box of chocolates", 5.0, ItemEntry.NOT_IMPORTED);

        assertEquals(0.0, itemEntry.tax(), 0.00001);
    }

    @Test
    public void shouldHaveZeroTaxUnimportedBookItem() {
        ItemEntry itemEntry = new ItemEntry(1, "book", 6.0, ItemEntry.NOT_IMPORTED);

        assertEquals(0.0, itemEntry.tax(), 0.00001);
    }
}
