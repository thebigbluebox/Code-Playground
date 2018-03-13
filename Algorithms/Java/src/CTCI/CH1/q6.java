package CTCI.CH1;

public class q6 {
    public static void main(String[] args) {
        System.out.println(stringCompression("aaabbbcccccdba"));
        System.out.println(stringCompression("abc"));
    }

    /**
     * This compresses the string into
     * @param input String to compress
     * @return The compressed string
     */
    private static String stringCompression(String input){
        int i, j = 0;
        Character current;
        StringBuilder sb = new StringBuilder();
        for(i = 0; i < input.length(); i++){
            if(i+1 < input.length() && input.charAt(i) == input.charAt(i+1)){
                j+=1;
            } else {
                j+=1;
                current = input.charAt(i);
                if(j > 1)
                    sb.append(j).append(current.toString());
                else
                    sb.append(current.toString());
                j = 0;
            }
        }
        return sb.toString();
    }
}
