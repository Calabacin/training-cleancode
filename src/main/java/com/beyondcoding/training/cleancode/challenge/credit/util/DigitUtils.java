package com.beyondcoding.training.cleancode.challenge.credit.util;

public class DigitUtils {

    private DigitUtils() {
    }

    public static int getDigitAt(int index, String string) {
        char character = string.charAt(index);
        String digit = String.valueOf(character);
        return Integer.parseInt(digit);
    }
}
