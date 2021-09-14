package io.petelleave.tddpractice;

public class ValidateISBN {

    public boolean checkISBN(String isbn) {
        if (isbn.length() != 10) {
            throw new NumberFormatException("Must be 10 digits");
        }
        int total = 0;
        for (int i = 0; i < 10; i++) {
            if (!Character.isDigit(isbn.charAt(i))) {
                if (i == 9 && isbn.charAt(i) == 'X') {
                    total += 10;
                } else {
                    throw new NumberFormatException("Must be digits only");
                }
            } else {
                total += Character.getNumericValue(isbn.charAt(i)) * (10 - i);
            }
        }
        return total % 11 == 0;
    }
}
