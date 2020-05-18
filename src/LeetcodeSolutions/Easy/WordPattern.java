package LeetcodeSolutions.Easy;

/*
290. Word Pattern
Link: https://leetcode.com/problems/word-pattern/
Topics: Hash Table
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        char[] chars = pattern.toCharArray();
        String[] words = str.split(" ");

        if(chars.length != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();

        for(int i = 0; i < chars.length; i++) {
            if(!map.containsKey(chars[i])) {
                map.put(chars[i], words[i]);
            }
        }

        if(map.values().size() != new HashSet<>(map.values()).size()) {
            return false;
        }


        for(int i = 0; i < chars.length; i++) {
            for(Map.Entry<Character, String> entry : map.entrySet()) {
                if(entry.getKey() == chars[i] && !entry.getValue().equals(words[i])) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));
        System.out.println(wordPattern("abcdeef", "stork cat deer bear anteater anteater mouse"));
    }
}
