package LeetcodeSolutions.Easy;

/*
1331. Rank Transform of an Array
Link: https://leetcode.com/problems/rank-transform-of-an-array/
Topics: Array
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);

        String str = "AAA".toLowerCase();

        int counter = 1;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < temp.length; i++) {
            if(!map.containsKey(temp[i])) {
                map.put(temp[i], counter++);
            }
        }

        int[] result = new int[arr.length];
        for(int i = 0; i < result.length; i++) {
            result[i] = map.get(arr[i]);
        }

        return result;
    }
}
