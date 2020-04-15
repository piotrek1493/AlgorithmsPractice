package LeetcodeSolutions.Easy;

/*
1046. Last Stone Weight
Link: https://leetcode.com/problems/last-stone-weight/
Topics: Heap, Greedy Algorithms
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0) return 0;
        if(stones.length == 1) return stones[0];
        List<Integer> list = Arrays.stream(stones).boxed().collect(Collectors.toList());

        for(int i = 0; i < list.size() - 1; i++) {
            if(list.size() == 1) {
                return list.get(0);
            } else if(list.size() == 2 && list.get(0) == list.get(1)) {
                return 0;
            }
            Collections.sort(list);
            Collections.reverse(list);
            if(list.get(i) == list.get(i + 1)) {
                list.remove(i + 1);
                list.remove(i);
                i-=2;
                if(i < 0) i = -1;
            } else if(list.get(i) != list.get(i + 1)) {
                list.set(i, list.get(i) - list.get(i+1));
                list.remove(i + 1);
                i--;
                if(i < 0) i = -1;
            }
        }

        return list.get(0);
    }
}
