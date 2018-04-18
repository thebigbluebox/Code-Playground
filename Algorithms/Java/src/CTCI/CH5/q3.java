package CTCI.CH5;

// Solution from the back of book, first solution was not working out

public class q3 {
    public static int flipBitToWin(int a){
        int currentLength = 0;
        int previousLength = 0;
        int maxLength = 1;
        while(a != 0){
            if((a & 1) == 1){
                currentLength++;
            } else if ((a & 1) == 0){
                //next line with a&2 actually checks the second place 10 bit
                //if next bit is 0 then zero else we set previousLength = currentlength
                previousLength = (a & 2) == 0 ? 0 : currentLength;
                currentLength = 0;
            }
            maxLength = Math.max(previousLength + currentLength + 1, maxLength);
            a >>>= 1;
        }
        return maxLength;
    }

    public static void main(String[] args){
        System.out.print(flipBitToWin(0b1101111010101));
    }
}
