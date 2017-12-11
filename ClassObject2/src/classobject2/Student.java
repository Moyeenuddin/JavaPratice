/*
 * student class
 */
package classobject2;

public class Student {

    int stdid;
    String stdname;
    int stdage;
    String stdaddress;

    public void report() {
        System.out.println("Name: " + stdname);
        System.out.println("Address: " + stdaddress);
    }

    public int retirdment() {
        int ret = 65 - stdage;
        return ret;
    }

}
