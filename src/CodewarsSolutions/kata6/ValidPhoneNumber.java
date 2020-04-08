package CodewarsSolutions.kata6;

/*
Write a function that accepts a string, and returns true if it is in the form of a phone number.
Assume that any integer from 0-9 in any of the spots will produce a valid phone number.

Only worry about the following format:
(123) 456-7890 (don't forget the space after the close parentheses)

Examples:

validPhoneNumber("(123) 456-7890")  =>  returns true
validPhoneNumber("(1111)555 2345")  => returns false
validPhoneNumber("(098) 123 4567")  => returns false
 */

public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}");
    }

    public static void main(String[] args) {
        System.out.println(validPhoneNumber("(123) 456-7890"));
        System.out.println(validPhoneNumber("(1111)555 2345"));
        System.out.println(validPhoneNumber("(098) 123 4567"));
    }
}
