package hashmap;

import java.util.HashMap;
import java.util.Map;

public class CommonSubString {
    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Map<Character,Integer> frequencyMap1 = createFrequencyMap(s1);
        Map<Character,Integer> frequencyMap2 = createFrequencyMap(s2);
        for (Map.Entry<Character,Integer> mapElement : frequencyMap1.entrySet()) {
            Character key = mapElement.getKey();
            if(frequencyMap2.containsKey(key)){
                return "YES";
            }
        }
        return "NO";
    }

    private static Map<Character,Integer> createFrequencyMap(String s){
        Map<Character,Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer val = frequencyMap.get(c);
            if (val != null) {
                frequencyMap.put(c, new Integer(val + 1));
            }
            else {
                frequencyMap.put(c, 1);
            }
        }

        return frequencyMap;
    }

    public static void main(String[] args){
        System.out.println(twoStrings("and","exes"));
    }
}
