package LeetcodeSolutions.Easy;

/*
1323. Maximum 69 Number
Link: https://leetcode.com/problems/maximum-69-number/
Topics: Math
 */

public class Maximum69Number {
    public static int maximum69Number(int num) {
        String str = String.valueOf(num);
        char[] ca = str.toCharArray();
        for(int i = 0; i < ca.length; i++) {
            if(ca[i] == '6') {
                ca[i] = '9';
                break;
            }
        }
        String result = String.valueOf(ca);
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
        System.out.println(maximum69Number(9996));
        System.out.println(maximum69Number(9999));
    }
}
