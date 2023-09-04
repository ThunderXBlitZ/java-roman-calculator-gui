package com.illumina.utils.roman;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;


public class RomanCalculator {

    private static final Map<String, Integer> romanMap = new HashMap<String,Integer>()
    {{
        put("M", 1000);
        put("CM", 900);
        put("D", 500);
        put("CD", 400);
        put("C", 100);
        put("XC", 90);
        put("L", 50);
        put("XL", 40);
        put("X", 10);
        put("IX", 9);
        put("V", 5);
        put("IV", 4);
        put("I", 1);
    }};

    private static final Map<Integer, String> numeralMap = new LinkedHashMap<Integer,String>()
    {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public static boolean validateRoman(String input){
        return input.isEmpty() == false && input.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    }

    public static boolean validateNumeral(int input){
        return (input == (int)input && input > 0) ? true:false;
    }

    public static int RomanToNumeral(String input){
        int output = 0;
        int n = input.length();

        for(int i = 0; i < n; i++){

            if (i < n - 1){
                String key = input.substring(i, i+2);
                if (romanMap.containsKey(key)){
                    output += romanMap.get(key);
                    i++;
                    continue;
                }
            }
            output += romanMap.get(input.substring(i, i+1));
        }

        return output;
    }

    public static String NumeralToRoman(int input){
        StringBuilder output = new StringBuilder();

        for (Map.Entry<Integer, String> set:numeralMap.entrySet()) {
            while(input >= set.getKey()){
                input = input - set.getKey();
                output.append(set.getValue());
            }
        }

        return output.toString();
    }
}
