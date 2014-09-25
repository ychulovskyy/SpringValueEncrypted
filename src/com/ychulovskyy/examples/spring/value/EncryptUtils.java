package com.ychulovskyy.examples.spring.value;

public class EncryptUtils {

    static public String encrypt(String value) {
        if (value == null || value.isEmpty()) {
            return value;
        }

        StringBuilder result = new StringBuilder();
        for (char c : value.toCharArray()) {
            result.append((char) (c - 2));
        }
        return result.toString();
    }
}
