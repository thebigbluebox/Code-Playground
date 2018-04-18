package CTCI.CH5;

public class q7 {
    public static int pairwiseSwap(int x) {
        return ((x & 0xaaaaaaaa) >>> 1 | ((x & 0x55555555) << 1));
    }
}
