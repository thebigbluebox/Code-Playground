package CTCI.CH5;

public class q6 {
    public static int conversion(int a, int b){
        int result = a^b;
        int count = 0;
        while(result > 0){
            if((result&1) == 1){
                count ++;
            }
            result>>>=1;
        }
        return count;
    }
}
