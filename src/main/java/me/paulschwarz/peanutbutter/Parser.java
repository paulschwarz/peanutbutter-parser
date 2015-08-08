package me.paulschwarz.peanutbutter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Parser {

    static final List<String> DICTIONARY = new ArrayList<String>(Arrays.asList(
            "pea",
            "peanut",
            "nut",
            "but",
            "butt",
            "butter"
    ));

    public List<String> parse(String input);

}
