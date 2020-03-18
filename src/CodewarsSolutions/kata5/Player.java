package CodewarsSolutions.kata5;

/*
Welcome Warrior! Let's play a game!

You've gotten challenged by a lot of kata, now it's time for you to challenge the kata!

Inside a room, there is a table with a pile of cakes. One of these cakes is filled with poison. Every turn, we will take cakes
from this pile and eat them, leaving the last one to be the poisonous cake. Whoever eats the poisonous cake will die. The poisonous
cake is clearly marked, so you do not have to guess. Rather you need to rely on your logic to save you.

The rules are simple:
Do not eat the last cake. It's obivious that poisonous cake will be the last to be eaten, so, DON'T EAT THE LAST CAKE.
Try to make your opponent eat it.

When it is your turn, you can only take one, two or three cakes. The same rules apply to your opponent on there turn.
You cannot skip your move, so choose wisely how many cakes to eat. Both opponents will be able to see how many cakes the other eats on each turn.

You cannot copy your opponent's previous move, likewise they cannot copy yours. If your opponent takes one cake, next move
you can only choose between two or three. If you take three cakes, your opponent can only choose one or two. This doesn't effect
the first move, only to subsequent.

If one of the players has no valid moves (e.g one cake left and previous move was one cake), that player will lose his turn and
be skipped. Then the other player will be forced to eat the last cake. This is the ONLY case of turn skipping.

You can choose whether or not to go first. This decision is key to victory, so don't hurry, choose wisely!

Task of this kata:
To solve this kata, you should write class called Player. This class has one constructor and two other functions:

Each test is a different game and different instance of the Player class. You should not worry about calling functions,
you should only watch the number of cakes on table and decide on every move how many to take, and decide who moves first.

Write your Player class and beat your opponent! You must figure out a strategy that can guarantee you a victory.

Example of game:
12 cakes on the table. You decided to move first.

You ate 1 cake, 11 cakes left

Opponent ate 3 cakes, 8 cakes left

You ate 2 cakes, 6 cakes left

Opponent ate 1 cake, 5 cakes left

You ate 3 cakes, 2 cakes left

Opponent has no winning choice. If he eats 2 cakes, he will lose. If he eats 1 cake, you will be left in stalemate situation,
and he will again eat 1 cake and lose.

You win.
 */

public class Player {
    public Player(int cakes) {
    }

    public boolean firstMove(int cakes) {
        if(cakes > 2) {
            if(cakes % 4 != 2) {
                return true;
            }
        }
        return false;
    }

    public int move(int cakes, int last) {
        int rest = cakes % 4;
        if(rest < 3) {
            return 3;
        } else {
            return 1;
        }
    }
}
