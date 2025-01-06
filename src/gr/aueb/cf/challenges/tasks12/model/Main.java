package gr.aueb.cf.challenges.tasks12.model;

public class Main {

    public static void main(String[] args) {
        User chris = new User(25555, "chris", "kleideris");
        UserCredentials adm = new UserCredentials(99999, "admin", "temp");
        int a = 0;

        System.out.println("User fields:  id = " + chris.getId() +
                ", firstname = \"" + chris.getFirstname() + "\"" +
                ", lastname = \"" + chris.getLastname() + "\"");

        System.out.println("UserCredential fields:  id = " + adm.getId() +
                ", firstname = \"" + adm.getFirstname() + "\"" +
                ", lastname = \"" + adm.getLastname() + "\"");
    }
}
