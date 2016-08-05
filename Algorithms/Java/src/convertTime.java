import java.util.Scanner;

/**
 * Created by TaiRui on 2016-07-31.
 */
public class convertTime {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String input = in.next();
        boolean pm = false;
        if(input.contains("PM")){
            pm = true;
        }
        input = input.substring(0,input.length()-2);
        String[] time = input.split(":");
        if(pm){
            if(!time[0].equals("12")) {
                int hour = Integer.parseInt(time[0]) + 12;
                if (hour == 24) {
                    time[0] = "00";
                } else {
                    time[0] = String.valueOf(hour);
                }
            }
        }
        if((!pm) && time[0].equals("12")){
            time[0] = "00";
        }
        System.out.println(time[0] + ":" + time[1] + ":" + time[2]);
    }
}
