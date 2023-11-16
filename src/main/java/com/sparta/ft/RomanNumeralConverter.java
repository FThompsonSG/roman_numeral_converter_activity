package com.sparta.ft;

import java.util.TreeMap;

public class RomanNumeralConverter {

    public static String convert(int input) {

        // Could not resolve the issue so did some research online to find guidance to satisfy task parameters
        // Can provide source upon request

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000,"M");

        // int variable is assigned the greatest key in map less than or equal to input

        int v =  map.floorKey(input);

        // returns the value in tree map if it is exactly equal to input

        if (input == v) {
            return map.get(input);
        }
        // returns the greatest key in map less than or equal to input concatenated with result of recursion
        // which will keep calling itself until the above if statement is executed

        return map.get(v) + convert(input - v);
    }

}
