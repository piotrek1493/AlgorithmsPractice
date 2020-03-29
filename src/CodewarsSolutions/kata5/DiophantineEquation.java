package CodewarsSolutions.kata5;

/*
In mathematics, a Diophantine equation is a polynomial equation, usually with two or more unknowns, such that only the
integer solutions are sought or studied.

In this kata we want to find all integers x, y (x >= 0, y >= 0) solutions of a diophantine equation of the form:

x2 - 4 * y2 = n
(where the unknowns are x and y, and n is a given positive number) in decreasing order of the positive xi.

If there is no solution return [] or "[]" or "". (See "RUN SAMPLE TESTS" for examples of returns).

Examples:
solEquaStr(90005) --> "[[45003, 22501], [9003, 4499], [981, 467], [309, 37]]"
solEquaStr(90002) --> "[]"
Hint:
x2 - 4 * y2 = (x - 2*y) * (x + 2*y)
 */

public class DiophantineEquation {
    public static String solEquaStr(long n) {

        String result = "";
        int results = 0;

        for(long i = 0; i <= n; i++) {
            for(long j = 0; j <= n; j++) {
                if((i - 2*j) * (i + 2*j) == n) {
                    result += "[" +  i + ", " + j + "], ";
                    results++;
                }
            }
        }

        if(results == 0) {
            return "[]";
        }

        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static void main(String[] args) {
        System.out.println(solEquaStr(90005));
    }
}
