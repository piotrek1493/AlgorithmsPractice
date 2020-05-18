package LeetcodeSolutions.Easy;

/*
171. Excel Sheet Coulmn Number
Link: https://leetcode.com/problems/excel-sheet-column-number/
Topics: Math
 */

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String s) {
        int counter = 0;
        for(int i = 0; i < s.length(); i++) {
            counter += Math.pow(26, s.length() - i -1) * ((int)(s.charAt(i) - 'A') + 1);
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("Z"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("AAB"));
        System.out.println(titleToNumber("AZZA"));
        System.out.println(titleToNumber("ZY"));
        System.out.println(titleToNumber("ZWB"));
    }
}
