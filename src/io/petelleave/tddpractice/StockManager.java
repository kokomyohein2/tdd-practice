package io.petelleave.tddpractice;

public class StockManager {

    private ExternalISBNDataService service;

    public void setService(ExternalISBNDataService service) {
        this.service = service;
    }

    public String getLocatorCode(String isbn) {
        StockedBook book = service.lookup(isbn);
        return isbn.substring(isbn.length() - 4) +
                book.getAuthor().charAt(0) +
                book.getTitle().split(" ").length;
    }
}
