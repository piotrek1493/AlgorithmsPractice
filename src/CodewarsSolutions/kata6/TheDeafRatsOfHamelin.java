package CodewarsSolutions.kata6;

/*
The Pied Piper has been enlisted to play his magical tune and coax all the rats out of town.

But some of the rats are deaf and are going the wrong way!

Kata Task
How many deaf rats are there?

Legend
P = The Pied Piper
O~ = Rat going left
~O = Rat going right
Example
ex1 ~O~O~O~O P has 0 deaf rats
ex2 P O~ O~ ~O O~ has 1 deaf rat
ex3 ~O~O~O~OP~O~OO~ has 2 deaf rats
 */

import java.util.Arrays;

public class TheDeafRatsOfHamelin {
    public static int countDeafRats(final String town) {
        int deafRats = 0;

        String cleanUp = town.replaceAll(" ", "");
        String firstHalf = cleanUp.substring(0, cleanUp.indexOf('P'));
        String secondHalf = cleanUp.substring(cleanUp.indexOf('P') + 1);

        if (firstHalf.length() >= 2) {
            for (int i = 0; i < firstHalf.length(); i += 2) {
                if (firstHalf.substring(i, i + 2).equals("O~")) {
                    deafRats++;
                }
            }
        }

        if (secondHalf.length() >= 2) {
            for (int i = 0; i < secondHalf.length(); i += 2) {
                if(secondHalf.substring(i, i + 2).equals("~O")) {
                    deafRats++;
                }
            }
        }

        return deafRats;
    }

    public static void main(String[] args) {
        System.out.println(countDeafRats("~O~O~O~O P"));
        System.out.println(countDeafRats("P O~ O~ ~O O~"));
        System.out.println(countDeafRats("~O~O~O~OP~O~OO~"));
    }
}
