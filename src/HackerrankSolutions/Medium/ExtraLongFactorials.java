package HackerrankSolutions.Medium;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/extra-long-factorials/problem
 */

import java.math.BigInteger;

public class ExtraLongFactorials {

    static void extraLongFactorials(int n) {

        BigInteger fact = new BigInteger("1");

        for(int i = 2; i <= n; i++) {
            BigInteger multiplier = new BigInteger(String.valueOf(i));
            fact = fact.multiply(multiplier);
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
        extraLongFactorials(41);
    }
}
