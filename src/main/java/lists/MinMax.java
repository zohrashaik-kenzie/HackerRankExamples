package lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMax {
    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);
        int unfairness = Integer.MAX_VALUE;
        int len = arr.size();
        for (int i = 0; i < len - k + 1; i++) {
            int max = arr.get(i+k-1);
            int min = arr.get(i);
            int total = max - min;
            if(total < unfairness) {
                unfairness = total;
            }
        }
        return unfairness;
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,4,7,2);
        System.out.println("Min Unfairness = " + maxMin(2,list));

        List<Integer> list2 = Arrays.asList(10,100,101,102,1000,20,30);
       System.out.println("Min Unfairness = " + maxMin(3,list2));

    }
}
