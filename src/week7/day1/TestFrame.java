package week7.day1;

import week1.contactBook.Contact;
import week1.contactBook.ContactList;

public class TestFrame {
  public static void main(String[] args) {
    ContactList contactList = new ContactList();
    addTestData(contactList);
    new ContactListFrame(contactList);
  }

  private static void addTestData(ContactList contactList) {
    contactList.addContact(new Contact("Artem", "0932104231"));
    contactList.addContact(new Contact("Oleg", "0635431233"));
    contactList.addContact(new Contact("Igor", "0932105635"));
    contactList.addContact(new Contact("Anna", "0631534123"));
    contactList.addContact(new Contact("Petia", "0675434849"));
    contactList.addContact(new Contact("Victor", "0679732143"));
  }
}
