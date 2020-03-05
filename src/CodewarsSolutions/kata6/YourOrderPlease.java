package CodewarsSolutions.kata6;

/*
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
 */

import java.util.ArrayList;
import java.util.List;

public class YourOrderPlease {

    public static String order(String words) {
        if(words.equals("")) {
            return "";
        }

        String[] arr = words.split(" ");
        String[] result = new String[arr.length];
        int num = 1, index = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].contains(String.valueOf(num))) {
                result[index] = arr[i];
                index++;
                num++;
                i = -1;
                if(index == result.length) {
                    break;
                }
            }
        }
        return String.join(" ", result);
    }

    public static void main(String[] args) {

        String str = "is2 Thi1s T4est 3a";
        String str1 = "Fo1r the2 g3ood 4of th5e pe6ople";
        System.out.println(order(str));
        System.out.println(order(str1));

    }
}
