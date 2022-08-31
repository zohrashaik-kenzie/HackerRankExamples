package stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.stream.IntStream;

public class BalancedBrackets {

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }

            boolean balanced = (c == ')' && stack.peek() == '(') ||
                    (c == ']' && stack.peek() == '[') ||
                    (c == '}' && stack.peek() == '{');

            if (!balanced)
                return "NO";

            stack.pop();
        }
        return "YES";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            String s = null;
                try {
                    s = bufferedReader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                String result =isBalanced(s);
                System.out.println("Result = " + result);

        });

            bufferedReader.close();
      }
}
