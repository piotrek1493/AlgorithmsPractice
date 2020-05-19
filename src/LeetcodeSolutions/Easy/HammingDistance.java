package LeetcodeSolutions.Easy;

/*
461. Hamming Distance
Link: https://leetcode.com/problems/hamming-distance/
Topics: Bit Manipulation
 */

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int counter = 0;
        while(x > 0 || y > 0) {
            if(x % 2 != y % 2) {
                counter++;
            }
            x /= 2;
            y /= 2;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }
}
