/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classobject2;

/**
 * @author Dragon
 */
public class ClassObject2 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.stdid = 101;
        student1.stdname = "Moyeen";
        student1.stdage = 33;
        student1.stdaddress="khulna";

        Student student2 = new Student();
        student2.stdid=102;
        student2.stdname="Hamza";
        student2.stdage=44;
        student2.stdaddress="dhaka";
        
        student1.report();
        
        System.out.println(student1.retirdment());
        
        int ret=student2.retirdment();
        System.out.println(ret);
    }

}
