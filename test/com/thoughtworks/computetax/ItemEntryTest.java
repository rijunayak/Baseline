package com.thoughtworks.computetax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemEntryTest {

    @Test
    public void shouldHaveZeroTaxForZeroCostItem() {
        ItemEntry itemEntry = new ItemEntry(0, "nothing", 0.0, ItemEntry.IMPORTED_ITEM);

        assertEquals(0.0, itemEntry.tax(), 0.00001);
    }
}
