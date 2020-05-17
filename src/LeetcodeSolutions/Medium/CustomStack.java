package LeetcodeSolutions.Medium;

/*
1381. Design a Stack With Increment Operation
Link: https://leetcode.com/problems/design-a-stack-with-increment-operation/
Topics: Stack, Design
 */

import java.util.Arrays;

public class CustomStack {
    int[] stack;
    int maxSize;

    public CustomStack(int maxSize) {
        stack = new int[0];
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if(stack.length == maxSize) return;
        stack = Arrays.copyOf(stack, stack.length + 1);
        stack[stack.length - 1] = x;
    }

    public int pop() {
        if(stack.length == 0) return -1;
        int last = stack[stack.length - 1];
        stack = Arrays.copyOf(stack, stack.length - 1);
        return last;
    }

    public void increment(int k, int val) {
        if(k >= stack.length) {
            for(int i = 0; i < stack.length; i++) {
                stack[i] += val;
            }
        } else {
            for(int i = 0; i < k; i++) {
                stack[i] += val;
            }
        }
    }
}
