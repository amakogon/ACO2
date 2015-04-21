package week1.contactBook;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    ContactList contactList = new ContactList();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      printMenu();
      int choice = scanner.nextInt();
      doAction(contactList, choice);
    }
  }

  public static void doAction(ContactList contactList, int choice) {
    if (choice == 1) {
      Contact newContact = createContact();
      contactList.addContact(newContact);
    } else if (choice == 3) {
      contactList.showContacts();
    }
  }

  public static void printMenu() {
    System.out.println("\n\n\nPlease choose item");
    System.out.println("1. Add contact");
    System.out.println("2. Find contact");
    System.out.println("3. Show all contacts");
  }

  public static Contact createContact() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter name");
    String name = scanner.next();
    System.out.println("Enter phone number");
    String phoneNumber = scanner.next();

    Contact newContact = new Contact(name, phoneNumber);
//    Contact newContact = new Contact();
//    newContact.setName(name);
//    newContact.setPhoneNumber(phoneNumber);
    return newContact;
  }
}
