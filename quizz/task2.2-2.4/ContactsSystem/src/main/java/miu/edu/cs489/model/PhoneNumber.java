package miu.edu.cs489.model;

public class PhoneNumber {

    public int id;
    public String phoneNo;
    public String label;

    public PhoneNumber() {
    }

    public PhoneNumber(int id, String phoneNo, String label) {
        this.id = id;
        this.phoneNo = phoneNo;
        this.label = label;
    }
}
