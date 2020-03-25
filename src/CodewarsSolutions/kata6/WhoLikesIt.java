package CodewarsSolutions.kata6;

/*
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items.
We want to create the text that should be displayed next to such an item.

Implement a function likes :: [String] -> String, which must take in input array, containing the names of people who like
an item. It must return the display text as shown in the examples:

likes {} // must be "no one likes this"
likes {"Peter"} // must be "Peter likes this"
likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
For 4 or more names, the number in and 2 others simply increases.
 */

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        String answer = "";

        switch(names.length) {
            case 0: return "no one likes this";
            case 1: return names[0] + " likes this";
            case 2: answer += names[0] + " and " + names[1]; break;
            case 3: answer += names[0] + ", " + names[1] + " and " + names[2]; break;
            default: answer += names[0] + ", " + names[1] + " and " + (names.length - 2) + " others";
        }
        return answer + " like this";
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Jake"));
        System.out.println(whoLikesIt("Jake", "Alex"));
        System.out.println(whoLikesIt("Peter", "Jake", "Alex"));
        System.out.println(whoLikesIt("Peter", "Jake", "Alex", "Max"));

    }
}
