package strings;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SherlockString {

    private static boolean isValid(String a){

        Map<String,Integer> frequencyMapA = createFrequencyMap(a);
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<String,Integer> mapElement : frequencyMapA.entrySet()) {
            String key = mapElement.getKey();
            set.add(mapElement.getValue());
        }

        if (set.size() == 1)
            return true;
        else if(set.size() == 2){
            Integer[] values = set.toArray(new Integer[set.size()]);
            if (Math.abs(values[0] - values[1]) <= 1)
                return true;
        }

        return false;
    }

    private static Map<String,Integer> createFrequencyMap(String s){
        Map<String,Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer val = frequencyMap.get(c+"");
            if (val != null) {
                frequencyMap.put(c+"", new Integer(val + 1));
            }
            else {
                frequencyMap.put(c+"", 1);
            }
        }

        return frequencyMap;
    }

    public static void main(String[] args){
        System.out.println(isValid("abcdefghhgfedecba"));
    }
}
