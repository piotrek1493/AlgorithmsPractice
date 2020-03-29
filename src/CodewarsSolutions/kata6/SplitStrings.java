package CodewarsSolutions.kata6;

/*
Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number
of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

StringSplit.solution("abc") // should return {"ab", "c_"}
StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStrings {
    public static String[] solution(String s) {

        if(s.length() % 2 != 0) {
            s += "_";
        }

        List<String> result = new ArrayList<>();

        for(int i = 0; i < s.length(); i+=2) {
            result.add(s.substring(i, i + 2));
        }

        return result.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc")));
        System.out.println(Arrays.toString(solution("abcdef")));
        System.out.println(Arrays.toString(solution("")));
    }
}
