/*
 * String Type Array
 */
package array2;

/**
 * @author Dragon
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Mango", "Orange", "Pear"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for(String fruit:fruits){
            System.out.print(fruit);
        }
        
        String[] flowers={"Rose","Tulip","Sunflower"};
                for(String flower:flowers){
                    System.out.println(flower);
                }
                
    }
}
