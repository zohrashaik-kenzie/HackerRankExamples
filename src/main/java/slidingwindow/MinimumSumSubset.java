package slidingwindow;

import java.util.List;

public class MinimumSumSubset {

    /**
     * Given a list of integers, find the contiguous sublist of given length k that has the minimum sum value.
     * Return the minimum sum value.
     *
     * Example:
     *   input = [1, 3, 4, 2, 8, 5, 3]
     *   k = 3
     *
     *   result = 8
     *
     * @param input - the list of integers from which to identify the minimum sum value, size >= k
     * @param k - the size of sublists that should be considered when calculating the minimum sum value, k >= 1
     * @return the lowest sum value of all sums calculated for each contiguous sublist
     */
    public static int findMinimumSum(List<Integer> input, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += input.get(i);
        }

        int minSum = windowSum;
        for (int right = k; right < input.size(); right++) {
            windowSum -= input.get(right - k);
            windowSum += input.get(right);

            minSum = Math.min(minSum, windowSum);
        }

        return minSum;
    }

}
