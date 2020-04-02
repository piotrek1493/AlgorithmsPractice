package CodewarsSolutions.kata6;

/*
Given an array, find the integer that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
 */

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {
    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : a) {
            if(!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        System.out.println(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        System.out.println(findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        System.out.println(findIt(new int[]{10}));
        System.out.println(findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        System.out.println(findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }
}
