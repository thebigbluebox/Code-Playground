package dataStrucs;

import java.util.ArrayList;
import java.util.List;

public class BinaryUtils {
    public static boolean getBit(int num, int i){
        return ((num & (1 << i)) != 0);
    }

    public static int setBit(int num, int i){
        return num | (1<<i);
    }

    public static int clearBit(int num, int i){
        int mask = ~(1 << i);
        return mask & num;
    }

    public static int clearBitsMSBthroughI(int num, int i){
        int mask = (1<<i) - 1;
        return mask & num;
    }

    public static int clearBitsLSBthroughI(int num, int i){
        int mask = (-1<< (i+1));
        return num & mask;
    }

    public static int updateBit(int num, int i, boolean bits){
        int value = bits? 1: 0;
        int mask = (1 << i);
        return (num & mask) | (value << i);
    }

    public static int countBits(int num){
        int count = 0;
        while (num > 0) {
            count++;
            num = num >> 1;
        }
        return count;
    }

    public static List<Integer> getLocationOfSetBits(int num){
        List<Integer> result = new ArrayList<>();
        int count = 0;
        int inverted = num & 0;
        while(num > 0){
            if(getBit(inverted, 0)){
                result.add(count);
            }
            count++;
            num = num >> 1;
        }
        return result;
    }
}
