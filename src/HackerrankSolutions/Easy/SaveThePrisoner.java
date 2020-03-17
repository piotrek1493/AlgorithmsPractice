package HackerrankSolutions.Easy;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/save-the-prisoner/problem
 */

public class SaveThePrisoner {
    static int saveThePrisoner(int n, int m, int s) {
        int poisonedPrisoner = (s + m - 1) % n;
        if(poisonedPrisoner == 0) poisonedPrisoner = n;
        return poisonedPrisoner;
    }

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(5,2,1));
        System.out.println(saveThePrisoner(7,19,2));
        System.out.println(saveThePrisoner(3,7,3));
    }
}
