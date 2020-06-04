package LeetcodeSolutions.Easy;

/*
1374. Generate a String With Characters That Have Odd Counts
Link: https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
Topics: String
 */

public class GenerateStringWithCharactersThatHaveOddCounts {
    public static String generateTheString(int n) {

        StringBuilder sb = new StringBuilder();

        if(n % 2 == 1) {
            for(int i = 0; i < n; i++) {
                sb.append("a");
            }
        } else {
            for(int i = 0; i < n - 1; i++) {
                sb.append("a");
            }
            sb.append("b");
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateTheString(4));
        System.out.println(generateTheString(2));
        System.out.println(generateTheString(7));
        System.out.println(generateTheString(95));

    }
}
