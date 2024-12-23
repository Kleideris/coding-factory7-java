package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student();                                    // Invoke Default Constructor
        Student bob = new Student(2, "Bob", "D.");      // Invoke Overloaded Constructor and populate instance

        student.setId(1);                                                    //student.id = 1;
        student.setFirstname("Alice");                                       //student.firstname = "Alice";
        student.setLastname("W.");                                           //student.lastname = "W.";

        System.out.println("id: " + student.getId());
        System.out.println("firstname: " + student.getFirstname());
        System.out.println("lastname: " + student.getLastname());

        System.out.println("id: " + bob.getId());
        System.out.println("firstname: " + bob.getFirstname());
        System.out.println("lastname: " + bob.getLastname());

        System.out.println("Students instances' count: " + Student.getStudentsCount());

//        System.out.println("id: " + student.id);
//        System.out.println("firstname: " + student.firstname);
//        System.out.println("lastname: " + student.lastname);
    }
}