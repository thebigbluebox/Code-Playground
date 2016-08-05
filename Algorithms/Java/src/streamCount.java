import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by TaiRui on 2016-07-31.
 */
public class streamCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int [] a = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            a[i]  = in.nextInt();
        }
        double a1 = (double)IntStream.of(a).filter(p -> p >0).count();
        double a2 = (double)IntStream.of(a).filter(p -> p <0).count();
        double a3 = (double)IntStream.of(a).filter(p -> p ==0).count();
        double as = (double)arraySize;
        System.out.println(a1/as);
        System.out.println(a2/as);
        System.out.println(a3/as);
    }
}
