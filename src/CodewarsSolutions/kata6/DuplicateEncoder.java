package CodewarsSolutions.kata6;

/*
The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that
character appears only once in the original string, or ")" if that character appears more than once in the original string.
Ignore capitalization when determining if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("
Notes

Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX",
the "XXX" is the expected result, not the input!
 */

import java.util.*;

public class DuplicateEncoder {
    static String encode(String word) {

        StringBuilder result = new StringBuilder();
        word = word.toLowerCase();

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : word.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (int i = 0; i < word.length(); i++) {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (word.charAt(i) == entry.getKey()) {
                    if (entry.getValue() == 1) {
                        result.append("(");
                    } else {
                        result.append(")");
                    }
                    break;
                }
            }
        }


        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("kot"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));
        System.out.println(encode("(( @"));
    }
}
