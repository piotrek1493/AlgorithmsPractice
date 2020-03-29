package CodewarsSolutions.kata6;

/*
Backwards Read Primes are primes that when read backwards in base 10 (from right to left) are a different prime.
(This rules out primes which are palindromes.)

Examples:
13 17 31 37 71 73 are Backwards Read Primes
13 is such because it's prime and read from right to left writes 31 which is prime too. Same for the others.

Task
Find all Backwards Read Primes between two positive given numbers (both inclusive), the second one always being greater
than or equal to the first one. The resulting array or the resulting string will be ordered following the natural order
of the prime numbers.

Example
backwardsPrime(2, 100) => [13, 17, 31, 37, 71, 73, 79, 97] backwardsPrime(9900, 10000) => [9923, 9931, 9941, 9967]
backwardsPrime(501, 599) => []

Note for Forth
Return only the first backwards-read prime between start and end or 0 if you don't find any

backwardsPrime(2, 100) => "13 17 31 37 71 73 79 97"
backwardsPrime(9900, 10000) => "9923 9931 9941 9967"
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BackwardsReadPrimes {
    public static String backwardsPrime(long start, long end) {
        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for(long i = start; i <= end; i++) {
            if(isPrime(i)) {
                list.add(String.valueOf(i));
            }
        }

        for(int i = 0; i < list.size(); i++) {
            if(isPrime(Long.parseLong(list.get(i)))
                    && isPrime(Long.parseLong(reverse(list.get(i))))
                    && !list.get(i).equals(reverse(list.get(i)))) {
                result.add(list.get(i));
            }
        }

        return result.stream().collect(Collectors.joining(" "));
    }

    public static boolean isPrime(long n) {
        for(long i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String reverse(String str) {
        String result = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(backwardsPrime(2, 100));
        System.out.println(backwardsPrime(9900, 10000));
    }
}
