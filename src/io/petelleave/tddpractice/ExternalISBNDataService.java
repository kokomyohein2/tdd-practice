package io.petelleave.tddpractice;

public interface ExternalISBNDataService {
    StockedBook lookup(String isbn);
}
