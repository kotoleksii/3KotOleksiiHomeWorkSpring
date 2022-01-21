package org.example.Task1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("${user.ID}")
    private int ID;
    @Value("${user.firstName}")
    private String firstName;
    @Value("${user.lastName}")
    private String lastName;
    @Value("${user.phone}")
    private String phone;
    @Value("${user.email}")
    private String email;
    @Value("${user.post}")
    private String post;

    public int getID() {
        System.out.println("getID()");
        System.out.println("---------------------------------------------------------------");
        return ID;
    }

    public void setID(int ID) {
        System.out.println("setID()");
        System.out.println("---------------------------------------------------------------");
        this.ID = ID;
    }

    public String getFirstName() {
        System.out.println("getFirstName()");
        System.out.println("---------------------------------------------------------------");
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("setFirstName()");
        System.out.println("---------------------------------------------------------------");
        this.firstName = firstName;
    }

    public String getLastName() {
        System.out.println("getLastName()");
        System.out.println("---------------------------------------------------------------");
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println("setLastName()");
        System.out.println("---------------------------------------------------------------");
        this.lastName = lastName;
    }

    public String getPhone() {
        System.out.println("getPhone()");
        System.out.println("---------------------------------------------------------------");
        return phone;
    }

    public void setPhone(String phone) {
        System.out.println("setPhone()");
        System.out.println("---------------------------------------------------------------");
        this.phone = phone;
    }

    public String getEmail() {
        System.out.println("getEmail()");
        System.out.println("---------------------------------------------------------------");
        return email;
    }

    public void setEmail(String email) {
        System.out.println("setEmail()");
        System.out.println("---------------------------------------------------------------");
        this.email = email;
    }

    public String getPost() {
        System.out.println("getPost()");
        System.out.println("---------------------------------------------------------------");
        return post;
    }

    public void setPost(String post) {
        System.out.println("setFirstName()");
        System.out.println("---------------------------------------------------------------");
        this.post = post;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
