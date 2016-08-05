import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by TaiRui on 2016-07-31.
 */
public class bigIntegerAdd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
            int arraySize = in.nextInt();
            BigInteger [] array = new BigInteger [arraySize];
            BigInteger sum = BigInteger.valueOf(0);
            for(int i = 0; i < arraySize; i++){
                sum = sum.add(in.nextBigInteger());
        }

        System.out.println(sum);
    }


    public static void solution(int a){

    }
}
