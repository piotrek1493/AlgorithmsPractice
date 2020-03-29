package CodewarsSolutions.kata4;

/*

Complete the solution so that it strips all text that follows any of a set of comment markers passed in.
Any whitespace at the end of the line should also be stripped out.

Given an input string of:

apples, pears # and bananas
grapes
bananas !apples
The output expected would be:

apples, pears
grapes
bananas
The code would be called like so:

var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
// result should == "apples, pears\ngrapes\nbananas"
 */

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        String[] lines = text.split("\n");

        for(int i = 0; i < lines.length; i++) {
            if(!lines[i].isEmpty()) {
                lines[i] = lines[i].trim();
            }
            for(int j = 0; j < lines[i].length(); j++) {
                for(int k = 0; k < commentSymbols.length; k++) {
                    if(lines[i].substring(j, j + commentSymbols[k].length()).equals(commentSymbols[k])) {
                        lines[i] = lines[i].substring(0, j).trim();
                        break;
                    }
                }
            }
        }

        return String.join("\n", lines);
    }

    public static void main(String[] args) {
        System.out.println(stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}));
        System.out.println(stripComments( "", new String[] { "#", "$" }));
    }
}
