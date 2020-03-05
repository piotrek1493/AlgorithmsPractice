package CodewarsSolutions.kata6;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

Note: If the number is a multiple of both 3 and 5, only count it once.
 */

public class MultiplesOf3And5 {

    public static int solution(int number) {
        int sum = 0;
        for(int i = number - 1; i >= 3; i--) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int num = 23;
        int num1 = 10;
        int num2 = 999;

        System.out.println(solution(num));
        System.out.println(solution(num1));
        System.out.println(solution(num2));

    }

}
