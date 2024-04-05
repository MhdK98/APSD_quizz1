package miu.edu.cs489;

import com.google.gson.Gson;
import miu.edu.cs489.model.Contact;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Contact> contacts = Contact.getData();

        String json = new Gson().toJson(contacts);
        System.out.println("Contacts:\n" + json);
    }
}
