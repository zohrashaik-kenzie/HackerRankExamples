package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MinAbsVal {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.size()-1;i++){
            min = Math.min(min,Math.abs(arr.get(i)- arr.get(i+1)));
        }
        return min;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = minimumAbsoluteDifference(arr);
        System.out.println("Result = " + result);
        bufferedReader.close();
      }
}

