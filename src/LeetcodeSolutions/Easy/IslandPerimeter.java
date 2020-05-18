package LeetcodeSolutions.Easy;

/*
463. Island Perimeter
Link: https://leetcode.com/problems/island-perimeter/
Topics: Hash Table
 */

// This was way harder than it looked...
public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int counter = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                int sides = 4;
                if(grid[i][j] == 1) {
                    if(i < grid.length - 1 && grid[i+1][j] == 1) {
                        sides--;
                    }
                    if(j < grid[i].length - 1 && grid[i][j+1] == 1) {
                        sides--;
                    }
                    if(i > 0 && grid[i-1][j] == 1) {
                        sides--;
                    }
                    if(j > 0 && grid[i][j-1] == 1) {
                        sides--;
                    }
                    counter += sides;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[][] test = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(islandPerimeter(test));
    }
}
