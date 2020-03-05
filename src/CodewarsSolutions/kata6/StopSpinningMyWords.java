package CodewarsSolutions.kata6;

/*
Write a function that takes in a string of one or more words, and returns the same string,
but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test") => returns "This is a test"
spinWords( "This is another test" )=> returns "This is rehtona test"
 */

public class StopSpinningMyWords {

    public static String spinWords(String sentence) {
        String[] words = sentence.replaceAll("[^a-zA-Z0-9\\s]", "") // in case of any non-alphanumeric characters appearing
                .split(" ");

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() >= 5) {
                words[i] = reverse(words[i]);
            }
        }

        return String.join(" ", words);
    }

    // helper method
    public static String reverse(String str) {
        String result = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {

        String str1 = "This is a test";
        String str2 = "This is another test";
        System.out.println(spinWords(str1));
        System.out.println(spinWords(str2));

    }
}
