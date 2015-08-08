package me.paulschwarz.peanutbutter.parser;

import junit.framework.TestCase;
import me.paulschwarz.peanutbutter.Parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairParserTest extends TestCase {

    static final List<String> DICTIONARY = new ArrayList<String>(Arrays.asList(
            "pea",
            "peanut",
            "nut",
            "but",
            "butt",
            "butter"
    ));
    private Parser parser;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.parser = new PairParser(DICTIONARY);
    }

    public void testWhenEmpty()
    {
        assertTrue(parser.parse("").isEmpty());
    }

    public void testUnknownWord()
    {
        assertTrue(parser.parse("pe").isEmpty());
    }

    public void testExtraneousCharacters()
    {
        assertTrue(parser.parse("peanuts").isEmpty());
    }

    public void testMatchSingle()
    {
        assertTrue(parser.parse("pea")
                .containsAll(new ArrayList<String>(Arrays.asList("pea"))));
    }

    public void testMatchPair()
    {
        assertTrue(parser.parse("peanutbutter")
                .containsAll(new ArrayList<String>(Arrays.asList("peanut", "butter"))));
    }

}
