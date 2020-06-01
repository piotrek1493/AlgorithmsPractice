package LeetcodeSolutions.Easy;

/*
1431. Kids With the Greatest Number of Candies
Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
Topics: Array
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] sortedCandies = Arrays.copyOf(candies, candies.length);
        Arrays.sort(sortedCandies);
        int max = sortedCandies[sortedCandies.length - 1];
        List<Boolean> result = new ArrayList<>();

        for(int i : candies) {
            if(i + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2}, 1));
        System.out.println(kidsWithCandies(new int[]{12,1,12}, 10));
    }
}
