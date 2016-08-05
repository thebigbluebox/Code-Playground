import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by TaiRui on 2016-07-29.
 */
public class arraySum {

    public static int arraySumRec(int [] a) {
        if (a.length <= 1) {
            return a[0];
        }
        else {
            int [] b = java.util.Arrays.copyOfRange(a,1,a.length);
            return a[0] + arraySumRec(b);
        }
    }

    public static int arraySumStream(int [] a) {
        int sum = IntStream.of(a).sum();
        return sum;
    }


    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int [] array = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            array[i]  = in.nextInt();
        }
//        int sum = arraySumRec(array);
        int sum = arraySumStream(array);
        System.out.println(sum);
    }
}
