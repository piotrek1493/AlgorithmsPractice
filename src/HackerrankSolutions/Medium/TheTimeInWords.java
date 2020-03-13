package HackerrankSolutions.Medium;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/the-time-in-words/problem
 */

import java.util.HashMap;
import java.util.Map;

public class TheTimeInWords {

    // Kind of a messy solution overall, but gets the job done
    // Having said that, definitely going to try to optimize it in the future
    static String timeInWords(int h, int m) {

        Map<Integer, String> words = new HashMap<>();

        words.put(1, "one"); words.put(2, "two"); words.put(3, "three");
        words.put(4, "four"); words.put(5, "five"); words.put(6, "six");
        words.put(7, "seven"); words.put(8, "eight"); words.put(9, "nine");
        words.put(10, "ten"); words.put(11, "eleven"); words.put(12, "twelve");
        words.put(13,"thirteen"); words.put(14,"fourteen"); words.put(15,"fifteen");
        words.put(16,"sixteen"); words.put(17,"seventeen"); words.put(18,"eighteen");
        words.put(19,"nineteen");

        if(m == 0) {
            return words.get(h) + " o' clock";
        }

        if(m < 30) {
            if(m > 1) {
                if(m > 20) {
                    return "twenty " + words.get(m - 20) + " minutes past " + words.get(h);
                } else if(m == 15) {
                    return "quarter past " + words.get(h);
                } else {
                    return words.get(m) + " minutes past " + words.get(h);
                }
            } else {
                return words.get(m) + " minute past " + words.get(h);
            }
        } else if(m > 30) {
            if(m == 45) {
                return "quarter to " + words.get((h + 1) % 12);
            } else if(60 - m > 20) {
                return "twenty " + words.get(60 - m - 20) + " minutes to " + words.get((h + 1) % 12);
            } else if(60 - m < 20) {
                return words.get(60 - m) + " minutes to " + words.get((h + 1) % 12);
            } else {
                return "twenty minutes to " + words.get((h + 1) % 12);
            }
        } else {
            return "half past " + words.get(h);
        }
    }

    public static void main(String[] args) {
        System.out.println(timeInWords(5, 47));
        System.out.println(timeInWords(1, 12));
    }

}
