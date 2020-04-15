package LeetcodeSolutions.Easy;

/*
705. Design HashSet
Link: https://leetcode.com/problems/design-hashset/
Topics: Hash Table, Design
 */

import java.util.Arrays;

public class MyHashSet {
    int[] set = new int[0];

    public MyHashSet() {

    }

    public void add(int key) {
        if(this.contains(key)) {
            return;
        }
        set = Arrays.copyOf(set, set.length + 1);
        set[set.length - 1] = key;
    }

    public void remove(int key) {
        if(set.length == 0 || !this.contains(key)) return;
        for (int i = 0; i < set.length; i++) {
            if (set[i] == key) {
                int temp = set[set.length - 1];
                set[set.length - 1] = key;
                set[i] = temp;
            }
        }
        set = Arrays.copyOf(set, set.length - 1);
    }

    public boolean contains(int key) {
        if(set.length == 0) return false;
        for(int i = 0; i < set.length; i++) {
            if(set[i] == key) {
                return true;
            }
        }
        return false;
    }
}
