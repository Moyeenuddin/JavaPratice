package test11;

import java.util.Scanner;

public class Test11 {

    static Scanner hp = new Scanner(System.in);

    public static void main(String[] args) {

        int sp ; //sp=Subtotal point
        int sum = 0;
        System.out.println("for which point u want the subtotal ?");
        sp = hp.nextInt(); //sp=Subtotal point
        
        for (int i = 1; i <= 100; i++) {

            System.out.println(i);

            if (i == sp) {
                System.out.println("Subtotal untill now:   " + summation(i));
            }
        }
    }

    public static int summation(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {

            sum = sum + i;

        }
        return sum;
    }
}
