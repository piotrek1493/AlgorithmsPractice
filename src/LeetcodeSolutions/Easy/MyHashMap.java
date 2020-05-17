package LeetcodeSolutions.Easy;

/*
706. Design HashMap
Link: https://leetcode.com/problems/design-hashmap/
Topics: Hash Table, Design
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyHashMap {
    List<List<Integer>> list;

    public MyHashMap() {
        list = new ArrayList<>();
    }

    public void put(int key, int value) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).get(0) == key) {
                list.get(i).set(1, value);
                return;
            }
        }
        list.add(Arrays.asList(key, value));
    }

    public int get(int key) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).get(0) == key) {
                return list.get(i).get(1);
            }
        }
        return -1;
    }

    public void remove(int key) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).get(0) == key) {
                list.remove(i);
                return;
            }
        }
    }
}
