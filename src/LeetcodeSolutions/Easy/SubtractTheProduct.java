package LeetcodeSolutions.Easy;

/*
1281. Subtract the Product and Sum of Digits of an Integer
Link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
Topics: Math
 */

public class SubtractTheProduct {
    public static int subtractProductAndSum(int n) {
        String str = String.valueOf(n);
        int product = 1;
        int sum = 0;

        for(int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(Character.toString(str.charAt(i)));
            product *= Integer.parseInt(Character.toString(str.charAt(i)));
        }

        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
        System.out.println(subtractProductAndSum(1));
        System.out.println(subtractProductAndSum(Integer.MAX_VALUE));
    }
}
