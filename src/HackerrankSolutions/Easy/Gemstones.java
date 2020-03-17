package HackerrankSolutions.Easy;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/gem-stones/problem
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class Gemstones {
    static int gemstones(String[] arr) {
        int[] a = new int[26];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String s1 = arr[i];
            Set<Character> s2 = new LinkedHashSet<>();
            for (int j = 0; j < s1.length(); j++) {
                s2.add(s1.charAt(j));
            }
            StringBuffer s3 = new StringBuffer();
            for (Character ch : s2) {
                s3.append(ch);
            }
            for (int j = 0; j < s3.length(); j++) {
                a[s3.charAt(j) - 'a'] += 1;
            }

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == arr.length) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(gemstones(new String[]{"abcdde",
                "baccd",
                "eeabg"}));
    }

}
