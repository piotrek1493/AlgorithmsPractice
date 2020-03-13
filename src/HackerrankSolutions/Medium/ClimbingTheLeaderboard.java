package HackerrankSolutions.Medium;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class ClimbingTheLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] array = IntStream.of(scores).distinct().toArray();
        int i = array.length-1;
        int [] res = new int[alice.length];
        int c=0;
        for(int score: alice) {
            while(i>=0) {
                if(score>=array[i])
                    i--;
                else {
                    res[c]=i+2;
                    c++;
                    break;
                }
            }
            if(i<0){
                res[c]=1;
                c++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {100, 100, 50, 40, 40, 20, 10};
        int[] arr2 = {5, 25, 50, 120};
        System.out.println(Arrays.toString(climbingLeaderboard(arr1, arr2)));
    }
}

