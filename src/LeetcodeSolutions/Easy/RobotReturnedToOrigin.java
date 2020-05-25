package LeetcodeSolutions.Easy;

/*
657. Robot Return to Origin
Link: https://leetcode.com/problems/robot-return-to-origin/
Topics: String
 */

public class RobotReturnedToOrigin {
    public static boolean judgeCircle(String moves) {

        int UDpos = 0;
        int LRpos = 0;

        for(int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i) == 'U') UDpos++;
            if(moves.charAt(i) == 'D') UDpos--;
            if(moves.charAt(i) == 'L') LRpos--;
            if(moves.charAt(i) == 'R') LRpos++;
        }

        return UDpos == 0 && LRpos == 0;
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
        System.out.println(judgeCircle("UDLRUDRLURLDD"));
    }
}
