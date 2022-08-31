package strings;

public class Util {
    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {
        // Write your code here
        int count = 0;

        if(s.length()==1) return count;
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i)== s.charAt(i-1)){
                count++;
            }
        }

        return count;
    }
}

