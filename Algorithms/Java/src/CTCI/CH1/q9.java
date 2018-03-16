package CTCI.CH1;

public class q9 {

    public static void main (String[] args) throws Exception {
        System.out.println(checkStringRotation("waterbottle","erboztlewat"));
    }

    /**
     *  This checks for the string rotation through a O(N) iteration
     *  It checks from the rear first, then double checks that the word
     *  is fully spelt out
     * @param a
     * @param b
     * @return
     * @throws Exception
     */
    public static boolean checkStringRotation(String a, String b) throws Exception{
        if(a.length() != b.length()){
            throw new Exception("Strength length does not match");
        }

        try{
            StringBuilder sbA = new StringBuilder();
            StringBuilder sbB = new StringBuilder();
            int savedOffset = 0;
            for(int index = 0; index < a.length(); index++){
                sbA.append(a.charAt(index));
                sbB.insert(0,b.charAt(b.length() - 1 - index));
                if(sbA.toString().equals(sbB.toString())){
                    savedOffset = index;
                    break;
                }
            }
            for(int index = 0; index < a.length()-savedOffset; index++){
                sbB.append(b.charAt(index));
                sbA.append(a.charAt(index + savedOffset + 1));
                if(sbA.toString().equals(sbB.toString())){
                    if(savedOffset + index + 2 == b.length()){
                        return true;
                    }
                }
            }
        }
        catch(StringIndexOutOfBoundsException e){
            return false;
        }
        return false;
    }
}
