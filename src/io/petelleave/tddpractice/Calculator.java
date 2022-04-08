package io.petelleave.tddpractice;

import java.util.Arrays;

public class Calculator {
    public int add(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] inputs = input.split(",");
        return Arrays.stream(inputs).mapToInt(Integer::parseInt).sum();
    }
}
