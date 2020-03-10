package CodewarsSolutions.kata6;
/*
An orderly trail of ants is marching across the park picnic area.

        It looks something like this:

        ..ant..ant.ant...ant.ant..ant.ant....ant..ant.ant.ant...ant..
        But suddenly there is a rumour that a dropped chicken sandwich has been spotted on the ground ahead. The ants surge forward! Oh No, it's an ant stampede!!

        Some of the slower ants are trampled, and their poor little ant bodies are broken up into scattered bits.

        The resulting carnage looks like this:

        ...ant...ant..nat.ant.t..ant...ant..ant..ant.anant..t
        Can you find how many ants have died?
 */

import java.util.*;
import java.util.stream.Collectors;

public class DeadAnts {

    public static int deadAntCount(final String ants) {
        if(ants == null) return 0;
        String s = ants.replaceAll("ant", "");
        List<Character> list = s.chars().mapToObj(c -> (char)c).filter(Character::isAlphabetic).collect(Collectors.toList());
        if(list.size() == 0) return 0;
        Map<Character, Long> map = list.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        long result = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(deadAntCount(null));
        System.out.println(deadAntCount("ant anantt aantnt"));
        System.out.println(deadAntCount("ant ant ant ant"));
        System.out.println(deadAntCount("...ant...ant..nat.ant.t..ant...ant..ant..ant.anant..t"));
    }

}
