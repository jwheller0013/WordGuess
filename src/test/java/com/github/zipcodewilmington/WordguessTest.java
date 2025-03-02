package com.github.zipcodewilmington;

import junit.framework.TestCase;
import org.junit.Test;
import com.github.zipcodewilmington.Wordguess;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordguessTest extends TestCase {

    @Test
    public void testTestRunGame() {
        Wordguess wordguess1 = new Wordguess();
        String actual = wordguess1.runGame();
        assertEquals("Game On", actual);
    }
//    @org.junit.jupiter.api.Test
//    void runGame() {
//        Wordguess wordguess1 = new Wordguess();
//        String actual = wordguess1.runGame();
//        assertEquals("Game On", actual);
//    }
//
//    @org.junit.jupiter.api.Test
//    void testRunGame() {
//    }
}