package CodewarsSolutions.kata6;

/*
In this kata, you must create a digital root function.

A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n.
If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
This is only applicable to the natural numbers.

Here's how it works:

digital_root(16)
=> 1 + 6
=> 7

digital_root(942)
=> 9 + 4 + 2
=> 15 ...
=> 1 + 5
=> 6

digital_root(132189)
=> 1 + 3 + 2 + 1 + 8 + 9
=> 24 ...
=> 2 + 4
=> 6

digital_root(493193)
=> 4 + 9 + 3 + 1 + 9 + 3
=> 29 ...
=> 2 + 9
=> 11 ...
=> 1 + 1
=> 2
 */

public class DigitalRoot {
    public static int getRoot(int n) {
        String num = String.valueOf(n);

        int sum = 0;
        while(num.length() > 1) {
            for(int i = 0; i < num.length(); i++) {
                sum += Integer.parseInt(Character.toString(num.charAt(i)));
            }
            num = String.valueOf(sum);
            sum = 0;
        }

        return Integer.parseInt(num);
    }

    public static void main(String[] args) {
        System.out.println(getRoot(16));
        System.out.println(getRoot(942));
        System.out.println(getRoot(132189));
        System.out.println(getRoot(493193));
    }
}
