package CodewarsSolutions.kata6;

/*
Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral
representation of that integer.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping
any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

Example:

conversion.solution(1000); //should return "M"
Help:

Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
Remember that there can't be more than 3 identical symbols in a row.
 */

// works for now, going to optimize it sometime in the future
public class RomanNumeralsEncoder {
    public static String solution(int n) {
        String str = String.valueOf(n);
        String[] arr = str.split("");
        String result = "";

        for(int i = 0; i < arr.length; i++) {
            if(!"0".equals(arr[i])) {
                for(int j = 0; j < arr.length - i - 1; j++) {
                    arr[i] += "0";
                }
            }
        }

        if(arr.length == 4){
            if(arr[0].equals("1000")) {
                arr[0] = "M";
            } else if(arr[0].equals("2000")) {
                arr[0] = "MM";
            } else {
                arr[0] = "MMM";
            }

            if(arr[1].equals("100")) {
                arr[1] = "C";
            } else if(arr[1].equals("200")) {
                arr[1] = "CC";
            } else if(arr[1].equals("300")) {
                arr[1] = "CCC";
            } else if(arr[1].equals("400")) {
                arr[1] = "CD";
            } else if(arr[1].equals("500")) {
                arr[1] = "D";
            } else if(arr[1].equals("600")) {
                arr[1] = "DC";
            } else if(arr[1].equals("700")) {
                arr[1] = "DCC";
            } else if(arr[1].equals("800")) {
                arr[1] = "DCCC";
            } else if(arr[1].equals("900")) {
                arr[1] = "CM";
            } else {
                arr[1] = "";
            }

            if(arr[2].equals("10")) {
                arr[2] = "X";
            } else if(arr[2].equals("20")) {
                arr[2] = "XX";
            } else if(arr[2].equals("30")) {
                arr[2] = "XXX";
            } else if(arr[2].equals("40")) {
                arr[2] = "XL";
            } else if(arr[2].equals("50")) {
                arr[2] = "L";
            } else if(arr[2].equals("60")) {
                arr[2] = "LX";
            } else if(arr[2].equals("70")) {
                arr[2] = "LXX";
            } else if(arr[2].equals("80")) {
                arr[2] = "LXXX";
            } else if(arr[2].equals("90")) {
                arr[2] = "XC";
            } else {
                arr[2] = "";
            }

            if(arr[3].equals("1")) {
                arr[3] = "I";
            } else if(arr[3].equals("2")) {
                arr[3] = "II";
            } else if(arr[3].equals("3")) {
                arr[3] = "III";
            } else if(arr[3].equals("4")) {
                arr[3] = "IV";
            } else if(arr[3].equals("5")) {
                arr[3] = "V";
            } else if(arr[3].equals("6")) {
                arr[3] = "VI";
            } else if(arr[3].equals("7")) {
                arr[3] = "VII";
            } else if(arr[3].equals("8")) {
                arr[3] = "VIII";
            } else if(arr[3].equals("9")) {
                arr[3] = "IX";
            } else {
                arr[3] = "";
            }

        } else if(arr.length == 3) {
            if(arr[0].equals("100")) {
                arr[0] = "C";
            } else if(arr[0].equals("200")) {
                arr[0] = "CC";
            } else if(arr[0].equals("300")) {
                arr[0] = "CCC";
            } else if(arr[0].equals("400")) {
                arr[0] = "CD";
            } else if(arr[0].equals("500")) {
                arr[0] = "D";
            } else if(arr[0].equals("600")) {
                arr[0] = "DC";
            } else if(arr[0].equals("700")) {
                arr[0] = "DCC";
            } else if(arr[0].equals("800")) {
                arr[0] = "DCCC";
            } else if(arr[0].equals("900")) {
                arr[0] = "CM";
            } else {
                arr[0] = "";
            }

            if(arr[1].equals("10")) {
                arr[1] = "X";
            } else if(arr[1].equals("20")) {
                arr[1] = "XX";
            } else if(arr[1].equals("30")) {
                arr[1] = "XXX";
            } else if(arr[1].equals("40")) {
                arr[1] = "XL";
            } else if(arr[1].equals("50")) {
                arr[1] = "L";
            } else if(arr[1].equals("60")) {
                arr[1] = "LX";
            } else if(arr[1].equals("70")) {
                arr[1] = "LXX";
            } else if(arr[1].equals("80")) {
                arr[1] = "LXXX";
            } else if(arr[1].equals("90")) {
                arr[1] = "XC";
            } else {
                arr[1] = "";
            }

            if(arr[2].equals("1")) {
                arr[2] = "I";
            } else if(arr[2].equals("2")) {
                arr[2] = "II";
            } else if(arr[2].equals("3")) {
                arr[2] = "III";
            } else if(arr[2].equals("4")) {
                arr[2] = "IV";
            } else if(arr[2].equals("5")) {
                arr[2] = "V";
            } else if(arr[2].equals("6")) {
                arr[2] = "VI";
            } else if(arr[2].equals("7")) {
                arr[2] = "VII";
            } else if(arr[2].equals("8")) {
                arr[2] = "VIII";
            } else if(arr[2].equals("9")) {
                arr[2] = "IX";
            } else {
                arr[2] = "";
            }

        } else if(arr.length == 2) {
            if(arr[0].equals("10")) {
                arr[0] = "X";
            } else if(arr[0].equals("20")) {
                arr[0] = "XX";
            } else if(arr[0].equals("30")) {
                arr[0] = "XXX";
            } else if(arr[0].equals("40")) {
                arr[0] = "XL";
            } else if(arr[0].equals("50")) {
                arr[0] = "L";
            } else if(arr[0].equals("60")) {
                arr[0] = "LX";
            } else if(arr[0].equals("70")) {
                arr[0] = "LXX";
            } else if(arr[0].equals("80")) {
                arr[0] = "LXXX";
            } else if(arr[0].equals("90")) {
                arr[0] = "XC";
            } else {
                arr[0] = "";
            }

            if(arr[1].equals("1")) {
                arr[1] = "I";
            } else if(arr[1].equals("2")) {
                arr[1] = "II";
            } else if(arr[1].equals("3")) {
                arr[1] = "III";
            } else if(arr[1].equals("4")) {
                arr[1] = "IV";
            } else if(arr[1].equals("5")) {
                arr[1] = "V";
            } else if(arr[1].equals("6")) {
                arr[1] = "VI";
            } else if(arr[1].equals("7")) {
                arr[1] = "VII";
            } else if(arr[1].equals("8")) {
                arr[1] = "VIII";
            } else if(arr[1].equals("9")) {
                arr[1] = "IX";
            } else {
                arr[1] = "";
            }
        } else {
            if(arr[0].equals("1")) {
                arr[0] = "I";
            } else if(arr[0].equals("2")) {
                arr[0] = "II";
            } else if(arr[0].equals("3")) {
                arr[0] = "III";
            } else if(arr[0].equals("4")) {
                arr[0] = "IV";
            } else if(arr[0].equals("5")) {
                arr[0] = "V";
            } else if(arr[0].equals("6")) {
                arr[0] = "VI";
            } else if(arr[0].equals("7")) {
                arr[0] = "VII";
            } else if(arr[0].equals("8")) {
                arr[0] = "VIII";
            } else if(arr[0].equals("9")) {
                arr[0] = "IX";
            } else {
                arr[0] = "";
            }
        }

        return String.join("", arr);
    }

    public static void main(String[] args) {
        System.out.println(solution(1989));
        System.out.println(solution(562));
        System.out.println(solution(9));
        System.out.println(solution(149));
        System.out.println(solution(450));
        System.out.println(solution(2020));
    }

}
