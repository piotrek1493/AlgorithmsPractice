package LeetcodeSolutions.Medium;

/*
1387. Sort Integers by The Power Value
Link: https://leetcode.com/problems/sort-integers-by-the-power-value/
Topics: Sort, Graph
 */

import java.util.*;
import java.util.stream.Collectors;

public class SortIntegersByPowerValue {
    public static int getKth(int lo, int hi, int k) {
        int[] nums = new int[hi - lo + 1];
        int numsIndex = 0;

        for(int i = lo; i <= hi; i++) {
            nums[numsIndex++] = i;
        }

        int[] powerVals = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            int val = num;
            int counter = 0;
            while (val != 1) {
                if (val % 2 == 0) val /= 2;
                else val = 3 * val + 1;
                counter++;
            }
            powerVals[index++] = counter;
        }



        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], powerVals[i]);
        }


        Map<Integer, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        Set<Integer> set = sortedMap.keySet();
        List<Integer> result = new ArrayList<>(set);

        return result.get(k - 1);
    }

    public static void main(String[] args) {
        System.out.println(getKth(12, 15, 2));
        System.out.println(getKth(1, 1, 1));
        System.out.println(getKth(1, 1000, 777));
    }
}
