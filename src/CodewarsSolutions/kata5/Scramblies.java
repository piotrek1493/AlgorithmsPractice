package CodewarsSolutions.kata5;

/*
Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged
to match str2, otherwise returns false.

Notes:

Only lower case letters will be used (a-z). No punctuation or digits will be included.
Performance needs to be considered
Input strings s1 and s2 are null terminated.
Examples
scramble('rkqodlw', 'world') ==> True
scramble('cedewaraaossoqqyt', 'codewars') ==> True
scramble('katas', 'steak') ==> False
 */

import java.util.List;
import java.util.stream.Collectors;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        String temp = "";
        List<Character> chars1 = str1.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        List<Character> chars2 = str2.chars().mapToObj(c -> (char)c).collect(Collectors.toList());

        for(int i = 0; i < chars2.size(); i++) {
            for(int j = 0; j < chars1.size(); j++) {
                if(chars1.get(j) == chars2.get(i)) {
                    temp += chars1.get(j);
                    chars1.remove(j);
                    break;
                }
            }
            if(temp.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw", "world"));
        System.out.println(scramble("cedewaraaossoqqyt", "codewars"));
        System.out.println(scramble("katas", "steak"));
        System.out.println(scramble("javscripts","javascript"));
        System.out.println(scramble("aabbcamaomsccdd","commas"));
        System.out.println(scramble("commas", "commas"));
        System.out.println(scramble("sammoc", "commas"));
    }
}
