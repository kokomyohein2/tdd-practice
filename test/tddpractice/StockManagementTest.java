package tddpractice;

import io.petelleave.tddpractice.ExternalISBNDataService;
import io.petelleave.tddpractice.StockManager;
import io.petelleave.tddpractice.StockedBook;
import org.junit.Assert;
import org.junit.Test;

public class StockManagementTest {

    @Test
    public void testCanGetACorrectLocatorCode() {
        ExternalISBNDataService mockWebService = new ExternalISBNDataService() {
            @Override
            public StockedBook lookup(String isbn) {
                return new StockedBook(isbn, "Tom and jerry movie", "J. Stockholms");
            }

            @Override
            public StockedBook takeup(String isbn) {
                return null;
            }
        };
        ExternalISBNDataService mockDbService = new ExternalISBNDataService() {
            @Override
            public StockedBook lookup(String isbn) {
                return null;
            }

            @Override
            public StockedBook takeup(String isbn) {
                return null;
            }
        };

        StockManager stockManager = new StockManager();
        stockManager.setDbService(mockDbService);
        stockManager.setWebService(mockWebService);

        String isbn = "0140177396";
        String locatorCode = stockManager.getLocatorCode(isbn);
        Assert.assertEquals("7396J4", locatorCode);
    }
}
