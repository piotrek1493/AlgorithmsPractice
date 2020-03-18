package CodewarsSolutions.kata6;

/*
You will be given a number and you will need to return it as a string in Expanded Form. For example:

Kata.expandedForm(12); # Should return "10 + 2"
Kata.expandedForm(42); # Should return "40 + 2"
Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
NOTE: All numbers will be whole numbers greater than 0.
 */

import java.util.ArrayList;
import java.util.List;

public class ExpandedForm {
    public static String expandedForm(int num)
    {
        String[] str = Integer.toString(num).split("");
        List<String> list = new ArrayList<>();

        for(int i = 0; i < str.length; i++) {
            if(Integer.valueOf(str[i]) > 0) {
                String temp = str[i];
                for(int j = i; j < str.length - 1; j++) {
                    temp += '0';
                }
                list.add(temp);
            }
        }
        String result = list.toString();
        result = result.substring(1, result.length() - 1).replace(",", " +");

        return result;
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(12));
        System.out.println(expandedForm(42));
        System.out.println(expandedForm(70304));
    }
}
