package com.beyondcoding.training.cleancode.challenge.credit;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChecksumCalculator {

    public static final int ASCII_NUMBER_OFFSET = 48;

    public int calculate(String creditCardNumber) {
        List<Integer> numbers = creditCardNumber.chars()
                                                .boxed()
                                                .map(n -> n - ASCII_NUMBER_OFFSET)
                                                .collect(Collectors.toList());

        Collections.reverse(numbers);
        int size = numbers.size();
        List<Integer> even = IntStream.range(0, size)
                                      .filter(n -> n % 2 == 1)
                                      .mapToObj(numbers::get)
                                      .collect(Collectors.toList());
        List<Integer> odd = IntStream.range(0, size)
                                     .filter(n -> n % 2 == 0)
                                     .mapToObj(numbers::get)
                                     .collect(Collectors.toList());

        Integer result = even.stream()
                             .reduce(0, (sum, next) -> sum + calculateSpecialProduct(next));
        return odd.stream()
                  .reduce(result, (sum, next) -> sum + next);
    }

    private int calculateSpecialProduct(Integer next) {
        int result = next * 2;
        if (result < 10) {
            return result;
        }
        int units = result / 10;
        int docens = result % 10;
        return docens + units;
    }

}
