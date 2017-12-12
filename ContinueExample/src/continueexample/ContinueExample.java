/**
 * Java Continue Statement Example
 */
package continueexample;

public class ContinueExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
    }
}
