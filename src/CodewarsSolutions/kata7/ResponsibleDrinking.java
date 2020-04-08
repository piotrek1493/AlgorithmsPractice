package CodewarsSolutions.kata7;

/*
Welcome to the Codewars Bar!
Codewars Bar recommends you drink 1 glass of water per standard drink so you're not hungover tomorrow morning.

Your fellow coders have bought you several drinks tonight in the form of a string. Return a string suggesting how many
glasses of water you should drink to not be hungover.

Example parties:
Input 0:
"1 beer"

Output 0:
"1 glass of water"

Explaination 0:
You drank one standard drink

Input 1:
"1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"

Output 1:
"10 glasses of water"

Explaination 1:
You drank ten standard drinks

Note:

To keep the things simple, we'll consider that any "numbered thing" in the string is a drink.
Even "1 bear" => "1 glass of water" or "1 chainsaw and 2 pools" => "3 glasses of water"...
 */

import java.util.ArrayList;
import java.util.List;

public class ResponsibleDrinking {
    public static String hydrate(String drinkString) {

        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < drinkString.length(); i++) {
            if(Character.isDigit(drinkString.charAt(i))) {
                sb.append(drinkString.charAt(i));
                for(int j = i + 1; j < drinkString.length(); j++) {
                    if(Character.isDigit(drinkString.charAt(j))) {
                        sb.append(drinkString.charAt(j));
                    } else {
                        break;
                    }
                }
                list.add(Integer.parseInt(sb.toString()));
                sb = new StringBuilder();
            }
        }

        int result = list.stream().mapToInt(i -> i).sum();

        return result == 1 ? result + " glass of water" : result + " glasses of water";
    }

    public static void main(String[] args) {
        System.out.println(hydrate("1 beer"));
        System.out.println(hydrate("1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"));
    }
}
