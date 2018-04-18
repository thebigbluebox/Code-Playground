package CTCI.CH5;

public class q8 {
    public static void drawLine(byte[] screen, int width, int x1, int x2, int y){
        byte currentline = screen[y];
        int count = 0;
        while(currentline > 0){
            if(count >= x1 && count <= x2)
                currentline |= 1;
            currentline >>= 1;
            count ++;
        }
    }
}
