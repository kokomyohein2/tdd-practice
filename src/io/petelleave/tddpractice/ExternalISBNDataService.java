package io.petelleave.tddpractice;

public interface ExternalISBNDataService {
    StockedBook lookup(String isbn);
    StockedBook takeup(String isbn);
}
