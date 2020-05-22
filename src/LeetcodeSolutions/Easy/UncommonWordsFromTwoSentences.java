package LeetcodeSolutions.Easy;

/*
884. Uncommon Words from Two Sentences
Link: https://leetcode.com/problems/uncommon-words-from-two-sentences/
Topics: Hash Table
 */

import java.util.*;

public class UncommonWordsFromTwoSentences {

    public static String[] uncommonFromSentences(String A, String B) {
        String[] wordsA = A.split(" ");
        String[] wordsB = B.split(" ");
        Map<String, Integer> mapA = new HashMap<>();
        Map<String, Integer> mapB = new HashMap<>();

        for(String s : wordsA) {
            if(!mapA.containsKey(s)) {
                mapA.put(s, 1);
            } else {
                mapA.put(s, mapA.get(s) + 1);
            }
        }

        for(String s : wordsB) {
            if(!mapB.containsKey(s)) {
                mapB.put(s, 1);
            } else {
                mapB.put(s, mapB.get(s) + 1);
            }
        }


        for(Map.Entry<String, Integer> entry : mapA.entrySet()) {
            if(mapB.containsKey(entry.getKey())) {
                mapB.remove(entry.getKey());
            } else {
                mapB.put(entry.getKey(), entry.getValue());
            }
        }


        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : mapB.entrySet()) {
            if(entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }


        return result.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
        System.out.println(Arrays.toString(uncommonFromSentences("apple apple", "banana")));
    }
}
