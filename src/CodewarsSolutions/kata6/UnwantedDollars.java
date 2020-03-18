package CodewarsSolutions.kata6;

/*
If you're faced with an input box, like this:

                                           +--------------+
  Enter the price of the item, in dollars: |              |
                                           +--------------+
do you put the $ sign in, or not? Inevitably, some people will type a $ sign and others will leave it out.
The instructions could be made clearer - but that won't help those annoying people who never read instructions anyway.

A better solution is to write code that can handle the input whether it includes a $ sign or not.

So, we need a simple function that converts a string representing a number (possibly with a $ sign in front of it) into the number itself.

Remember to consider negative numbers (the - sign may come either before or after the $ sign, if there is one),
and any extraneous space characters (leading, trailing, or around the $ sign) that the users might put in.
You do not need to handle trailing characters other than spaces (e.g. "1.2 3"). If the given string does not
represent a number, (either with or without a $ sign), return 0.0 .
 */

public class UnwantedDollars {
    public static double moneyValue(String money){
        int digitCount = 0;

        for(int i = 0; i < money.length(); i++) {
            if(Character.isDigit(money.charAt(i))) {
                digitCount++;
            }
        }

        if(digitCount == 0) {
            return 0;
        }

        String str = money.replaceAll("[ $]", "");
        return Double.parseDouble(str);
    }

    public static void main(String[] args) {
        System.out.println(moneyValue("$5.67"));
        System.out.println(moneyValue("12.34"));
        System.out.println(moneyValue("-0.89"));
        System.out.println(moneyValue("-$ 0.1"));
        System.out.println(moneyValue("007"));

    }
}
