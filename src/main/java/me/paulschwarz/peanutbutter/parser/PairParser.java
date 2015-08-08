package me.paulschwarz.peanutbutter.parser;

import me.paulschwarz.peanutbutter.Parser;

import java.util.ArrayList;
import java.util.List;

public class PairParser extends Parser {

    public PairParser(List<String> dictionary){
        super(dictionary);
    }

    @Override
    public List<String> parse(String input) {
        List<String> words = new ArrayList<String>(2);
        String l, r;
        for (int i = 1; i < input.length() - 1; i++){
            l = input.substring(0, i);
            r = input.substring(i, input.length());
            if (dictionary.contains(l) && dictionary.contains(r)){
                words.add(l);
                words.add(r);
                return words;
            }
        }
        if (dictionary.contains(input)){
            words.add(input);
        }
        return words;
    }

}
