package CodewarsSolutions.kata6;

/*
Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.

#Example 1: a1 = ["arp", "live", "strong"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns ["arp", "live", "strong"]

#Example 2: a1 = ["tarp", "mice", "bull"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns []

Notes:
Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.

In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.

Beware: r must be without duplicates.
Don't mutate the inputs.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {

        List<String> list = new ArrayList<>();

        for (String s : array1) {
            for (String value : array2) {
                if (value.contains(s)) {
                    list.add(s);
                    break;
                }
            }
        }

        Collections.sort(list);

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] test1arr1 = {"arp", "live", "strong"};
        String[] test1arr2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] test2arr1 = {"tarp", "mice", "bull"};
        String[] test2arr2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        System.out.println(Arrays.toString(inArray(test1arr1, test1arr2)));
        System.out.println(Arrays.toString(inArray(test2arr1, test2arr2)));
    }

}
