package CodewarsSolutions.kata6;

/*
Complete the method so that it formats the words into a single comma separated value. The last word should be separated
by the word 'and' instead of a comma. The method takes in an array of strings and returns a single formatted string.
Empty string values should be ignored. Empty arrays or null/nil values being passed into the method should result in an
empty string being returned.

Kata.formatWords(new String[] {"ninja", "samurai", "ronin"}) => "ninja, samurai and ronin"
Kata.formatWords(new String[] {"ninja", "", "ronin"}) => "ninja and ronin"
Kata.formatWords(new String[] {}) => ""
 */

import java.util.Arrays;

public class FormatWordsIntoASentence {
    public static String formatWords(String[] words) {
        if(words == null) return "";
        words = Arrays.stream(words).
                filter(s -> (s != null && s.length() > 0))
                .toArray(String[]::new);
        if(words.length == 0) return "";
        String result = String.join(", ", words);
        return words.length > 1
                ? result.substring(0, result.length() - words[words.length - 1].length() - 2) + " and " + words[words.length - 1]
                : words[0];
    }

    public static void main(String[] args) {
        System.out.println(formatWords(new String[]{"ninja", "samurai", "ronin"}));
        System.out.println(formatWords(new String[]{}));
        System.out.println(formatWords(new String[]{"ninja", "", "ronin"}));
        System.out.println(formatWords(new String[]{"cats", "dogs", "mice", null, "bears", "tigers", ""}));
        System.out.println(formatWords(new String[]{"one", "two", "three", "four"}));
        System.out.println(formatWords(new String[]{"one"}));
        System.out.println(formatWords(new String[]{""}));
    }
}
