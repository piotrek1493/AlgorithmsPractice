package CodewarsSolutions.kata6;

/*
General Objective
The objective of this Kata is to provide some way to encode a string into its leetspeak version.

Specific Instructions
1) The code must contain a Leetspeak class inherited from an Encoder abstract class and containing
an encode(String) method returning itself the encoded String.

2) The encode method should return an empty String if a null parameter is passed.

3) If any uppercase character is given, it should be compared also with the dictionary,
'a' gives '4' but 'A' gives also '4'.

4) If any character outside the dictionary is given, it should be output as is.

Dictionary to reproduce
The following dictionary has to be used :

a -> 4
e -> 3
l -> 1
m -> /^^\
o -> 0
u -> (_)
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

abstract class Encoder{
    public abstract String encode(String source);
}

public class L3375p34k extends Encoder {
    public String encode(String source){
        if(source == null || source.length() == 0) return "";
        List<String> chars = source.chars()
                .mapToObj(Character::toString)
                .collect(Collectors.toList());
        Map<Character, String> dict = new HashMap<>();
        dict.put('a', "4"); dict.put('e', "3"); dict.put('l', "1");
        dict.put('m', "/^^\\"); dict.put('o', "0"); dict.put('u', "(_)");

        for(int i = 0; i < chars.size(); i++) {
            for(Map.Entry<Character, String> entry : dict.entrySet()) {
                if(chars.get(i).toLowerCase().equals(entry.getKey().toString())) {
                    chars.set(i, entry.getValue());
                }
            }
        }

        return String.join("", chars);
    }

    public static void main(String[] args) {
        L3375p34k l3375p34k = new L3375p34k();
        System.out.println(l3375p34k.encode("abcdef"));
        System.out.println(l3375p34k.encode("The objective of this Kata is to provide some" +
                " way to encode a string into its leetspeak version."));
    }
}
