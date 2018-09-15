package com.jboy.ch1_arrays_and_strings;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q01_01_is_unique_charsTest {
    @Test
    void isUniqueChars_test1() {
        assertTrue(Q01_01_IsUnique_2018_09_15.isUniqueChars("abcde"));
    }

    @Test
    void isUniqueChars_test2() {
        assertFalse(Q01_01_IsUnique_2018_09_15.isUniqueChars("hello"));
        assertFalse(Q01_01_IsUnique_2018_09_15.isUniqueChars("apple"));
        assertTrue(Q01_01_IsUnique_2018_09_15.isUniqueChars("kite"));
        assertTrue(Q01_01_IsUnique_2018_09_15.isUniqueChars("padle"));
    }
}