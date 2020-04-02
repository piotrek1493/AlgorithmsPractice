package CodewarsSolutions.kata6;

/*
You are given an array strarr of strings and an integer k. Your task is to return the first longest string consisting
of k consecutive strings taken in the array.

Example:
longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"

n being the length of the string array, if n = 0 or k > n or k <= 0 return "".

Note
consecutive strings : follow one after another without an interruption
 */

public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        if(k > strarr.length || k <= 0 || strarr.length == 0) return "";

        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < strarr.length - k + 1; i++) {
            for(int j = i; j < i + k; j++) {
                sb.append(strarr[j]);
            }
            if(sb.length() > result.length()) {
                result = sb;
            }
            sb = new StringBuilder();
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
        System.out.println(longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
        System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15));
        System.out.println(longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
    }


}
