/*
 * Class and Object Practiece
 */
package classobjectpractice;

/**
 * @author Dragon
 */
public class ClassObjectPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Moyeen";
        person1.age = 27;
        person1.address = "Dhaka";
        person1.introduce();

        Person person2 = new Person();
        person2.name = "rakib";
        person2.age = 222;
        person2.address = "Dhaka";
        person2.introduce();
    }

}
