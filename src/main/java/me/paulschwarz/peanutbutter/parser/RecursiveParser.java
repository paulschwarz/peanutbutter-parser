package me.paulschwarz.peanutbutter.parser;

import me.paulschwarz.peanutbutter.Parser;

import java.util.ArrayList;
import java.util.List;

public class RecursiveParser extends Parser {

    public RecursiveParser(List<String> dictionary){
        super(dictionary);
    }

    @Override
    public List<String> parse(String input) {
        List<String> words = new ArrayList<String>(2);
        split(words, input);
        return words;
    }

    private void split(List<String> words, String input){
        String l, r;
        for (int i = 1; i < input.length() - 1; i++){
            l = input.substring(0, i);
            r = input.substring(i, input.length());
            if (dictionary.contains(l) && dictionary.contains(r)){
                split(words, l);
                split(words, r);
                return;
            }
        }
        if (dictionary.contains(input)){
            words.add(input);
        }
    }

}
