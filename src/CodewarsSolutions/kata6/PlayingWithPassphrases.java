package CodewarsSolutions.kata6;

/*
Everyone knows passphrases. One can choose passphrases from poems, songs, movies names and so on but frequently
they can be guessed due to common cultural references. You can get your passphrases stronger by different means.
One is the following:

choose a text in capital letters including or not digits and non alphabetic characters,

- shift each letter by a given number but the transformed letter must be a letter (circular shift),
- replace each digit by its complement to 9,
- keep such as non alphabetic and non digit characters,
- downcase each letter in odd position, upcase each letter in even position (the first character is in position 0),
- reverse the whole result.
#Example:

your text: "BORN IN 2015!", shift 1

1 + 2 + 3 -> "CPSO JO 7984!"

4 "CpSo jO 7984!"

5 "!4897 Oj oSpC"

With longer passphrases it's better to have a small and easy program. Would you write it?
 */

public class PlayingWithPassphrases {
    public static String playPass(String s, int n) {

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                int originalPos = s.charAt(i) - 'A';
                int newPos = (originalPos + n) % 26;
                char newChar = (char) ('A' + newPos);
                if(i % 2 == 0) {
                    result.append(Character.toUpperCase(newChar));
                } else {
                    result.append(Character.toLowerCase(newChar));
                }
            } else if(Character.isLowerCase(s.charAt(i))) {
                int originalPos = s.charAt(i) - 'a';
                int newPos = (originalPos + n) % 26;
                char newChar = (char) ('a' + newPos);
                result.append(Character.toLowerCase(newChar));
            } else if(Character.isDigit(s.charAt(i))) {
                int num = Integer.parseInt(Character.toString(s.charAt(i)));
                result.append(9 - num);
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(playPass("BORN IN 2015!", 1));
        System.out.println(playPass("This is a test nr. 2 !^&*", 3));
    }
}
