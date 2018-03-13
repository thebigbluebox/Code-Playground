package CTCI.CH1;

import java.util.HashMap;
import java.util.Map;

public class q4 {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("TACO CAT"));
        System.out.println(checkPalindrome("RACECAR"));
        System.out.println(checkPalindrome("AAAAA"));
    }

    /**
     * This will return whether or not this input string is a palindrome and can be permutated to other
     *
     * @param input the String to check for palindrome
     * @return Boolean whether or not this is a palindrome
     */
    private static Boolean checkPalindrome(String input) {
        Map<Character, Integer> textFrequencyMap = new HashMap<>();
        Character current;
        int i, value;

        for (i = 0; i < input.length(); i++) {
            current = input.charAt(i);
            if (textFrequencyMap.get(current) == null) {
                if (current != ' ') {
                    textFrequencyMap.put(input.charAt(i), 1);
                }
            } else {
                value = textFrequencyMap.get(current);
                textFrequencyMap.put(current, value + 1);
            }
        }

        if (textFrequencyMap.size() == 1) {
            return false;
        }

        Boolean odd = false;
        for (Character key : textFrequencyMap.keySet()) {
            if ((textFrequencyMap.get(key) % 2 == 1) && odd) {
                return false;
            }
            if ((textFrequencyMap.get(key) % 2 == 1) && !odd) {
                odd = true;
            }
        }
        return true;
    }
}
