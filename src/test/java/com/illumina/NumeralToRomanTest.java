package com.illumina;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.illumina.utils.roman.RomanCalculator;

public class NumeralToRomanTest
{
    @Test
    public void testValidateEdgeCase()
    {
        assertEquals(false, RomanCalculator.validateNumeral(-1));
        assertEquals(false, RomanCalculator.validateNumeral(0));
    }

    @Test
    public void testValidateCorrect()
    {
        assertEquals(true, RomanCalculator.validateNumeral(1));
        assertEquals(true, RomanCalculator.validateNumeral(100));
    }

    @Test
    public void testConvertCorrect()
    {
        assertEquals( "I", RomanCalculator.NumeralToRoman(1) );
        assertEquals( "IV", RomanCalculator.NumeralToRoman(4) );
        assertEquals( "IX", RomanCalculator.NumeralToRoman(9) );
        assertEquals( "XLIX", RomanCalculator.NumeralToRoman(49) );
        assertEquals( "XC", RomanCalculator.NumeralToRoman(90) );
        assertEquals( "MMMCMXCIX", RomanCalculator.NumeralToRoman(3999) );
    }

    @Test
    public void testConvertWrong()
    {
        assertNotEquals( "IV", RomanCalculator.NumeralToRoman(9) );
        assertNotEquals( "IX", RomanCalculator.NumeralToRoman(4) );
    }
}
