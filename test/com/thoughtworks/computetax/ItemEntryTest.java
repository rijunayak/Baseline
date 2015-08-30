package com.thoughtworks.computetax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemEntryTest {

    @Test
    public void shouldHaveZeroTaxForZeroCostItem() {
        ItemEntry itemEntry = new ItemEntry(1, "nothing", 0.0, false);

        assertEquals(0.0, itemEntry.tax(), 0.00001);
    }

    @Test
    public void shouldRightlyReturnTaxIfAnItemIsTaxableAndUnimported() {
        ItemEntry itemEntry = new ItemEntry(1, "perfume", 4.0, false);

        assertEquals(0.4, itemEntry.tax(), 0.00001);
    }

    @Test
    public void shouldReturnZeroTaxForUntaxableAndUnimportedItem() {
        ItemEntry itemEntry = new ItemEntry(1, "chocolate", 1.5, false);

        assertEquals(0.0, itemEntry.tax(), 0.00001);
    }

    @Test
    public void shouldAccuratelyRoundOff() {
        ItemEntry itemEntry = new ItemEntry(1, "mouse pad", 13.35, false);

        assertEquals(1.35, itemEntry.tax(), 0.0);
    }

    @Test
    public void shouldRightlyReturnTaxForImportedUntaxableItem() {
        ItemEntry itemEntry = new ItemEntry(1, "imported box of chocolates", 13.35, true);

        assertEquals(0.7, itemEntry.tax(), 0.0);
    }

    @Test
    public void shouldAccountForQuantityWhileReturningTax() {
        ItemEntry itemEntry = new ItemEntry(2, "mouse pad", 13.35, false);

        assertEquals(2.7, itemEntry.tax(), 0.0);
    }
}
