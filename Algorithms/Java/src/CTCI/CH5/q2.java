package CTCI.CH5;

import dataStrucs.BinaryUtils;

public class q2 {
    public static String doubleToBinary(double i){
        if(i > 1 || i < 0){
            return "Out of Range";
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        double copy = i;
        while (count < 12){
            double temp = copy*2;
            if(temp >= 1){
                sb.append("1");
            } else {
                sb.append("0");
            }
            copy = copy*10 - Math.floor(copy*10);
            count ++;
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.print(doubleToBinary(0.256));
    }
}

