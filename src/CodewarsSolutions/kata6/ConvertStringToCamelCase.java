package CodewarsSolutions.kata6;

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word
within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case,
also often referred to as Pascal case).

Examples
toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"

toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
 */

public class ConvertStringToCamelCase {
    static String toCamelCase(String s){

        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < sb.length() - 1; i++) {
            if(sb.charAt(i) == '-') {
                sb.deleteCharAt(i);
                sb.replace(i, i+1, sb.substring(i, i+1).toUpperCase());
            }
            if(sb.charAt(i) == '_') {
                sb.deleteCharAt(i);
                sb.replace(i, i+1, sb.substring(i, i+1).toUpperCase());
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior")); // returns "theStealthWarrior"
        System.out.println(toCamelCase("The_Stealth_Warrior")); // returns "TheStealthWarrior"
    }
}
