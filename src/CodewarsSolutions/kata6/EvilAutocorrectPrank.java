package CodewarsSolutions.kata6;

/*
Your friend won't stop texting his girlfriend. It's all he does. All day. Seriously. The texts are so mushy too!
The whole situation just makes you feel ill. Being the wonderful friend that you are, you hatch an evil plot.
While he's sleeping, you take his phone and change the autocorrect options so that every time he types "you" or "u"
it gets changed to "your sister."

Write a function called autocorrect that takes a string and replaces all instances of "you" or "u" (not case sensitive)
with "your sister" (always lower case).

Return the resulting string.

Here's the slightly tricky part: These are text messages, so there are different forms of "you" and "u".

For the purposes of this kata, here's what you need to support:

"youuuuu" with any number of u characters tacked onto the end
"u" at the beginning, middle, or end of a string, but NOT part of a word
"you" but NOT as part of another word like youtube or bayou
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvilAutocorrectPrank {
    public static String autocorrect(String input) {
        final Pattern patternYou = Pattern.compile("([yY][oO])([uU])+(\\W)*");
        final Pattern patternU = Pattern.compile("\\s*[uU]\\s*");
        final String[] words = input.split("\\s");
        for (int i = 0; i < words.length; i++) {
            final Matcher matcherYou = patternYou.matcher(words[i]);
            final Matcher matcherU = patternU.matcher(words[i]);
            if (matcherYou.matches()) {
                words[i] = matcherYou.replaceAll("your sister$3");
            } else if (matcherU.matches()) {
                words[i] = matcherU.replaceAll("your sister");
            }
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(autocorrect("youuuuu are the best"));
        System.out.println(autocorrect("u and me"));
    }
}
