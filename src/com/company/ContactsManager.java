package com.company;

public class ContactsManager {

    Contact [] myFriends;
    int friendsCount;
//constructor
    ContactsManager(){
        myFriends = new Contact[20];
        friendsCount = 0;
    }

    // Methods:
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].fullName.contains(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}



