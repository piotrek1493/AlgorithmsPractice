package CodewarsSolutions.kata5;

/*
Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures.
 */

public class HumanReadableTime {
    public static String makeReadable(int seconds) {

        String hrs = Integer.toString(seconds / 3600);
        String mins = Integer.toString((seconds % 3600)/60);
        String secs = Integer.toString(seconds % 60);

        if(hrs.length() == 1) {
            hrs = "0" + hrs;
        }
        if(mins.length() == 1) {
            mins = "0" + mins;
        }
        if(secs.length() == 1) {
            secs = "0" + secs;
        }

        return hrs + ":" + mins + ":" + secs;
    }

    public static void main(String[] args) {
        int test1 = 0, test2 = 1800, test3 = 3600, test4 = 14578, test5 = 35999;
        System.out.println(makeReadable(test1));
        System.out.println(makeReadable(test2));
        System.out.println(makeReadable(test3));
        System.out.println(makeReadable(test4));
        System.out.println(makeReadable(test5));
    }

}
