package HackerrankSolutions.Easy;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/caesar-cipher-1/problem
 */

public class CaesarCipher {
    static String caesarCipher(String s, int k) {
        char[] arr = s.toCharArray();

        k %= 26;

        for(int i = 0; i < arr.length; i++) {
            int num = 0;
            int ch = arr[i];

            if(ch >= 65 && ch <= 90) {
                num = (int)arr[i] + k;
                if(num > 90) {
                    num -= 26;
                }
                arr[i] = (char)num;
            } else if(ch >= 97 && ch <= 122) {
                num = (int)arr[i] + k;
                if(num > 122) {
                    num -= 26;
                }
                arr[i] = (char)num;
            }
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("Hello, everyone!", 3));
    }
}
