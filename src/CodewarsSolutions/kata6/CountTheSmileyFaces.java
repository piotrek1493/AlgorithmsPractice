package CodewarsSolutions.kata6;

/*
Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.
Rules for a smiling face:
-Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
-A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
-Every smiling face must have a smiling mouth that should be marked with either ) or D.
No additional characters are allowed except for those mentioned.
Valid smiley face examples:
:) :D ;-D :~)
Invalid smiley faces:
;( :> :} :]

Example cases:

countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;

Note: In case of an empty array return 0. You will not be tested with invalid input (input will always be an array).
Order of the face (eyes, nose, mouth) elements will always be the same
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountTheSmileyFaces {
    public static int countSmileys(List<String> arr) {

        if(arr.size() == 0) return 0;

        List<String> arr2 = arr.stream()
                .filter(s -> checkSmiley(s))
                .collect(Collectors.toList());

        return arr2.size();
    }

    public static boolean checkSmiley(String str) {

        boolean isSmiley = false;

        if(str.length() == 2 && (str.charAt(0) == ':' || str.charAt(0) == ';')
                && (str.charAt(1) == ')' || str.charAt(1) == 'D')) {
            isSmiley = true;
        }

        if(str.length() == 3 && (str.charAt(0) == ':' || str.charAt(0) == ';')
                && (str.charAt(1) == '-' || str.charAt(1) == '~')
                && (str.charAt(2) == ')' || str.charAt(2) == 'D')) {
            isSmiley = true;
        }

        return isSmiley;
    }

    public static void main(String[] args) {
        System.out.println(countSmileys(Arrays.asList(":)", ";(", ";}", ":-D")));       // should return 2;
        System.out.println(countSmileys(Arrays.asList(";D", ":-(", ":-)", ";~)")));     // should return 3;
        System.out.println(countSmileys(Arrays.asList(";]", ":[", ";*", ":$", ";-D"))); // should return 1;
    }
}
