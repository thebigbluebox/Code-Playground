package CTCI.CH1;

public class q3 {
    public static void main(String[] args) {
        System.out.println(urlify("Mr John Smith    ", 13));
    }

    /**
     * Input will result in the replacement of all spaces into %20
     *
     * @param input  string to be inputed, with the neccessary spaces trailing
     * @param length the length of the true string
     * @return a string with all the spaces replaced
     */
    private static String urlify(String input, int length) {
        int spaces = 0;
        boolean spaceCount = true;
        StringBuilder sb = new StringBuilder(input);
        int i;
        for (i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ' && spaceCount) {
                spaces++;
            } else {
                if (spaceCount) {
                    spaceCount = false;
                }
                char current = input.charAt(i);
                if (current != ' ') {
                    sb.deleteCharAt(i + spaces);
                    sb.insert(i + spaces, current);
                    sb.length();
                } else {
                    sb.deleteCharAt(i + spaces);
                    sb.insert(i + spaces, '0');
                    sb.deleteCharAt(i + spaces - 1);
                    sb.insert(i + spaces - 1, '2');
                    sb.deleteCharAt(i + spaces - 2);
                    sb.insert(i + spaces - 2, '%');
                    spaces -= 2;
                }
            }
        }
        return sb.toString();
    }
}
