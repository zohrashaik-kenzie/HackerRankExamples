package hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Magazine {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
       if(magazine.containsAll(note)){
           System.out.println("Yes");
       } else {
           System.out.println("No");
       }

    }

    public static void checkMagazine2(List<String> magazine, List<String> note) {
        // Write your code here

        HashMap<String, Integer> magazineHash = generateFrequencyMap(magazine);
        HashMap<String, Integer> noteHash = generateFrequencyMap(note);

        for (Map.Entry<String, Integer> mapElement : noteHash.entrySet()) {
            String key = mapElement.getKey();
            if (!magazineHash.containsKey(key)){
                System.out.println("No");
                return;
            }
            else {
                int value = mapElement.getValue();
                int magazine_value = magazineHash.get(key);
                if (value > magazine_value){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");

    }
    private static HashMap<String,Integer> generateFrequencyMap(List<String> list){
        HashMap<String,Integer> hash = new HashMap<>();

        for(String word: list){
            if (hash.containsKey(word)){
                int frequency = hash.get(word);
                hash.put(word, ++frequency);
            } else {
                hash.put(word,1);
            }
        }

        return hash;
    }

}


