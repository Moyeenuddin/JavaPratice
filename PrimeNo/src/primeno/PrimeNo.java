/*
 * PRINT ALL PRIME NO IN THE GIVEN RANGE
 */
package primeno;

import java.util.Scanner;

public class PrimeNo {

    static Scanner hp = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        System.out.println("put number");
        number = hp.nextInt();
        //System.out.println(primeNumber(number));
        primeNumber(number);
    }

    public static void primeNumber(int number) {
        int pnumber, divisor, k;
        System.out.println("1");
        for (pnumber = 2; pnumber <= number; pnumber++) {

            for (divisor = 2; divisor < pnumber; divisor++) {
                k = pnumber % divisor;
                if (k == 0) {
                    break;
                }
                if (divisor == (pnumber - 1)) {
                    System.out.println(pnumber);
                }

            }

        }

    }
}
