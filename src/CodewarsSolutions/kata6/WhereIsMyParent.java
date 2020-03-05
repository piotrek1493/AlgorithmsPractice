package CodewarsSolutions.kata6;

import java.util.*;
import java.util.stream.Collectors;

/*
Mothers arranged a dance party for the children in school. At that party, there are only mothers and their children.
All are having great fun on the dance floor when suddenly all the lights went out. It's a dark night and no one can see each other.
But you were flying nearby and you can see in the dark and have ability to teleport people anywhere you want.

Legend:
-Uppercase letters stands for mothers, lowercase stand for their children, i.e. "A" mother's children are "aaaa".
-Function input: String contains only letters, uppercase letters are unique.
Task:
Place all people in alphabetical order where Mothers are followed by their children, i.e. "aAbaBb" => "AaaBbb".
 */


public class WhereIsMyParent {

    private static final String STR1 = "aAbaBb";
    private static final String STR2 = "xXfuUuuF";

    static String findChildren(final String text) {

        char[] ca = text.toCharArray();
        Arrays.sort(ca);
        List<Character> list = new ArrayList<>();
        List<Character> result = new ArrayList<>();

        for(char c : ca) {
            list.add(c);
        }

        for(int i = 0; i < list.size(); i++) {
            if(Character.isUpperCase(list.get(i))) {
                result.add(list.get(i));
                for(int j = i + 1; j < list.size(); j++) {
                    if(Character.toString(list.get(j)).equals(Character.toString(list.get(i)).toLowerCase())) {
                        result.add(list.get(j));
                    }
                }
            }
        }
        return result.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(findChildren(STR1));
        System.out.println(findChildren(STR2));
    }

}
