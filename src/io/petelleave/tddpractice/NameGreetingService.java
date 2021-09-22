package io.petelleave.tddpractice;

import java.util.Arrays;

public class NameGreetingService {

    public String greet(String name) {
        if (name == null) {
            return "Hello, my friend.";
        }

        if (name.contains("&")) {
            String[] names = name.split("&");
            return "Hello, " + names[0] + " and " + names[1] + ".";
        }

        boolean isAllCaptalized = true;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isLowerCase(name.charAt(i))) {
                isAllCaptalized = false;
                break;
            }
        }
        if (isAllCaptalized) {
            return "HELLO, " + name + "!";
        }

        return "Hello, " + name + ".";
    }
}
