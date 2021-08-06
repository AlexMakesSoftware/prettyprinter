package me.alexconnell.utils.prettyprinter;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ColouriserTest {
    @Test
    void correctLength() {
        String s = new Colouriser("Test").red(" message.").toString();

        assertTrue(s.contains("Test"));
        assertTrue(s.contains("message."));
    }
}
