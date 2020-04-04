package CodewarsSolutions.kata7;

/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, and u as vowels for this Kata.

The input string will only consist of lower case letters and/or spaces.
 */

public class VowelCount {
    public static int getCount(String str) {
        int vowelsCount = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||  str.charAt(i) == 'u') {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(getCount("word"));
        System.out.println(getCount("how many vowels"));
    }
}
