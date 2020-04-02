package CodewarsSolutions.kata6;

/*
Given a lowercase string that has alphabetic characters only and no spaces, return the highest value of consonant substrings.
Consonants are any letters of the alphabet except "aeiou".

We shall assign the following values: a = 1, b = 2, c = 3, .... z = 26.

For example, for the word "zodiacs", let's cross out the vowels. We get: "z o d ia cs"

-- The consonant substrings are: "z", "d" and "cs" and the values are z = 26, d = 4 and cs = 3 + 19 = 22. The highest is 26.
solve("zodiacs") = 26

For the word "strength", solve("strength") = 57
-- The consonant substrings are: "str" and "ngth" with values "str" = 19 + 20 + 18 = 57 and "ngth" = 14 + 7 + 20 + 8 = 49.
The highest is 57.
For C: do not mutate input.

More examples in test cases. Good luck!
 */

import java.util.Arrays;
import java.util.List;

public class ConsonantValue {
    public static int solve(final String s) {

        int sum = 0, max = 0;

        String str = s.replaceAll("[aeiou]", " ")
                      .replaceAll(" +", " ");
        List<String> substrings = Arrays.asList(str.split(" "));

        for(int i = 0; i < substrings.size(); i++) {
            for(int j = 0; j < substrings.get(i).length(); j++) {
                sum += (int)substrings.get(i).charAt(j) - 96;
            }
            if(sum > max) {
                max = sum;
            }
            sum = 0;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(solve("zodiacs"));
        System.out.println(solve("strength"));
        System.out.println(solve("perpetuity"));
        System.out.println(solve("catchphrase"));
        System.out.println(solve("twelfthstreet"));
        System.out.println(solve("gravitas"));
    }
}
