import java.util.Scanner;

/**
 * Created by TaiRui on 2016-08-01.
 */
public class biggerIsGreater {

    public static int alphaToIndex(String alpha1){
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        return alpha.indexOf(alpha1)+1;
    }

    public static int alphaToIndex(char alpha) {
        return alphaToIndex(Character.toString(alpha));
    }

    public static boolean isMax(String alpha) {
        for(int i = 0; i < alpha.length()-1; i++){
            if(alphaToIndex(Character.toString(alpha.charAt(i))) < alphaToIndex(Character.toString(alpha.charAt(i+1)))){
                return false;
            }
        }
        return true;
    }

    public static boolean isMultiple(String alpha) {
        int count = 0;
        for(int i = 0; i < alpha.length()-1; i++){
            if(alphaToIndex(alpha.charAt(0)) < alphaToIndex(alpha.charAt(i+1))){
                count ++;
            }
        }
        if(count > 1){
            return true;
        }
        return false;
    }

    public static String nextLex(String alpha){
        char [] array = alpha.toCharArray();
        for(int i = 0; i < array.length; i++){

        }
        return "";
    }

    public static String highestLex(String alpha){
        char [] array = alpha.toCharArray();
        return "";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
//        String text = in.next();

//        if(isMax(text)){
//            System.out.println("No Answer");
//        } else if (isMultiple(text)){
//            System.out.println(nextLex(text));
//        } else {
//            System.out.println(highestLex(text));
//        }
    }
}
