package com.agrichain.tests;


import java.util.HashMap;

public class Problem1 {

	public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        int maxLength = 0;
        int start = 0;
        
        for (int currentPos = 0; currentPos < s.length(); currentPos++) {
            char currentChar = s.charAt(currentPos);
            
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= start) {
                start = charMap.get(currentChar) + 1;
            } else {
                maxLength = Math.max(maxLength, currentPos - start + 1);
            }
            
            charMap.put(currentChar, currentPos);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String[] testCases = {"abcabcbb", "bbbbb", "pwwkew", "", "dvdf"};
        for (String test : testCases) {
            System.out.println("String: " + test + ", Length: " + lengthOfLongestSubstring(test));
        }
    }

}
