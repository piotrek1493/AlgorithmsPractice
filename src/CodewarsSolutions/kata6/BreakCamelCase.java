package CodewarsSolutions.kata6;

/*
Complete the solution so that the function will break up camel casing, using a space between words.

Example
solution("camelCasing")  ==  "camel Casing"
 */

public class BreakCamelCase {
    public static String camelCase(String input) {

        StringBuilder sb = new StringBuilder();

        for(char c : input.toCharArray()) {
            sb.append(Character.isUpperCase(c) ? " " + c : c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
        System.out.println(camelCase("camelCasingTest"));
    }
}
