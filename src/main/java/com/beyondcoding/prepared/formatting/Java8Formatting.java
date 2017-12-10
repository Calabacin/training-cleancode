package com.beyondcoding.prepared.formatting;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Formatting {

    public static void main(String[] args) {
        String[] letters = "a,b,c,d".split(",");
        List<String> mapped = Stream.of(letters)
                                    .filter(e -> !e.equals("a"))
                                    .map(String::toUpperCase)
                                    .map(e -> e + "1")
                                    .collect(Collectors.toList());
        System.out.println(mapped);
    }

}
