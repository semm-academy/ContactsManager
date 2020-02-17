package com.company;

public class Main {

    public static void main(String [] args){
        // Create the ContactsManager object
        ContactsManager myContactsManager = new ContactsManager();
        // Create a new Contact object for Zeliha
        Contact contact1 = new Contact("Zeliha Dogan", "zeliha@gmail.com", "404-404-4040");
        myContactsManager.addContact(contact1);

        // Create a new Contact object for Furkan Akif
        Contact contact2 = new Contact();
        contact2.setFullName("Furkan Akif");
        contact2.setPhoneNumber("123-123-1234");
        contact2.setEmail("furkan@gmail.com");
        myContactsManager.addContact(contact2);

        // Create a new Contact object yusuf
        Contact contact3 = new Contact("Yusuf", "yusuf@gmail.com", "555-123-4567");
        myContactsManager.addContact(contact3);


        // Search for Zeliha  and print his phone number to screen
        Contact result = myContactsManager.searchContact("Zeliha");
        System.out.println(result.getFullName() + ": " + result.getPhoneNumber() + " \n "
        + result.getEmail());

    }
}


