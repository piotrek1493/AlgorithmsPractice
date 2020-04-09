package CodewarsSolutions.kata6;

/*
Your task is to Find the next higher number (int) with same '1'- Bits.

I.e. as much '1' bits as before and output next higher than input. Input is always an int >0 up to 1<<30.
No bad cases or special tricks...

Some easy examples:

Input: 129  => Output: 130 (10000001 => 10000010)
Input: 127 => Output: 191 (01111111 => 10111111)
Input: 1 => Output: 2 (01 => 10)
Input: 323423 => Output: 323439 (1001110111101011111 => 1001110111101101111)
 */

public class FindNextHigherNumberWithSameBits {
    public static int nextHigher(int n) {
        int result = n + 1;
        while(countBits(result) != countBits(n)) {
            result++;
        }
        return result;
    }

    public static int countBits(int n) {
        return (int)Integer.toBinaryString(n).chars().filter(c -> c == '1').count();
    }

    public static void main(String[] args) {
        System.out.println(nextHigher(127));
        System.out.println(nextHigher(128));
        System.out.println(nextHigher(129));
    }
}
