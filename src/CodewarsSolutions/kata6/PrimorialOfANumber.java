package CodewarsSolutions.kata6;

/*
Task
Given a number N , calculate its primorial. !alt !alt

Notes
Only positive numbers will be passed (N > 0) .
Input >> Output Examples:
1- numPrimorial (3) ==> return (30)
Explanation:
Since the passed number is (3) ,Then the primorial should obtained by multiplying 2 * 3 * 5 = 30 .

Mathematically written as , P3# = 30 .
2- numPrimorial (5) ==> return (2310)
Explanation:
Since the passed number is (5) ,Then the primorial should obtained by multiplying 2 * 3 * 5 * 7 * 11 = 2310 .

Mathematically written as , P5# = 2310 .
3- numPrimorial (6) ==> return (30030)
Explanation:
Since the passed number is (6) ,Then the primorial should obtained by multiplying 2 * 3 * 5 * 7 * 11 * 13 = 30030 .

Mathematically written as , P6# = 30030 .
 */

import java.math.BigInteger;

public class PrimorialOfANumber {
    public static String numPrimorial(int n) {
        int[] arr = getPrimes(n);
        BigInteger result = new BigInteger("1");

        for(int i = 0; i < arr.length; i++) {
            result = result.multiply(new BigInteger(String.valueOf(arr[i])));
        }

        return String.valueOf(result);
    }

    public static int[] getPrimes(int length) {
        int[] result = new int[length];
        int index = 0;
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            if(isPrime(i)) {
                result[index] = i;
                index++;
            }
            if(index == length) {
                break;
            }
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if(n == 0 || n == 1) {
            return false;
        }
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(numPrimorial(2));
        System.out.println(numPrimorial(3));
        System.out.println(numPrimorial(6));
        System.out.println(numPrimorial(9));
        System.out.println(numPrimorial(20));
    }

}
