package LeetcodeSolutions.Easy;

/*
709. To Lower Case
Link: https://leetcode.com/problems/to-lower-case/
Topics: String
 */

public class ToLowerCase {
    public static String toLowerCase(String str) {

        char[] ca = str.toCharArray();

        for(int i = 0; i < ca.length; i++) {
            if(ca[i] >= 65 && ca[i] <= 90) {
                ca[i] += 32;
            }
        }
        return String.valueOf(ca);
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("here"));
        System.out.println(toLowerCase("LOVELY"));
        System.out.println(toLowerCase("SaMPle sEnTENce27 . . !"));
    }
}
