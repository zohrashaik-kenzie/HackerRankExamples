package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctElements {

    /**
     * Given a list of integers, find the number of distinct elements in every subset of size k.
     *
     * Example:
     *   input = [1, 3, 4, 2, 2, 5, 2]
     *   k = 3
     *
     *   result = [3, 3, 2, 2, 2]
     *
     * @param input - the list of integers from which to identify the distinct counts, size >= k
     * @param k - the size of sublists that should be considered when calculating the distinct counts, k >= 1
     * @return a list of distinct counts ordered by the sublist they relate to - the count of distinct
     *         elements for the sublist with items 0, 1, 2 should be first in the list followed by the
     *         count for items 1, 2, 3
     */
    public static List<Integer> countDistinctElements(List<Integer> input, int k) {
        Map<Integer, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < k; i++) {
            int charCount = charCounts.getOrDefault(input.get(i), 0) + 1;
            charCounts.put(input.get(i), charCount);
        }

        List<Integer> counts = new ArrayList<>();
        counts.add(charCounts.keySet().size());

        for (int right = k; right < input.size(); right++) {
            int charCount  = charCounts.get(input.get(right - k)) - 1;
            if (charCount == 0) {
                charCounts.remove(input.get(right - k));
            } else {
                charCounts.put(input.get(right - k), charCount);
            }
            charCount = charCounts.getOrDefault(input.get(right), 0) + 1;
            charCounts.put(input.get(right), charCount);

            counts.add(charCounts.keySet().size());
        }

        return counts;
    }

}

