package search;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumPair {

    static void minAbsSumPair(int arr[])
    {
        int arr_size = arr.length;
        int l, r, min_sum, sum, min_l, min_r;

        /* Initialization of values */
        min_l = 0;
        min_r = 1;
        min_sum = arr[0] + arr[1];

        for(l = 0; l < arr_size - 1; l++)
        {
            for(r = l+1; r < arr_size; r++)
            {
                sum = arr[l] + arr[r];
                if(Math.abs(min_sum) > Math.abs(sum))
                {
                    min_sum = sum;
                    min_l = l;
                    min_r = r;
                }
            }
        }

        System.out.println(" The two elements whose "+
                "sum is minimum are "+
                arr[min_l]+ " and "+arr[min_r]);
    }


    public static void main (String[] args)
    {
        int arr[] = {1, 60, -10, 70, -80, 85};
        minAbsSumPair(arr);

    }

}
