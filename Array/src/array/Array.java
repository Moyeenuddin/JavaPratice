/*
 * Array
 */
package array;

/**
 * @author Dragon
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] number;
        number = new int[5];

        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;

        System.out.print(number[0]);
        System.out.print(number[1]);
        System.out.print(number[2]);
        System.out.print(number[3]);
        System.out.print(number[4]);

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);

        }

        int[] myarray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < myarray.length; i++) {
            System.out.print(myarray[i]);
        }

        for (int varray : myarray) {
            System.out.println(myarray[varray]);

        }

    }

}
