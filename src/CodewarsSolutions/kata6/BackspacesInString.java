package CodewarsSolutions.kata6;

/*
Assume "#" is like a backspace in string. This means that string "a#bc#d" is actually "bd"

Your task is to process a string with "#" symbols

Examples

"abc#d##c" ==> "ac"
"abc##d######" ==> ""
"#######" ==> ""
"" => ""
 */

import java.util.*;

public class BackspacesInString {
    public static String cleanString(String s) {

        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < sb.length() - 1; i++) {
            if(sb.charAt(i) != '#' && sb.charAt(i+1) == '#') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i = -1;
            }
        }
        return sb.toString().replaceAll("#", "");
    }


    public static void main(String[] args) {
        System.out.println(cleanString("a#bc#d"));
        System.out.println(cleanString("abc####d##c#"));
        System.out.println(cleanString("abc#d##c"));

    }

}
