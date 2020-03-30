package CodewarsSolutions.kata6;

/*
The rules are simple:
Do not eat the last cake. It's obivious that poisonous cake will be the last to be eaten, so, DON'T EAT THE LAST CAKE.
Try to make your opponent eat it.

When it is your turn, you can only take one, two or three cakes. The same rules apply to your opponent on there turn.
You cannot skip your move, so choose wisely how many cakes to eat. Both opponents will be able to see how many cakes
the other eats on each turn.

You cannot copy your opponent's previous move, likewise they cannot copy yours. If your opponent takes one cake, next
move you can only choose between two or three. If you take three cakes, your opponent can only choose one or two. This
doesn't effect the first move, only to subsequent.

If one of the players has no valid moves (e.g one cake left and previous move was one cake), that player will lose his
turn and be skipped. Then the other player will be forced to eat the last cake. This is the ONLY case of turn skipping.

You can choose whether or not to go first. This decision is key to victory, so don't hurry, choose wisely!

Task of this kata:
To solve this kata, you should write class called Player. This class has one constructor and two other functions.

Example:
public class Player {
  Player(int cakes) {
  }
  // Decide who moves first - player or opponent (return true if player)
  boolean firstMove(int cakes) {
    // I wish to move first
    return true;
  }
  // Decide your next move (return 1, 2 or 3)
  int move(int cakes, int last) {
    // I'm not greedy
    return last == 1 ? 2 : 1;
  }
}.
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
