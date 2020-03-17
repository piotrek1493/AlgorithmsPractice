package HackerrankSolutions.Easy;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/two-strings/problem
 */

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    static String twoStrings(String s1, String s2) {

        Set<Character> s1Set = new HashSet<>();
        Set<Character> s2Set = new HashSet<>();

        for(int i = 0; i < s1.length(); i++) {
            s1Set.add(s1.charAt(i));
        }

        for(int i = 0; i < s2.length(); i++) {
            s2Set.add(s2.charAt(i));
        }

        s1Set.retainAll(s2Set);

        if(s1Set.size() > 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {

        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hi", "world"));

    }
}
