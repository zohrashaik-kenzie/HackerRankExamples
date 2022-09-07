package greedy;

import java.util.*;

public class MinCoins {



    static List<Integer> findMin(List<Integer> coinsAvailable, int amount) {
        // Initialize result
        List<Integer> coinsNeeded = new ArrayList<>();

        // Traverse through all denomination
        for (int i = 0; i < coinsAvailable.size(); i++) {
            // Find denominations
            while (amount >= coinsAvailable.get(i)) {
                amount -= coinsAvailable.get(i);
                coinsNeeded.add(coinsAvailable.get(i));
            }
        }

       return coinsNeeded;
    }

    public static void main(String[] args)
    {
        List<Integer> coins = Arrays.asList(50,25,10,5,1);

        System.out.println("We would need: "  + findMin(coins,253) + " coins!");
    }
}
