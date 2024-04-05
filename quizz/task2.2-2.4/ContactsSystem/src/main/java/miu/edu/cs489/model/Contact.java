package miu.edu.cs489.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contact {


    public static List<Contact> getData(){
        return Arrays.asList(
                new Contact(1, "David", "Sanger", "Argos LLC", "Sales Manager",
                        Arrays.asList(new PhoneNumber(1, "240-133-0011", "Home"),
                                new PhoneNumber(2, "240-112-0123", "Mobile")),
                        Arrays.asList(new EmailAddress(1, "dave.sang@gmail.com", "Home"),
                                new EmailAddress(2, "dsanger@argos.com", "Work"))),
                new Contact(2, "Carlos", "Jimenez", "Zappos", "Director",new ArrayList<>(),new ArrayList<>()),
                new Contact(3, "Ali", "Gafar", "BMI Services", "HR Manager",
                        Arrays.asList(new PhoneNumber(3, "412-116-9988", "Work")),
                        Arrays.asList(new EmailAddress(3, "ali@bmi.com", "Work")))
        );
    }

    public int id;
    public String firstName;
    public String lastName;
    public String company;
    public String jobTitle;
    public List<PhoneNumber> numbers;
    public List<EmailAddress> emails;

    public Contact() {
    }

    public Contact(int id, String firstName, String lastName, String company, String jobTitle, List<PhoneNumber> numbers, List<EmailAddress> emails) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.numbers = numbers;
        this.emails = emails;
    }
}
