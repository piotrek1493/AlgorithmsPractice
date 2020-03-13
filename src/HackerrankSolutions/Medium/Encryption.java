package HackerrankSolutions.Medium;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/encryption/problem
 */

public class Encryption {
    static String encryption(String s){

        StringBuilder sb = new StringBuilder();
        int len = s.length();

        int row = (int)Math.floor(Math.sqrt(s.length()));
        int column = (int)Math.ceil(Math.sqrt(s.length()));

        for(int i = 0; i < column; i++){
            for(int j = i; j < len; j += column ){
                sb.append(s.charAt(j));
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(encryption("haveaniceday"));
        System.out.println(encryption("feedthedog"));
        System.out.println(encryption("chillout"));

    }
}
