package HackerrankSolutions.Easy;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */

public class DayOfTheProgrammer {
    static String dayOfProgrammer(int year) {

        String result = "";

        if(year < 1918) {
            result += (year % 4 == 0) ? "12.09." + year : "13.09." + year;
        } else if(year == 1918) {
            result += "26.09." + year;
        } else {
            result += ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? "12.09." + year : "13.09." + year;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1917));
        System.out.println(dayOfProgrammer(1918));
    }

}
