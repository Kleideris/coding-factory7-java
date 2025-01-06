package gr.aueb.cf.challenges.tasks12.model;

public class User {
    private long id;
    private String firstname;
    private String lastname;

    //Default constructor
    public User() {}

    //Overloaded constructor
    public User(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //Getters and Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getFirstname() { return firstname;}
    public void setFirstname(String firstname) { this.firstname = firstname;}

    public String getLastname() { return lastname;}
    public void setLastname(String lastname) { this.lastname = lastname;}
}
