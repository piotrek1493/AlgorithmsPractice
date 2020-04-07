package CodewarsSolutions.kata6;

/*
We search non-negative integer numbers, with at most 3 digits, such as the sum of the cubes of their digits is the
number itself; we will call them "cubic" numbers.

153 is such a "cubic" number : 1^3 + 5^3 + 3^3 = 153
These "cubic" numbers of at most 3 digits are easy to find, even by hand, so they are "hidden" with other numbers and
characters in a string.

The task is to find, or not, the "cubic" numbers in the string and then to make the sum of these "cubic" numbers found
in the string, if any, and to return a string such as:

"number1 number2 (and so on if necessary) sumOfCubicNumbers Lucky"
if "cubic" numbers number1, number2, ... were found. The numbers in the output are to be in the order in which they are
encountered in the input string.

If no cubic numbers are found return the string:

"Unlucky".
Examples:

 s = "aqdf& 0 1 xyz 153 777.777" must return "0 1 153 154 Lucky"

 s = "QK29 45[&erui" must return "Unlucky".
Note: In the string "001234" where 3 digits or more follow each other the first packet to examine is "001" and the
following is "234". If a packet of at most three digits has been taken, whether or not "cubic", it's over for that packet.

When a continuous string of digits exceeds 3, the string is split into groups of 3 from the left. The last grouping
could have 3, 2 or 1 digits. e.g "24172410" becomes 3 strings comprising "241", "724" and "10" e.g "0785" becomes 2
strings comprising "078" and "5".
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// This was way harder than it looked...
public class HiddenCubicNumbers {
    public static String isSumOfCubes(String s) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            if(Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
                for(int j = i + 1; j <= i + 2 && j < s.length(); j++) {
                    if(Character.isDigit(s.charAt(j))) {
                        sb.append(s.charAt(j));
                    } else {
                        break;
                    }
                }
                list.add(sb.toString());
                i = i + sb.length() - 1;
            }
        }

        List<String> result = list.stream()
                .filter(e -> isCubic(e))
                .collect(Collectors.toList());

        if(result.size() == 0) {
            return "Unlucky";
        }

        result.add(String.valueOf(result.stream().mapToInt(Integer::parseInt).sum()));

        return String.join(" ", result) + " Lucky";
    }

    public static boolean isCubic(String str) {
        return Integer.parseInt(str) == str.chars().map(c -> (int) Math.pow(Integer.parseInt(Character.toString(c)), 3)).sum();
    }

    public static void main(String[] args) {
        System.out.println(isSumOfCubes("aqdf& 0 1 xyz 153 777.777"));
        System.out.println(isSumOfCubes("QK29 45[&erui"));
        System.out.println(isSumOfCubes("0 9026315 -827&()"));
    }
}
