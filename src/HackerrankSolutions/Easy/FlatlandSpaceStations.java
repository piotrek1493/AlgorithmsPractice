package HackerrankSolutions.Easy;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/flatland-space-stations/problem
 */

import java.util.Arrays;

public class FlatlandSpaceStations {
    static int flatlandSpaceStations(int n, int[] c)
    {
        int max = Integer.MIN_VALUE;
        Arrays.sort(c);

        for(int i = 0; i < c.length - 1; i++)
        {
            max = Math.max(max, (c[i+1] - c[i]) / 2);
        }

        max=Math.max(max, (n - 1 - c[c.length-1]));
        max=Math.max(max, c[0]);

        return max;
    }

    public static void main(String[] args) {
        System.out.println(flatlandSpaceStations(6, new int[]{0,1,2,4,3,5}));
    }

}
