package LeetcodeSolutions.Easy;

/*
1189. Maximum Number of Balloons
Link: https://leetcode.com/problems/maximum-number-of-balloons/
Topics: Hash Table, String
 */

import java.util.Arrays;
import java.util.Collections;

public class MaximumNumberOfBalloons {
    public static int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for(char ch:text.toCharArray()){
            switch(ch){
                case 'b':
                    b++;
                    break;
                case 'a':
                    a++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'n':
                    n++;
                    break;
            }
        }

        return Collections.min(Arrays.asList(b, a, l/2, o/2, n));
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(maxNumberOfBalloons("leetcode"));
    }
}
