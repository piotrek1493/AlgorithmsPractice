package HackerrankSolutions.Easy;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/mark-and-toys/problem
 */

import java.util.Arrays;

public class MarkAndToys {
    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);

        int sum = 0;
        int counter = 0;

        for(int i = 0; i < prices.length; i++) {
            sum += prices[i];
            counter++;
            if(sum > k) {
                counter--;
                break;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50));
    }

}
