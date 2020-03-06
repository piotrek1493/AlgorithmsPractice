package CodewarsSolutions.kata6;

/*
A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence
"The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */

import java.util.List;
import java.util.stream.Collectors;

public class DetectPangram {
    public static boolean check(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        sentence = sentence.toLowerCase().replaceAll(" ", "");
        List<Character> list = sentence.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        if(list.containsAll(alphabet.chars().mapToObj(c -> (char)c).collect(Collectors.toList()))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String test1 = "The quick brown fox jumps over the lazy dog";
        String test2 = "You shall not pass!";
        System.out.println(check(test1));
        System.out.println(check(test2));

    }
}
