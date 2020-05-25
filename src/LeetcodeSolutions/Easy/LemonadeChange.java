package LeetcodeSolutions.Easy;

/*
860. Lemonade Change
Link: https://leetcode.com/problems/lemonade-change/
Topics: Greedy Algorithms
 */

public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int bill5 = 0, bill10 = 0;

        for(int i = 0; i < bills.length; i++) {
            if(bills[i] == 5) {
                bill5++;
            }
            if(bills[i] == 10) {
                if(bill5 >= 1) {
                    bill5--;
                    bill10++;
                } else {
                    return false;
                }
            }
            if(bills[i] == 20) {
                if(bill10 >= 1 && bill5 >= 1) {
                    bill10--;
                    bill5--;
                } else if(bill5 >= 3) {
                    bill5-=3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,5,10,20}));
        System.out.println(lemonadeChange(new int[]{5,5,10}));
        System.out.println(lemonadeChange(new int[]{10,10}));
        System.out.println(lemonadeChange(new int[]{5,5,10,10,20}));
    }
}
