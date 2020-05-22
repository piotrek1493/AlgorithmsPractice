package LeetcodeSolutions.Easy;

/*
1417. Reformat The String
Link: https://leetcode.com/problems/reformat-the-string/
Topics: String
 */

import java.util.List;
import java.util.stream.Collectors;

public class ReformatTheString {
    public static String reformat(String s) {
        List<Character> digits = s.chars()
                .mapToObj(c -> (char)c)
                .filter(Character::isDigit)
                .collect(Collectors.toList());

        List<Character> letters = s.chars()
                .mapToObj(c -> (char)c)
                .filter(Character::isAlphabetic)
                .collect(Collectors.toList());

        StringBuilder result = new StringBuilder();

        if(Math.abs(digits.size() - letters.size()) > 1) {
            return result.toString();
        }

        if(digits.size() > letters.size()) {
            for(int i = 0; i < letters.size(); i++) {
                result.append(digits.get(i)).append(letters.get(i));
            }
            result.append(digits.get(digits.size() - 1));
        } else if(letters.size() > digits.size()) {
            for(int i = 0; i < digits.size(); i++) {
                result.append(letters.get(i)).append(digits.get(i));
            }
            result.append(letters.get(letters.size() - 1));
        } else {
            for(int i = 0; i < digits.size(); i++) {
                result.append(letters.get(i)).append(digits.get(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reformat("a0b1c2"));
        System.out.println(reformat("leetcode"));
        System.out.println(reformat("1229857369"));
        System.out.println(reformat("covid2019"));
        System.out.println(reformat("ab123"));
    }
}
