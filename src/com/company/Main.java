package com.company;

public class Main {

    public static void main(String [] args){
        // Create the ContactsManager object
        ContactsManager myContactsManager = new ContactsManager();
        // Create a new Contact object for Zeliha
        Contact contact1 = new Contact();
        contact1.fullName = "Zeliha Dogan";
        contact1.phoneNumber = "404-404-4040";
        contact1.email = "zeliha@gmail.com";
        myContactsManager.addContact(contact1);

        // Create a new Contact object for Furkan Akif
        Contact contact2 = new Contact();
        contact2.fullName= "Furkan Akif";
        contact2.phoneNumber = "123-123-1234";
        contact2.email="furkan@gmail.com";
        myContactsManager.addContact(contact2);

        // Create a new Contact object yusuf
        Contact contact3 = new Contact();
        contact3.fullName = "Yusuf";
        contact3.phoneNumber = "555-123-4567";
        contact3.email = "yusuf@gmail.com";
        myContactsManager.addContact(contact3);



        // Search for Zeliha  and print his phone number to screen
        Contact result = myContactsManager.searchContact("Zeliha");
        System.out.println(result.fullName + ": " + result.phoneNumber + " \n "
        + result.email);

    }
}


