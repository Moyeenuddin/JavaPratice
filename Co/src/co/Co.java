// Class object

package co;

public class Co {

    public static void main(String[] args) {
        
    Student student1=new Student();
    student1.setStudentID(123);
    student1.setStudentName("Moyeen");
    student1.setStudentAddress("Khulna");
    student1.setStudentDept("IT");
    
    System.out.println("Student ID= "+student1.getStudentID());
    System.out.println("Student Name= "+student1.getStudentName());
    System.out.println("Student Address= "+student1.getStudentAddress());
    System.out.println("Student Dwpt= "+student1.getStudentDept()+"\n");
    
    Student student2=new Student();
    student2.setStudentID(124);
    student2.setStudentName("Tanvir");
    student2.setStudentAddress("Dhaka");
    student2.setStudentDept("IT");
    
    System.out.println("Student ID= "+student2.getStudentID());
    System.out.println("Student Name= "+student2.getStudentName());
    System.out.println("Student Address= "+student2.getStudentAddress());
    System.out.println("Student Dwpt= "+student2.getStudentDept()+"\n");
    
    Student student3=new Student();
    student3.setStudentID(125);
    student3.setStudentName("Suffian");
    student3.setStudentAddress("Nowga");
    student3.setStudentDept("IT");
    
    System.out.println("Student ID= "+student3.getStudentID());
    System.out.println("Student Name= "+student3.getStudentName());
    System.out.println("Student Address= "+student3.getStudentAddress());
    System.out.println("Student Dwpt= "+student3.getStudentDept()+"\n");

    }
    
}
