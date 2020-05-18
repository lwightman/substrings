package com.lisa;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.IntStream.range;

public class Main {
    public static final String S1 = "Mississippi";
    public static final String S2 = "Nick";
    public static final String S3 = "ababababa";
    public static final String S4 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    public static final String S5 = "";
    public static final String NO_RESULTS = "No substrings possible";

    public static String findLongestRepeatingSubstring(String input) {
        String longString = "";

        if (input.length() < 2) {
            // can't find repeating substring with less than 2 characters
            longString = NO_RESULTS;
        } else {
            for (int length = input.length(); length >= 1; length--) {
                //going down in length saves a few iterations
                String results = findSubStringOfLength(input, length);
                if(results.length() > longString.length()) {
                    longString = results;
                    break;
                }
            }
        }

        if(longString.length() == 0) {
            longString = NO_RESULTS;
        }

        return longString;
    }

    /*
        search for any repeating strings of length strLength
     */
    public static String findSubStringOfLength(final String input, final int strLength){
        for (int i = 0; i < input.length()-strLength; i++){
            // this substring starts at the beginning of the input string and spans strLength chars
            final String substring = input.substring(i, i + strLength);
            for (int j= i+1; j <= input.length()-strLength; j++){
                // this jString start one character to the right of the above substring and spans strLength chars.
                // we then compare and return if equal, or continue shifting jString to the right
                final String jString = input.substring(j, j+strLength);
                if(substring.equals(jString)){
                    return substring;
                }
            }
        }

        // there were no repeating substrings
        return "";
    }

    public static void main(String[] args) {
	    String results = findLongestRepeatingSubstring(S1);
	    System.out.println(S1 +": " +results);
        results = findLongestRepeatingSubstring(S2);
        System.out.println(S2 +": " +results);
        results = findLongestRepeatingSubstring(S3);
        System.out.println(S3 +": " +results);
        results = findLongestRepeatingSubstring(S4);
        System.out.println(S4 +": " +results);
        results = findLongestRepeatingSubstring(S5);
        System.out.println(S5 +": " +results);
    }
}
