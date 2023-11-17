package com.sparta.ft;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class RomanNumeralConverterTest {

    @Test
    @DisplayName("Test Convert Output 294")
    public void testConvert294() {
        Assertions.assertEquals("CCXCIV", RomanNumeralConverter.convert(294));
    }

    @Test
    @DisplayName("Test Convert Output 3080")
    public void testConvert3080() {
        Assertions.assertEquals("MMMLXXX", RomanNumeralConverter.convert(3080));
    }

        @Test
    @DisplayName("Test Convert Output 0")
    public void testConvert0() {
        Assertions.assertEquals("NULLA", RomanNumeralConverter.convert(0));
    }

}