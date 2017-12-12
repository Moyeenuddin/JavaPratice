/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classobject3;

public class ClassObject3 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.id = 1;
        car1.model = "Gallado";
        car1.brand = "Lamborghini";
        car1.year = 2013;

        Car car2 = new Car();
        car2.id = 2;
        car2.model = "Chiron";
        car2.brand = "Bugati";
        car2.year = 2017;

        car1.report();
        car2.report();

    }

}
