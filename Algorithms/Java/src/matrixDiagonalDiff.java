import java.util.Scanner;

/**
 * Created by TaiRui on 2016-07-31.
 */
public class matrixDiagonalDiff {

    public static int diagonalSum (int[][] a, boolean direction){
        if(a.length == a[0].length){
            int length = a.length;
            int sum = 0;
            for(int i = 0; i < length; i++) {
                if(direction){sum = sum + a[i][i];}
                else{ sum = sum + a[a.length-1-i][i];}
            }
            return sum;
        }
        return -99999;
    }

    public static void printMatrix(int [][]a){
        for(int i = 0; i < a.length; i++){
            for(int i2 = 0; i2 < a[0].length; i2++){
                System.out.print(a[i][i2]);
                if(i2+1 == a.length){
                    System.out.print("\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int [][] a = new int[arraySize][arraySize];
        for(int i = 0; i < arraySize; i++){
            for(int i2 = 0; i2 < arraySize; i2++){
                a[i][i2]  = in.nextInt();
            }
        }
        printMatrix(a);
        int diag1 = diagonalSum(a, true);
        int diag2 = diagonalSum(a, false);
        int sum = Math.abs(diag1 - diag2);
        System.out.println(sum);
    }
}
