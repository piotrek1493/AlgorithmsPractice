package CodewarsSolutions.kata5;

/*
Divisors of 42 are : 1, 2, 3, 6, 7, 14, 21, 42. These divisors squared are: 1, 4, 9, 36, 49, 196, 441, 1764.
The sum of the squared divisors is 2500 which is 50 * 50, a square!

Given two integers m, n (1 <= m <= n) we want to find all integers between m and n whose sum of squared divisors is itself a square. 42 is such a number.

The result will be an array of arrays or of tuples (in C an array of Pair) or a string, each subarray having two elements,
first the number whose squared divisors is a square and then the sum of the squared divisors.

#Examples:

list_squared(1, 250) --> [[1, 1], [42, 2500], [246, 84100]]
list_squared(42, 250) --> [[42, 2500], [246, 84100]]
The form of the examples may change according to the language, see Example Tests: for more details.
 */

import java.util.ArrayList;
import java.util.List;

public class SumSquaredDivisors {
    public static String listSquared(long m, long n) {

        String result = "";

        for(long i = m; i <= n; i++) {
            if(isValid(i)) {
                result += "[" + i + ", " + sum(i) + "], ";
            }
        }

        return result.equals("") ? "[]" : "[" + result.substring(0, result.length() - 2) + "]";
    }

    // helper method to count the sum
    static long sum(long num) {
        List<Long> list = new ArrayList<>();

        for(long i = 1; i <= num; i++) {
            if(num % i == 0) {
                list.add(i);
            }
        }

        return list.stream().map(x -> x*x).reduce(0L, Long::sum);
    }

    // helper method to check whether a number meets the conditions described in the task
    static boolean isValid(long num) {
        return Math.sqrt(sum(num)) == (long)Math.sqrt(sum(num));
    }


    public static void main(String[] args) {

        System.out.println(listSquared(1, 250));
        System.out.println(listSquared(42, 250));
        System.out.println(listSquared(2, 15));

    }

}
