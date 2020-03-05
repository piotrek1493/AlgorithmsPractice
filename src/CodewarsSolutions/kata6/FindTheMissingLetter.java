package CodewarsSolutions.kata6;

/*
#Find the missing letter

Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:

['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'

["a","b","c","d","f"] -> "e"
["O","Q","R","S"] -> "P"
(Use the English alphabet with 26 letters!)

Have fun coding it and please don't forget to vote and rank this kata! :-)

I have also created other katas. Take a look if you enjoyed this kata!
 */

public class FindTheMissingLetter {

    public static char findMissingLetter(char[] array) {

        for(int i = 0; i < array.length - 1; i++) {
            if((int)array[i+1] - (int)array[i] != 1) {
                return (char)((int)array[i] + 1);
            }
        }

        // The array is always "valid", so this statement will never execute anyway.
        return ' ';
    }

    public static void main(String[] args) {

        System.out.println(findMissingLetter(new char[] {'O', 'Q', 'R', 'S'}));
        System.out.println(findMissingLetter(new char[] {'a', 'b', 'c', 'd', 'f'}));

    }

}
