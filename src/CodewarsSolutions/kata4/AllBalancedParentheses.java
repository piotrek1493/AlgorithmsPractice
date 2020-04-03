package CodewarsSolutions.kata4;

/*
Write a function which makes a list of strings representing all of the ways you can balance n pairs of parentheses

Examples
balancedParens(0) returns ArrayList<String> with element:  ""
balancedParens(1) returns ArrayList<String> with element:  "()"
balancedParens(2) returns ArrayList<String> with result: "()()","(())"
balancedParens(3) returns ArrayList<String> with result: "()()()","(())()","()(())","(()())","((()))"
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllBalancedParentheses {
    public static List<String> balancedParens(int n) {
        if(n == 0) return Arrays.asList("");
        if(n == 1) return Arrays.asList("()");

        List<String> result = new ArrayList<>();

        for(String paren : balancedParens(n - 1)) {
            for(int i = 0; i < paren.length(); i++) {
                result.add("()" + paren);
                result.add(paren + "()");
                result.add(paren.substring(0, i) + "()" + paren.substring(i));
                result.add("(" + paren.substring(0, i) + ")" + paren.substring(i));
                result.add("(" + paren.substring(0, i) + paren.substring(i) + ")");
                result.add(paren.substring(0, i) + "(" + paren.substring(i) + ")");
            }
        }

        return result.stream().distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(balancedParens(0));
        System.out.println(balancedParens(1));
        System.out.println(balancedParens(2));
        System.out.println(balancedParens(10));
    }

}
