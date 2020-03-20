package CodewarsSolutions.kata6;

/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
which is the number of times you must multiply the digits in num until you reach a single digit.

For example:

 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                      // and 4 has only one digit

 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                       // 1*2*6 = 12, and finally 1*2 = 2

 persistence(4) == 0 // because 4 is already a one-digit number
 */

public class PersistentBugger {
    public static int persistence(long n) {

        int counter = 0;
        long temp = 1;

        String str = String.valueOf(n);

        while(str.length() != 1) {
            for (int i = 0; i < str.length(); i++) {
                temp *= Integer.parseInt(Character.toString(str.charAt(i)));
            }
            str = String.valueOf(temp);
            temp = 1;
            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(persistence(1000));
        System.out.println(persistence(39));
        System.out.println(persistence(4));
        System.out.println(persistence(29));
    }
}
