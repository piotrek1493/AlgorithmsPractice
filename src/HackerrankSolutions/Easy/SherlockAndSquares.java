package HackerrankSolutions.Easy;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/sherlock-and-squares/problem
 */

public class SherlockAndSquares {
    static int squares(int a, int b) {
        return ((int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1);
    }

    public static void main(String[] args) {
        System.out.println(squares(3, 9));
    }

}
