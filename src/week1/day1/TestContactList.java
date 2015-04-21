package week1.day1;

import week1.contactBook.Contact;
import week1.contactBook.ContactList;

public class TestContactList {
  public static void main(String[] args) {
    ContactList contactList = new ContactList();
    Contact contact1 = new Contact("Andrew", "0932103213");
    contact1.printInfo();

    contactList.addContact(contact1);

    contactList.showContacts();

  }
}
