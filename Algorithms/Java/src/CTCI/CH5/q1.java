package CTCI.CH5;
import dataStrucs.BinaryUtils;

public class q1 {
    public static int insertBin(int N, int M, int i, int j){
        int allOnes = ~0;
        int left = allOnes << (j + 1);
        int right = ((1 << j) -1);
        int mask = left | right;
        int n_cleared = N & mask;
        int m_shifted = M << i;

        return n_cleared | m_shifted;
    }

    public static void main(String[] args){
        int result = insertBin(0b10000000000,0b10011,2,6);
        BinaryUtils.clearBitsLSBthroughI(0b100101101,5);
    }
}
