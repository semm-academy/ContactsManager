package com.company;

public class MainO {
    public static void main(String[] args) {
        ContactManagerO myContactManagerO = new ContactManagerO();
        ContactO contactO1 = new ContactO("Onur", 2148540466, "onurkasaburi@gmail.com");
        myContactManagerO.addContactManagerO(contactO1);
    }
}