package HackerrankSolutions.Easy;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/taum-and-bday/problem
 */

public class TaumBDay {
    public static long taumBday(long b, long w, long bc, long wc, long z) {
        long price;

        if(wc + z < bc) {
            price = (wc + z) * b + w * wc;
        } else if(bc + z < wc) {
            price = (bc + z) * w + b * bc;
        } else {
            price = b * bc + w * wc;
        }
        return price;
    }

    public static void main(String[] args) {
        System.out.println(taumBday(3, 5, 3, 4, 1));
    }
}
