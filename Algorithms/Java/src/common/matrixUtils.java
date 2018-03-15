package common;

import java.util.Random;

public class matrixUtils {
    public static int[][] generateIntMatrix(int x, int y){
        int [][] result = new int[x][y];

        Random rand = new Random();
        for(int i = 0; i < x; i ++){
            for(int j = 0; j < y; j++){
                if(i == 0 && j == 0){
                    result[i][j] = 100;
                }
                else if(i == (x-1) && j == 0){
                    result[i][j] = 200;
                }
                else if(i == 0 && j == (y-1)){
                    result[i][j] = 300;
                }
                else if(i == (x-1) && j == (y-1)){
                    result[i][j] = 400;
                }
                else{
                    result[i][j] = rand.nextInt(99);
                }
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
        printMatrix(generateIntMatrix(6,6));
    }
}
