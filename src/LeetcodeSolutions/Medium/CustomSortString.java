package LeetcodeSolutions.Medium;

/*
791. Custom Sort String
Link: https://leetcode.com/problems/custom-sort-string/
Topics: String
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class CustomSortString {
    public static String customSortString(String S, String T) {

        Map<Character, Integer> mapS = new LinkedHashMap<>();
        Map<Character, Integer> mapT = new LinkedHashMap<>();

        for(char c : S.toCharArray()) {
            if(!mapS.containsKey(c)) {
                mapS.put(c, 1);
            } else {
                mapS.put(c, mapS.get(c) + 1);
            }
        }

        for(char c : T.toCharArray()) {
            if(!mapT.containsKey(c)) {
                mapT.put(c, 1);
            } else {
                mapT.put(c, mapT.get(c) + 1);
            }
        }

        StringBuilder result = new StringBuilder();

        for(Map.Entry<Character, Integer> entry : mapS.entrySet()) {
            if(mapT.containsKey(entry.getKey())) {
                while (mapT.get(entry.getKey()) != 0) {
                    result.append(entry.getKey());
                    mapT.put(entry.getKey(), mapT.get(entry.getKey()) - 1);
                }
            }
        }

        for(Map.Entry<Character, Integer> entry : mapT.entrySet()) {
            for(int i = 0; i < entry.getValue(); i++) {
                result.append(entry.getKey());
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(customSortString("cba", "abcd"));
        System.out.println(customSortString("kqep", "pekeq"));
        System.out.println(customSortString("cbafg", "abcd"));
    }
}
