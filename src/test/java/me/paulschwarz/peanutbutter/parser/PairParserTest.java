package me.paulschwarz.peanutbutter.parser;

import junit.framework.TestCase;
import me.paulschwarz.peanutbutter.Parser;

import java.util.ArrayList;
import java.util.Arrays;

public class PairParserTest extends TestCase {

    private Parser parser;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.parser = new PairParser();
    }

    public void testWhenEmpty()
    {
        assertTrue(parser.parse("").isEmpty());
    }

    public void testMatchSingle()
    {
        assertTrue(parser.parse("butter")
                .containsAll(new ArrayList<String>(Arrays.asList("butter"))));
    }

    public void testMatchPair()
    {
        assertTrue(parser.parse("peanutbutter")
                .containsAll(new ArrayList<String>(Arrays.asList("peanut", "butter"))));
    }

}
