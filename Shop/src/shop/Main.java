/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

/**
 *
 * @author Dragon
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Decide the number of friends
        System.out.print("Enter how many Product: ");
        int numOfProducts = Integer.parseInt(scan.nextLine());

        //Create a string array to store the names of Products
        String arrayOfNames[] = new String[numOfProducts];
        String arrayOfQuantity[] = new String[numOfProducts];
        String arrayOfPrice[] = new String[numOfProducts];

        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.print("Enter the name of Product " + (i+1) + " : ");
            arrayOfNames[i] = scan.nextLine();
            System.out.print("Enter the Quantity of Product " + (i+1) + " : ");
            arrayOfQuantity[i] = scan.nextLine();
            System.out.print("Enter the Price of Product " + (i+1) + " : ");
            arrayOfPrice[i] = scan.nextLine();
        }

        //Now show your Product name one by one
        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.print("Product " + (i+1) + " : ");
            System.out.print(arrayOfNames[i] );
            System.out.print("  Quantity: "+(arrayOfQuantity[i] ));
            int quantity = Integer.parseInt(arrayOfQuantity[i]);
            System.out.print("  Price: "+(arrayOfPrice[i] ));
            int price = Integer.parseInt(arrayOfPrice[i]);
            System.out.print("  Total= "+(price*quantity)+ "\n");
        }



    }

}
