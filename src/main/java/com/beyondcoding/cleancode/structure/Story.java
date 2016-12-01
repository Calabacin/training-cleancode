package com.beyondcoding.cleancode.structure;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Story {

    public static final int MAXIMUM_TITLE_LENGTH = 120;

    private static final int MINIMUM_EXPECTED_CHARACTERS = 2;

    private String title;

    private Set<Character> characters = new HashSet<>(MINIMUM_EXPECTED_CHARACTERS);

    public Story(String title) {
        assertMaximumLength(title);
        this.title = title;
    }

    private void assertMaximumLength(String title) {
        if (title.length() > MAXIMUM_TITLE_LENGTH) {
            throw new IllegalStateException("Title is too long");
        }
    }

    public String getTitle() {
        return title;
    }

    public void add(Character character) {
        characters.add(character);
    }

    public Set<Character> getCharacters() {
        return characters;
    }

    public List<String> getCharacterNames() {
        return characters.stream()
                         .map(Character::getName)
                         .collect(Collectors.toList());
    }

}
