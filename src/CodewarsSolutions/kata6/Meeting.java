package CodewarsSolutions.kata6;

/*
John has invited some friends. His list is:

s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
Could you make a program that

makes this string uppercase
gives it sorted in alphabetical order by last name.
When the last names are the same, sort them by first name. Last name and first name of a guest come in the result between parentheses separated by a comma.

So the result of function meeting(s) will be:

"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
It can happen that in two distinct families with the same family name two people have the same first name too.
 */

import java.util.Arrays;

public class Meeting {
    public static String meeting(String s) {
        s = s.toUpperCase();
        String[] fullNames = s.split(";");

        for (int i = 0; i < fullNames.length; i++) {
            fullNames[i] = fullNames[i].substring(fullNames[i].indexOf(':') + 1) + ":" + fullNames[i].substring(0, fullNames[i].indexOf(':'));
        }

        Arrays.sort(fullNames);

        for (int i = 0; i < fullNames.length; i++) {
            fullNames[i] = "(" + fullNames[i].replaceAll(":", ", ") + ")";
        }

        return String.join("", fullNames);
    }

    public static void main(String[] args) {
        String test1 = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        String test2 = "Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn";
        System.out.println(meeting(test1));
        System.out.println(meeting(test2));
    }
}
