package com.lisa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test1() {
        //given:
        final String  str = "mississippi";

        //when:
        final String results = Main.findLongestRepeatingSubstring(str);

        //then:
        assertEquals( "issi", results);
    }

    @Test
    void test2() {
        //given:
        final String  str = "lisa";

        //when:
        final String results = Main.findLongestRepeatingSubstring(str);

        //then:
        assertEquals("No substrings possible", results);
    }

    @Test
    void test3() {
        //given:
        final String  str = "ababababa";

        //when:
        final String results = Main.findLongestRepeatingSubstring(str);

        //then:
        assertEquals("abababa", results);
    }

    @Test
    void testNoDistinctCharacters() {
        //given:
        final String  str = "aaaaaaaaaa";

        //when:
        final String results = Main.findLongestRepeatingSubstring(str);

        //then:
        assertEquals("aaaaaaaaa", results);
    }

    @Test
    void testTwoCharacterString() {
        //given:
        final String  str = "bb";

        //when:
        final String results = Main.findLongestRepeatingSubstring(str);

        //then:
        assertEquals("b", results);
    }

    @Test
    void testOneCharacterString() {
        //given:
        final String  str = "x";

        //when:
        final String results = Main.findLongestRepeatingSubstring(str);

        //then:
        assertEquals("No substrings possible", results);
    }

    @Test
    void testEmptyString() {
        //given:
        final String  str = "";

        //when:
        final String results = Main.findLongestRepeatingSubstring(str);

        //then:
        assertEquals("No substrings possible", results);
    }

    @Test
    void testFun() {
        //given:
        final String  str = "Supercalifragilisticexpialidocious";

        //when:
        final String results = Main.findLongestRepeatingSubstring(str);

        //then:
        assertEquals("ali", results);
    }

    @Test
    void testNoFun() {
        //given:
        final String  str = "aaaabbbb";

        //when:
        final String results = Main.findLongestRepeatingSubstring(str);

        //then:
        assertEquals("aaa", results);
    }

}
