package CodewarsSolutions.kata5;

/*
Sheldon, Leonard, Penny, Rajesh and Howard are in the queue for a "Double Cola" drink vending machine;
there are no other people in the queue. The first one in the queue (Sheldon) buys a can, drinks it and doubles!
The resulting two Sheldons go to the end of the queue. Then the next in the queue (Leonard) buys a can, drinks it
and gets to the end of the queue as two Leonards, and so on.

For example, Penny drinks the third can of cola and the queue will look like this:

Rajesh, Howard, Sheldon, Sheldon, Leonard, Leonard, Penny, Penny
Write a program that will return the name of the person who will drink the n-th cola.

Input
The input data consist of an array which contains at least 1 name, and single integer n which may go as high as the
biggest number your language of choice supports (if there's such limit, of course).

Output / Examples
Return the single line — the name of the person who drinks the n-th can of cola. The cans are numbered starting from 1.

string[] names = new string[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
Line.WhoIsNext(names, 1) == "Sheldon"
Line.WhoIsNext(names, 52) == "Penny"
Line.WhoIsNext(names, 7230702951) == "Leonard"
 */

import java.util.Arrays;

public class DoubleCola {
    public static String whoIsNext(String[] names, int n) {

        int[] line = new int[names.length];
        Arrays.fill(line, 1);

        for(int i = 0; ; line[i] <<= 1, i = (i + 1) % names.length) {
            n -= line[i];
            if(n <= 0) {
                return names[i];
            }
        }
    }

    public static void main(String[] args) {
        String[] test = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        System.out.println(whoIsNext(test, 1));
        System.out.println(whoIsNext(test, 52));
        System.out.println(whoIsNext(test, Integer.MAX_VALUE));
    }

}
