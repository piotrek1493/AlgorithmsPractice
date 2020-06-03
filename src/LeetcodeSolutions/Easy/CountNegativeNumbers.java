package LeetcodeSolutions.Easy;

/*
1351. Count Negative Numbers in a Sorted Matrix
Link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
Topics: Array, Binary Search
 */

public class CountNegativeNumbers {
    public static int countNegatives(int[][] grid) {
        int counter = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        int[][] test1 = new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int[][] test2 = new int[][]{{3,2},{1,0}};
        int[][] test3 = new int[][]{{1,-1},{-1,1}};
        int[][] test4 = new int[][]{{-1}};

        System.out.println(countNegatives(test1));
        System.out.println(countNegatives(test2));
        System.out.println(countNegatives(test3));
        System.out.println(countNegatives(test4));
    }
}
