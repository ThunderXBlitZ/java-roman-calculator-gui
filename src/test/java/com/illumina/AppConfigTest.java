package com.illumina;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.illumina.models.AppConfig;
import com.illumina.models.Mode;


public class AppConfigTest
{
    @Test
    public void testToggleMode()
    {
        AppConfig appConfig = new AppConfig();
        assertEquals(Mode.ROMAN, appConfig.getMode());
        appConfig.toggleMode();
        assertEquals(Mode.NUMERAL, appConfig.getMode());
        appConfig.toggleMode();
        assertEquals(Mode.ROMAN, appConfig.getMode());
    }

    @Test
    public void testComputeRomanToNumeral()
    {
        AppConfig appConfig = new AppConfig();

        appConfig.compute("I");
        int numeral = appConfig.getNumeral();
        assertEquals(numeral, 1);
    }

    @Test
    public void testComputeNumeralToRoman()
    {
        AppConfig appConfig = new AppConfig();
        appConfig.toggleMode();

        appConfig.compute("1");
        String roman = appConfig.getRoman();
        assertEquals(roman, "I");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testComputeRomanToNumeralException()
    {
        AppConfig appConfig = new AppConfig();
        appConfig.compute("abc");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testComputeNumeraltoRomanException()
    {
        AppConfig appConfig = new AppConfig();
        appConfig.toggleMode();
        appConfig.compute("-1");
    }
}
