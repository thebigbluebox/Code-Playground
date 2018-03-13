package CTCI.CH1;

import java.util.HashMap;
import java.util.Map;

public class q5 {
    public static void main(String[] args) {
        System.out.println(oneAway("pale","pales"));
        System.out.println(oneAway("pale","pal"));
        System.out.println(oneAway("pale","bale"));
        System.out.println(oneAway("pale","bake"));
    }

    /**
     * This will see if there is only one difference between the two strings
     * @param a String A
     * @param b String B
     * @return Boolean of whether or not the string only has one difference
     */
    private static boolean oneAway(String a, String b){
        int length;
        String large;
        String small;
        if(a.length() > b.length()){
            length = a.length();
            large = a;
            small = b;
        } else {
            length = b.length();
            large = b;
            small = a;
        }
        boolean gotFalse = false;
        int i;

        for(i = 0; i < length; i++){
            if(i < small.length() && large.charAt(i) == small.charAt(i)){

            } else {
                if(!gotFalse){
                    gotFalse = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
