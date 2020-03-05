package CodewarsSolutions.kata6;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindTheParityOutlier {

    static int find(int[] integers) {

        int oddCount = 0, evenCount = 0;

        for(int i = 0; i < 3; i++) {
            if(integers[i] % 2 == 0) evenCount++;
            if(integers[i] % 2 != 0) oddCount++;
        }

        if(oddCount > evenCount) {
            for (int integer : integers) {
                if (integer % 2 == 0) return integer;
            }
        } else {
            for (int integer : integers) {
                if (integer % 2 == 1) return integer;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[] {2, 4, 0, 100, 4, 11, 2602, 36}));
        System.out.println(find(new int[] {160, 3, 1719, 19, 11, 13, -21}));
    }

}
