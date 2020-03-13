package CodewarsSolutions.kata5;

public class MaximumSubarraySum {
    public static int sequence(int[] arr) {

        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

    }

}
