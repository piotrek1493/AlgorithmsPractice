package CodewarsSolutions.kata5;

/*
Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
 */

public class SimplePigLatin {
    public static String pigIt(String str) {
        String[] words = str.split("\\s");
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words[i].length(); j++) {
                if(words[i].matches("^[a-zA-Z]+$")) {
                    words[i] = words[i].substring(1) + words[i].substring(0, 1) + "ay";
                    break;
                }
            }
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello World !"));
        System.out.println(pigIt("This is my string"));
        System.out.println(pigIt("I am a god"));
    }
}
