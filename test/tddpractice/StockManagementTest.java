package tddpractice;

import io.petelleave.tddpractice.ExternalISBNDataService;
import io.petelleave.tddpractice.StockManager;
import io.petelleave.tddpractice.StockedBook;
import org.junit.Assert;
import org.junit.Test;

public class StockManagementTest {

    @Test
    public void testCanGetACorrectLocatorCode() {
        ExternalISBNDataService mockService = isbn -> new StockedBook(isbn, "Tom and jerry movie", "J. Stockholms");
        StockManager stockManager = new StockManager();
        stockManager.setService(mockService);

        String isbn = "0140177396";
        String locatorCode = stockManager.getLocatorCode(isbn);
        Assert.assertEquals("7396J4", locatorCode);
    }
}
