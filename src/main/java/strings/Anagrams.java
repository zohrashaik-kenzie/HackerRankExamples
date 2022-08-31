package strings;

public class Anagrams {
    public static int numberNeeded(String first, String second) {

        int[] letterCounts = new int[26];
        for(char c: first.toCharArray())
            letterCounts[c - 'a']++;

        for(char c: second.toCharArray())
            letterCounts[c - 'a']--;

        int result = 0;
        for(int i : letterCounts){
            result += Math.abs(i);
        }
        return result;


    }

    public static void main(String[] args){
        System.out.println(numberNeeded("cdeabcxyz","dcfabcuvwxys"));
    }
}
