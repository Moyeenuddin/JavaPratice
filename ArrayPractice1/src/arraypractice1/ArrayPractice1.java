/*
 * array practiece 
 */
package arraypractice1;

/**
 * @author Moyeen
 */
public class ArrayPractice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] mynumbers = {3, 5, 7, 9, 6};
        String[] drinks = {"Cocacola", "Fanta", "Rc", "7up"};

        for (int mynumber : mynumbers) {
            System.out.println(mynumber);
        }

        for (String drink : drinks) {
            System.out.println(drink);
        }

    }

}
