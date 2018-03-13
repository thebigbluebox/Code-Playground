package CTCI.CH1;

public class q2 {
    public static void main(String[] args) {
        System.out.println(isPermute("BAC","CAB"));
    }

    /**
     * Returns whether or not A is a permutation of B
     * @param a First String
     * @param b Second String
     * @return boolean of whether or not the Strings are a permuation of eachother
     */
    private static Boolean isPermute(String a, String b){
        int lengthA = a.length();
        int lengthB = b.length();

        if(lengthA == lengthB){
            int i;
            for(i = 0; i < lengthA; i++){
                int index = b.indexOf(a.charAt(i));
                if(index == -1){
                    return false;
                } else {
                    if(b.length() > 1){
                        StringBuilder sb = new StringBuilder(b);
                        sb.deleteCharAt(index);
                        b = sb.toString();
                    }
                }
            }
            return true;
        }
        return false;
    }
}
