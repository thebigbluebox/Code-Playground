import java.util.Scanner;

/**
 * Created by TaiRui on 2016-08-01.
 */
public class kangarooJump {

    public static boolean kangaroo(int a, int b, int c, int d) {
        for(int i = 0; i < 1000; i++){
            int sumA = b * i + a;
            int sumB = d * i + c;
            if(sumA == sumB){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        Boolean a = kangaroo(x1,v1,x2,v2);
        if(a){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
