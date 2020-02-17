package com.company;

public class Contact {
    private String fullName;
    private String email;
    private String phoneNumber;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    Contact() {
        fullName = null;
        email = null;
        phoneNumber = null;
    }

    public Contact(String name, String email, String phoneNumber) {
        this.fullName = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}


