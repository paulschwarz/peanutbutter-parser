package me.paulschwarz.peanutbutter;

import java.util.List;

public abstract class Parser {

    protected List<String> dictionary;

    public Parser(List<String> dictionary){
        this.dictionary = dictionary;
    }

    public abstract List<String> parse(String input);

}
