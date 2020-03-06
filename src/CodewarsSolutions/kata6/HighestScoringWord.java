package CodewarsSolutions.kata6;

/*
Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.
 */

public class HighestScoringWord {

    public static String high(String s) {

        String[] words = s.split(" ");

        int tempValue, maxValue = 0;
        String result = "";

        for(int i = 0; i < words.length; i++) {
            String tempStr = words[i];
            tempValue = 0;
            for(int j = 0; j < tempStr.length(); j++) {
                tempValue += (int)tempStr.charAt(j) - 96;
            }
            if(tempValue > maxValue) {
                maxValue = tempValue;
                result = tempStr;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String test1 = "man i need a taxi up to ubud";
        String test2 = "what time are we climbing up to the volcano";
        String test3 = "take me to semynak";

        System.out.println(high(test1));
        System.out.println(high(test2));
        System.out.println(high(test3));

    }

}
