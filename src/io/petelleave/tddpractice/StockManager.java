package io.petelleave.tddpractice;

public class StockManager {

    private ExternalISBNDataService webService;
    private ExternalISBNDataService dbService;

    public void setWebService(ExternalISBNDataService webService) {
        this.webService = webService;
    }

    public void setDbService(ExternalISBNDataService dbService) {
        this.dbService = dbService;
    }

    public String getLocatorCode(String isbn) {
        StockedBook book = dbService.lookup(isbn);
        if (book == null) {
            book = webService.lookup(isbn);
        }
        return isbn.substring(isbn.length() - 4) +
                book.getAuthor().charAt(0) +
                book.getTitle().split(" ").length;
    }
}
