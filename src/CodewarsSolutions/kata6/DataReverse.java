package CodewarsSolutions.kata6;

/*
A stream of data is received and needs to be reversed.

Each segment is 8 bits long, meaning the order of these segments needs to be reversed, for example:

11111111  00000000  00001111  10101010
 (byte1)   (byte2)   (byte3)   (byte4)
should become:

10101010  00001111  00000000  11111111
 (byte4)   (byte3)   (byte2)   (byte1)
The total number of bits will always be a multiple of 8.

The data is given in an array as such:

[1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]
Note: In the C and NASM languages you are given the third parameter which is the number of segment blocks.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataReverse {
    public static int[] dataReverse(int[] data) {

        List<String> list = new ArrayList<>();

        for(int i = 0; i < data.length; i++) {
            list.add(String.valueOf(data[i]));
        }

        List<String> result = new ArrayList<>();
        for(int i = 0; i < list.size(); i+=8){
            String s = "";
            for(int j = i; j < i + 8; j++) {
                s += list.get(j);
            }
            result.add(s);
        }

        Collections.reverse(result);

        int totalLen = 0;

        for(int i = 0; i < result.size(); i++){
            totalLen += result.get(i).length();
        }

        int[] resultArr = new int[totalLen];

        String str = result.toString();
        str = str.substring(1, str.length() - 1).replaceAll(",", "").replaceAll(" ", "");

        for(int i = 0; i < resultArr.length; i++) {
            resultArr[i] = Integer.valueOf(Character.toString(str.charAt(i)));
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(dataReverse(test1)));
    }

}
