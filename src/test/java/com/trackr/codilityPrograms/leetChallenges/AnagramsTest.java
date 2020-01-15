package com.trackr.codilityPrograms.leetChallenges;

import org.junit.jupiter.api.*;

/**
 * Created by deepti on 11/6/19.
 */
public class AnagramsTest {
    @Test
    void areAnagrams() {
        Assertions.assertEquals(true, Anagrams.areAnagrams("abcd", "abdc"));
        Assertions.assertEquals(true, Anagrams.areAnagrams("abcd", "dcba"));
        Assertions.assertEquals(false, Anagrams.areAnagrams("abcd", "a"));
        Assertions.assertEquals(false, Anagrams.areAnagrams("abcd", "abdcde"));
        Assertions.assertEquals(false, Anagrams.areAnagrams("abcd", ""));
        Assertions.assertEquals(false, Anagrams.areAnagrams("abcd", null));
    }

}