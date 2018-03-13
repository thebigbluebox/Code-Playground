package common;

import java.util.Random;

public class matrixUtils {
    public static int[][] generateIntMatrix(int x, int y){
        int [][] result = new int[x][y];

        Random rand = new Random();
        for(int i = 0; i < x; i ++){
            for(int j = 0; j < y; j++){
                result[i][j] = rand.nextInt();
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix){
        for(int y = 0; y < matrix[0].length; y ++){
            for(int x = 0; x < matrix.length; x++){
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        printMatrix(generateIntMatrix(4,5));
    }
}
