package CodewarsSolutions.kata6;

/*
In esoteric language called Whitespace, numbers are represented in the following format:

first character represents the sign: [space] for plus, [tab] for minus;
characters after that and until [LF] are the binary representation of the integer: [space] for 0, [tab] for 1.
the integer MUST be terminated by [LF].
Notes
Valid Whitespace number must always have at least two characters: a sign and the terminator. In case there are only two
characters, the number is equal to zero.
For the purposes of this kata, zero must always be represented as [space][LF].
In this kata, the output should not contain any leading zeros.
In Whitespace, only space, tabulation and linefeed are meaningful characters. All other characters are ignored. However,
for the purposes of this simple kata, please do not add any other characters in the output.
In this kata, input will always be a valid negative or positive integer.
For your convenience, in this kata we will use unbleach() function when evaluating your results. This function replaces
whitespace characters with [space], [tab], and [LF] to make fail messages more obvious. You can see how it works in
Example Test Cases.

Examples:
1 in Whitespace is " \t\n".
0 in Whitespace is " \n".
-1 in Whitespace is "\t\t\n".
2 in Whitespace is " \t \n".
-3 in Whitespace is "\t\t\t\n".
More on Whitespace
 */

public class IntegerToWhitespace {
    public static String whitespaceNumber(final int n) {
        // Leaving double escaping characters "\\" everywhere for testing purposes
        String number = Integer.toBinaryString(Math.abs(n));
        if (n == 0) {
            return " \\n";
        } else if (n < 0) {
            StringBuilder sb = new StringBuilder("\\t");
            for (int i = 0; i < number.length(); i++) {
                if (Integer.parseInt(Character.toString(number.charAt(i))) == 1) {
                    sb.append("\\t");
                } else {
                    sb.append(" ");
                }
            }
            return sb.toString() + "\\n";
        } else {
            StringBuilder sb = new StringBuilder(" ");
            for (int i = 0; i < number.length(); i++) {
                if (Integer.parseInt(Character.toString(number.charAt(i))) == 1) {
                    sb.append("\\t");
                } else {
                    sb.append(" ");
                }
            }
            return sb.toString() + "\\n";
        }
    }

    public static void main(String[] args) {
        System.out.println(whitespaceNumber(0));
        System.out.println(whitespaceNumber(1));
        System.out.println(whitespaceNumber(-1));
        System.out.println(whitespaceNumber(2));
        System.out.println(whitespaceNumber(-3));
    }
}
