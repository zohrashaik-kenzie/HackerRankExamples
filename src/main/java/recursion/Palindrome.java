package recursion;

public class Palindrome {

    static boolean isPalindromeRecursive(String str)
    {

        int str_length = str.length();
        if (str_length == 0 || str_length == 1){
            return true;
        }
        char start_char = str.charAt(0);
        char end_char = str.charAt(str_length - 1);

        if(start_char != end_char)
            return false;

        return isPalindromeRecursive(str.substring(1,str_length-1));

    }

    public static void main(String args[])
    {
        String str = "racecar";

        if (isPalindromeRecursive(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
