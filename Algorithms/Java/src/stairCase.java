import java.util.Scanner;

/**
 * Created by TaiRui on 2016-07-31.
 */
public class stairCase {
    public static void printStairs(int i) {
        if(i <= 0){
            return;
        } else {
            System.out.print("#");
            printStairs(i - 1);
        }
    }

    public static void printBlank(int i){
        if(i <= 0){
            return;
        } else {
            System.out.print(" ");
            printBlank(i - 1);
        }
    }

    public static void recStairs(int n, int i) {
        if(i == n){
            return;
        } else {
            printBlank(n-i-1);
            printStairs(i);
            System.out.print("\n");
            recStairs(n, i = i + 1);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        recStairs(n+1,1);
    }
}
