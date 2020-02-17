package com.company;

import java.util.ArrayList;
import java.util.List;

public class ContactsManager {
    List<Contact> myFriends;

    // Constructor
    ContactsManager(){
        myFriends = new ArrayList<>();
    }

    // Methods:
    void addContact(Contact contact){
        myFriends.add(contact);
    }

    Contact searchContact(String searchName){
        for(Contact friend : myFriends){
            if(friend.getFullName().contains(searchName)){
                return friend;
            }
        }
        return null;
    }
}



