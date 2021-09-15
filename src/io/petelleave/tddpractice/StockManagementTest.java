package io.petelleave.tddpractice;

import org.junit.Assert;
import org.junit.Test;

public class StockManagementTest {

    @Test
    public void testCanGetACorrectLocatorCode() {
        String isbn = "0140177396";
        StockManager stockManager = new StockManager();
        String locatorCode = stockManager.getLocatorCode(isbn);
        Assert.assertEquals("7396J4", locatorCode);
    }
}
