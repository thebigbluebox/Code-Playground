import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by TaiRui on 2016-08-01.
 */
public class arrayShift {

    public static int[] intArrayShift(int[] a, int k){
        if(k == 0){
            return a;
        }
        else {
            int[] end = {a[a.length-1]};
            int [] heads = Arrays.copyOfRange(a,0,a.length-1);
            System.arraycopy(end, 0, a, 0, end.length);
            System.arraycopy(heads, 0, a, end.length, heads.length);
            return intArrayShift(a,k-1);
        }
    }

    public static int[] intArrayShiftArrayList(int[] a, int k){
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++)
        {
            intList.add(a[i]);
        }
        for(int i = 0; i < k; i ++){
            int tail = intList.get(intList.size()-1);
            intList.remove(intList.size()-1);
            intList.add(0,tail);
        }
        return intList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int [] param = new int[3];
        for(int i = 0; i < param.length; i++){
            param[i] = in.nextInt();
        }
        int [] array = new int[param[0]];
        for(int i = 0; i< array.length; i++){
            array[i] = in.nextInt();
        }

        int [] shifted = intArrayShiftArrayList(array, param[1]);

        int [] queries = new int[param[2]];
        for(int i =0; i<queries.length; i++){
            System.out.println(shifted[in.nextInt()]);
        }
    }
}
