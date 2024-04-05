package miu.edu.cs489.model;

public class EmailAddress {

    public int id;
    public String email;
    public String label;

    public EmailAddress() {
    }

    public EmailAddress(int id, String email, String label) {
        this.id = id;
        this.email = email;
        this.label = label;
    }
}
