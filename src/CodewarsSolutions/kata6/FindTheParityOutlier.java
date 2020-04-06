package CodewarsSolutions.kata6;

/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array
is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write
a method that takes the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
 */

public class FindTheParityOutlier {

    static int find(int[] integers) {

        int oddCount = 0, evenCount = 0;

        for(int i = 0; i < 3; i++) {
            if(integers[i] % 2 == 0) evenCount++;
            else oddCount++;
        }

        if(oddCount > evenCount) {
            for(int i : integers) {
                if(i % 2 == 0) {
                    return i;
                }
            }
        } else {
            for(int i : integers) {
                if(i % 2 != 0) {
                    return i;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[] {2, 4, 0, 100, 4, 11, 2602, 36}));
        System.out.println(find(new int[] {160, 3, 1719, 19, 11, 13, -21}));
    }

}
