package com.illumina;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.illumina.utils.roman.RomanCalculator;


public class RomanToNumeralTest
{
    @Test
    public void testValidateEdgeCase()
    {
        assertEquals(false, RomanCalculator.validateRoman(""));
    }

    @Test
    public void testValidateCorrect()
    {
        assertEquals(true, RomanCalculator.validateRoman("I"));
        assertEquals(true, RomanCalculator.validateRoman("MMMCMXCIX"));
    }

    @Test
    public void testValidateWrong()
    {
        assertEquals(false, RomanCalculator.validateRoman("IVIV"));
        assertEquals(false, RomanCalculator.validateRoman("ABCDEF"));
        assertEquals(false, RomanCalculator.validateRoman("123-!@@!#"));
    }

    @Test
    public void testConvertCorrect()
    {
        assertEquals( 1, RomanCalculator.RomanToNumeral("I") );
        assertEquals( 4, RomanCalculator.RomanToNumeral("IV") );
        assertEquals( 9, RomanCalculator.RomanToNumeral("IX") );
        assertEquals( 49, RomanCalculator.RomanToNumeral("XLIX") );
        assertEquals( 90, RomanCalculator.RomanToNumeral("XC") );
        assertEquals( 3999, RomanCalculator.RomanToNumeral("MMMCMXCIX") );
    }

    @Test
    public void testConvertWrong()
    {
        assertNotEquals( -1, RomanCalculator.RomanToNumeral("I") );
        assertNotEquals( 9, RomanCalculator.RomanToNumeral("IV") );
        assertNotEquals( 4, RomanCalculator.RomanToNumeral("IX") );
    }
}
