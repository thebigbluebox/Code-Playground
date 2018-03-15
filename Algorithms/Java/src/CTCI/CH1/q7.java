package CTCI.CH1;

import static common.matrixUtils.generateIntMatrix;
import static common.matrixUtils.printMatrix;

public class q7 {

    public static void main(String[] args) {
        int[][] inital = generateIntMatrix(7, 7);
        printMatrix(inital);
        printMatrix(rotateLayer(inital));
    }

    /**
     * Assuming this matrix is square this is the concept answer
     *
     * @param input
     * @return
     */
    public static int[][] rotateMatrix(int[][] input) {
        int xLength = input.length;
        int yLength = input[0].length;

        int tempCarry;

        tempCarry = input[0][0];

        int layers = 0;
        if (input.length <= 3) {
            layers = 1;
        } else {
            layers = xLength / 2;
        }
        for (int lvl = 0; lvl < layers; lvl++) {

            //The actual shifting

        }


        int n = input.length;

        for (int y = 0; y < 3; y++) {
            int carry = input[0][0];

            for (int i = 0; i < n; i++) {
                int current = input[0][i];
                input[0][i] = carry;
                carry = current;
//                System.out.print(input[0][i] + " ");
            }

            for (int i = 1; i < n; i++) {
                int current = input[i][n - 1];
                input[i][n - 1] = carry;
                carry = current;
//                System.out.println(current);
            }

            for (int i = n - 2; i >= 0; i--) {
                int current = input[n - 1][i];
                input[n - 1][i] = carry;
                carry = current;
//                System.out.print(input[n - 1][i] + " ");
            }

            for (int i = n - 2; i >= 0; i--) {
                int current = input[i][0];
                input[i][0] = carry;
                carry = current;
//                System.out.print(input[i][0] + " ");
            }
        }
// Layer 2
        for (int y = 0; y < 1; y++) {
            int carry = input[1][1];

            for (int i = 1; i < n - 2; i++) {
                int current = input[1][i];
                input[1][i] = carry;
                carry = current;
//                System.out.print(input[0][i] + " ");
            }

            for (int i = 1; i < n - 2; i++) {
                int current = input[i][n - 2];
                input[i][n - 2] = carry;
                carry = current;
            }

            for (int i = n - 2; i >= 1; i--) {
                int current = input[n - 2][i];
                input[n - 2][i] = carry;
                carry = current;
//                System.out.print(input[n - 1][i] + " ");
            }

            for (int i = n - 3; i >= 1; i--) {
                int current = input[i][1];
                input[i][1] = carry;
                carry = current;
//                System.out.print(input[i][0] + " ");
            }
        }
        //00 01 02 03 04
        //10 11 12 13 14
        //20 21 22 23 24
        //30 31 32 33 34
        //40 41 42 43 44

        //40 30 20 10 00
        //41 31 21 11 01
        //42 32 22 12 02
        //43 33 23 13 03
        //44 34 24 13 04

        //2x2 one layer 1
        //3x3 one layer 2
        //4x4 2 layer 3
        //5x5 2 layer
        //6x6 3 layer
        //7x7 3 layer
        return input;
    }

    /**
     * This is the scaled question
     * This actually rotates each layer by the length of the matrix
     * And moves in as a square matrix is like an onion.
     * @param input
     * @return matrix
     */
    public static int[][] rotateLayer(int[][] input) {
        int n = input.length;
        System.out.println("Side length " + n);
        int layers = input.length / 2;
        System.out.println("Layers " + layers);
        for (int lvl = 0; lvl < layers; lvl++) {
            // sidelength - 1 - current level = how many to move to get to right spot 90 degree rotation
            for (int y = 0; y < n - 1 - 2*lvl; y++) {
                int carry = input[lvl][lvl];

                for (int i = lvl; i < n - 2*lvl; i++) {
                    int current = input[lvl][i];
                    input[lvl][i] = carry;
                    carry = current;
//                    System.out.print(input[0][i] + " ");
                }

                for (int i = 1; i < n - 2*lvl; i++) {
                    int current = input[i][n - 1 - lvl];
                    input[i][n - 1 - lvl] = carry;
                    carry = current;
                }

                for (int i = n - 2; i >= lvl; i--) {
                    int current = input[n - 1 - lvl][i];
                    input[n - 1 - lvl][i] = carry;
                    carry = current;
//                    System.out.print(input[n - 1 - lvl][i] + " ");
                }

                for (int i = n - 2 - lvl; i >= lvl; i--) {
                    int current = input[i][lvl];
                    input[i][lvl] = carry;
                    carry = current;
//                    System.out.print(input[i][0] + " ");
                }
            }
        }


        return input;
    }
}
