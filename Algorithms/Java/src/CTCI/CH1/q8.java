package CTCI.CH1;

import java.util.HashMap;
import java.util.Map;

import static common.matrixUtils.generateIntMatrix;
import static common.matrixUtils.printMatrix;

public class q8 {

    public static void main(String[] args){
        int[][] inital = generateIntMatrix(4, 4);
        printMatrix(inital);
        printMatrix(checkArray(inital));
    }

    private static int[][] checkArray(int[][] input){
        Map<Integer, Boolean> xList = new HashMap<>();
        Map<Integer, Boolean> yList = new HashMap<>();
        for(int x = 0; x < input.length; x++){
            if(xList.get(x) == null){
                for(int y = 0; y < input[0].length; y++){
                    if(yList.get(y) == null){
                        if(input[x][y] == 0){
                            xList.put(x,true);
                            yList.put(y,true);
                        }
                    }
                }
            }
        }

        for(int key: xList.keySet()){
            for(int y = 0; y < input[0].length; y++){
                input[key][y] = 0;
            }
        }

        for(int key: yList.keySet()){
            for(int x = 0; x < input.length; x++){
                input[x][key] = 0;
            }
        }
        return input;
    }
}
