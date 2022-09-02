package backtrack;

import java.util.Arrays;
import java.util.List;

public class BreakWords {


    static void wordBreakRecursion(int n, String s, List<String> dict)
    {
        for(int i = 1; i <= n; i++)
        {

            // Extract substring from 0 to i in prefix
            String prefix=s.substring(0, i);

            // If dictionary contains this prefix, then
            // we check for remaining string. Otherwise
            // we ignore this prefix (there is no else for
            // this if) and try next
            if(dict.contains(prefix))
            {
                // If no more elements are there, print it
                if(i == n)
                {
                    // Add this element to previous prefix
                    System.out.println(prefix);
                    return;
                }
                System.out.println(prefix);

                wordBreakRecursion(n - i, s.substring(i,n), dict);
            }
        }
    }

    // main function
    public static void main(String args[])
    {
        String str = "indeed"; // for first test case
        int n = str.length();                 // length of first string

        // List of strings in dictionary
        List <String> dict= Arrays.asList("in", "deed","indeed");

        System.out.println("First Test:");

        // call to the method
        wordBreakRecursion(n,str,dict);

    }
}
