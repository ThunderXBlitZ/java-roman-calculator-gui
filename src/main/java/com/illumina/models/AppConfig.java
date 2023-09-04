package com.illumina.models;

import com.illumina.utils.roman.RomanCalculator;


public class AppConfig implements IConfig{
    private Mode mode;
    private String roman;
    private int numeral;

    public AppConfig(){
        mode = Mode.ROMAN;
        clearValues();
        roman = "";
        numeral = -1;
    }

    public void clearValues(){
        roman = "";
        numeral = -1;
    }

    public Mode getMode(){ return mode; }

    public String getRoman(){ return roman; }

    public int getNumeral(){ return numeral; }

    public void toggleMode(){
        mode = (mode == Mode.ROMAN) ? Mode.NUMERAL : Mode.ROMAN;
    }

    public String compute(String input) throws IllegalArgumentException{
        if (mode == Mode.ROMAN){
            roman = input;
            numeral = validateComputeRomantoNumeral(input);
            return String.valueOf(numeral);
        } else {
            roman = validateComputeNumeraltoRoman(input);
            numeral = Integer.parseInt(input);
            return roman;
        }
    }

    private int validateComputeRomantoNumeral(String input) throws IllegalArgumentException {
        if (RomanCalculator.validateRoman(input)){
            return RomanCalculator.RomanToNumeral(input);
        } else {
            throw new IllegalArgumentException("Invalid Roman input found!");
        }
    }

    private String validateComputeNumeraltoRoman(String input) throws IllegalArgumentException {
        int intInput = Integer.parseInt(input);
        if (RomanCalculator.validateNumeral(intInput)){
            return RomanCalculator.NumeralToRoman(intInput);
        } else {
            throw new IllegalArgumentException("Invalid Numeral input found!");
        }
    }
}
