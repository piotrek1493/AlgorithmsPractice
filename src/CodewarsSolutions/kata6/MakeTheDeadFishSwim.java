package CodewarsSolutions.kata6;

import java.util.Arrays;

/*
        Write a simple parser that will parse and run Deadfish.

        Deadfish has 4 commands, each 1 character long:

        i increments the value (initially 0)
        d decrements the value
        s squares the value
        o outputs the value into the return array
        Invalid characters should be ignored.

        Deadfish.parse("iiisdoso") =- new int[] {8, 64};
*/
public class DeadFish {

    public static int[] parse(String data) {
        int len = 0;

        for(int i = 0; i < data.length(); i++) {
            if(data.charAt(i) == 'o') {
                len++;
            }
        }

        int[] result = new int[len];
        int index = 0;

        int temp = 0;
        for(int i = 0; i < data.length(); i++) {
            if(data.charAt(i) == 'i') temp++;
            else if(data.charAt(i) == 'd') temp--;
            else if(data.charAt(i) == 's') temp = temp*temp;
            else if(data.charAt(i) == 'o') result[index++] = temp;
        }
        return result;
    }

    public static void main(String[] args) {

        String test1 = "iiisdoso";
        String test2 = "iiisdosodddddiso";

        System.out.println(Arrays.toString(parse(test1)));
        System.out.println(Arrays.toString(parse(test2)));

    }

}
