package CTCI.CH1;

import java.util.HashMap;
import java.util.Map;

public class q1 {

    public static void main(String[] args) {
        System.out.println(isUnique("bb"));
    }

    /**
     * Returns true if the input string contains only unique characters
     * @param input the String to input
     * @return boolean of if the characters are unique or not
     */
    private static Boolean isUnique(String input){
        if(input != null && !input.equals("")) {
            Map<Character, Integer> characterIntegerMap = new HashMap<>();
            characterIntegerMap.put(input.charAt(0), 1);
            int i;
            for (i = 1; i < input.length(); i++) {
                Integer value = characterIntegerMap.get(input.charAt(i));
                if(value == null){
                    characterIntegerMap.put(input.charAt(i), 1);
                }
                // Straight up return false if its 1, we don't need to check if its above 1
                if(value != null && value == 1){
                    return false;
                }
            }
        }
        return true;
    }
}
