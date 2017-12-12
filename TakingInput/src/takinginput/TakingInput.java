package takinginput;

import java.util.Scanner;

public class TakingInput {

    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in); //creat scanner object
        System.out.println("please input something here:");
        String line = myinput.nextLine();       //taking a line of text from user
        System.out.println("You have entered:" + line);
        System.out.println("please input a number here:");
        int myint = myinput.nextInt();
        System.out.println("You have entered:" + myint);
        System.out.println("please input a Fraction number here:");
        double myDouble = myinput.nextDouble();
        System.out.println("You have entered:" + myDouble);

    }

}
