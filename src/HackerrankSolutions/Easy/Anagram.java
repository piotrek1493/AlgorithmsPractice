package HackerrankSolutions.Easy;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/anagram/problem
*/

public class Anagram {
    public static int anagram(String s) {
        int counter = 0;
        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring(s.length()/2);

        if(s.length() % 2 != 0) return -1;

        for(char c : s1.toCharArray()) {
            if(s2.indexOf(c) == -1) {
                counter++;
            } else {
                s2 = s2.substring(0, s2.indexOf(c)) + s2.substring(s2.indexOf(c) + 1);
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(anagram("aaabbb"));
        System.out.println(anagram("ab"));
        System.out.println(anagram("abc"));
        System.out.println(anagram("mnop"));
        System.out.println(anagram("xyyx"));
        System.out.println(anagram("xaxbbbxx"));
    }
}
