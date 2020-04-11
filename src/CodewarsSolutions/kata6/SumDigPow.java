package CodewarsSolutions.kata6;

/*
The number 89 is the first integer with more than one digit that fulfills the property partially introduced
in the title of this kata. What's the use of saying "Eureka"? Because this sum gives the same number.

In effect: 89 = 8^1 + 9^2

The next number in having this property is 135.

See this property again: 135 = 1^1 + 3^2 + 5^3

We need a function to collect these numbers, that may receive two integers a, b that defines the
range [a, b] (inclusive) and outputs a list of the sorted numbers in the range that fulfills the
property described above.

Let's see some cases:

sum_dig_pow(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9]

sum_dig_pow(1, 100) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
If there are no numbers of this kind in the range [a, b] the function should output an empty list.

sum_dig_pow(90, 100) == []
 */

import java.util.ArrayList;
import java.util.List;

public class SumDigPow {
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();
        for(long i = a; i <= b; i++) {
            if(isValid(i)) {
                result.add(i);
            }
        }

        return result;
    }

    public static boolean isValid(long num) {
        String str = String.valueOf(num);
        long sum = 0;
        for(int i = 0; i < str.length(); i++) {
            sum += Math.pow(Integer.parseInt(Character.toString(str.charAt(i))), i+1);
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(sumDigPow(1, 100000));
        System.out.println(sumDigPow(1, 100));
        System.out.println(sumDigPow(4, 2000));
    }
}
