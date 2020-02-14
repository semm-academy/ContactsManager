# ContactsManager

The Contacts Manager
Assume you're writing a Java program that's responsible for storing and managing all your friends' contact information.

We'll start by creating a class that's responsible for storing all contact information of a single person, it will look something like this:

    class Contact{
       String name;
       String email;
       String phoneNumber;
    }

All fields, no methods, since a contact object itself won't be "doing" much actions itself in the scope of this program, it's merely a slightly more advanced data type that can store a few strings in 1 variable.

Next, let's create the class that will be in charge of adding and searching for contacts. Since it will be managing all the contacts, I'll call it **ContactsManager**:

    class ContactsManager {
    }
    
This class will be storing the contacts in an array, which means one of its fields will be an array of Contacts, another field will be an **int** representing the number of friends added to the array, this **int** will help us know where in the array was the last contact added so we can continue to add more contacts into the array later as we will see.

This is what the class will look like after adding the fields

    class ContactsManager {
       // Fields:
       Contact [] myFriends;
       int friendsCount;
    }

Okay, now let's create a default constructor that will initialize those fields.

    class ContactsManager {
       // Fields:
       Contact [] myFriends;
       int friendsCount;
       // Constructor:
       ContactsManager(){
          this.friendsCount = 0;
          this.myFriends = new Contact[500];
       }
    }

The **friendsCount** starts from 0 and will increment every time we add a new contact later.

The Contact array **myFriends** (just like any array) needs to be initialized using the **new** keyword and we chose to reserve enough space in the array to store up to 500 contacts.

Next, let's start adding methods to the **ContactsManager** class that allows adding and searching for contacts in the array.

# The ContactsManager class methods

The first method we will create in the ContactsManager class is the **addContact** method which will add a Contact object to the Contact array **myFriends**:

    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
    
The method **addContact** takes a Contact object as an input parameter, and uses the **friendsCount** value to fill that slot in the array with the contact that was passed into the method.

Then, since we need to move that counter to point to the following slot in the array, we increment **friendsCount** using the increment operation **++**

Now, let's add another method called **searchContact** that will search through the array using a name String and return a Contact object once a match is found:

    Contact searchContact(String searchName){
       for(int i=0; i<friendsCount; i++){
          if(myFriends[i].name.equals(searchName)){
             return myFriends[i];
          }
       }
       return null;
    }

This method loops over the array, and for each element **myFriends[i]** it compares the **name** field to the **searchName** value using this **if** statment:

    if(myFriends[i].name.equals(searchName))
    
This **if** statement will evaluate to true if the **searchName** is equal to the **name** field in the Contact stored in **myFriends[i]**

If it was a match, the loop will return the matching Contact object **myFriends[i]**. Otherwise. it will return null indicating that it could not find that contact.

Putting all this together, our **ContactsManager** class will look like this:

    class ContactsManager {
       // Fields:
       Contact [] myFriends;
       int friendsCount;

       // Constructor:
       ContactsManager(){
          friendsCount = 0;
          myFriends = new Contact[500];
       }

       // Methods:
       void addContact(Contact contact){
          myFriends[friendsCount] = contact;
          friendsCount++;
       }

       Contact searchContact(String searchName){
          for(int i=0; i<friendsCount; i++){
             if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
             }
          }
          return null;
       }
    }

To be able to run this program, we need the **main** method, so let's create another class called Main that will hold this method:

    class Main {
       public static void main(String [] args){
          ContactManager myContactManager = new ContactManager();
       }
    }
    
This means that once this program runs, the main method will start which will create the ContactManager object **myContactManager** and thus ready to be used.

However, if you go ahead and run this program nothing will appear because we we haven't created the logic to ask the user for adding or searching contacts yet.

Later on in this course, we will see how to read input from the user to make this program more powerful.

# QUIZ

Now it's your turn, go ahead and create the ContactsManager program on your computer, then in the main method write the following:

1. Create a **ContactsManager** object called myContactsManager using the default constructor (we've already done so in the previous page)
2. Create a new **Contact** variable
⋅⋅* Set the ***name*** to a friend's name
⋅⋅* Set the ***phoneNumber*** field to their phone number
3. Call the ***addContact*** method in myContactsManager to add that contact
4. Repeat steps 2 and 3 for 4 more contacts
5. Search for a contact using the method ***searchContact*** and print out their phone number
