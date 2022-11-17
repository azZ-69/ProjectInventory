package model;

public class User {
    String name;
    int phone_no;

    public String getName() {
        return name;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public User(String name, int phone_no) {
        this.name = name;
        this.phone_no = phone_no;
    }
}
