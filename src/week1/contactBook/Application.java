package week1.contactBook;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    ContactList contactList = new ContactList();
    addTestData(contactList);
    Scanner scanner = new Scanner(System.in);

    while (true) {
      printMenu();
      int choice = scanner.nextInt();
      doAction(contactList, choice);
    }
  }

  public static void doAction(ContactList contactList, int choice) {
    Scanner scanner = new Scanner(System.in);
    switch (choice) {
      case 1:
        Contact newContact = createContact();
        contactList.addContact(newContact);
        break;
      case 2:
        System.out.println("Enter contact name");
        Contact contact = contactList.find(scanner.next());
        if (contact == null) {
          System.out.println("not found");
        } else {
          contact.printInfo();
        }
        break;
      case 3:
        contactList.showContacts();
        break;
      case 4:
        contactList.showFirstFiveContacts();
        break;
      case 5:
        contactList.showLastFiveContacts();
        break;
      case 6:
        System.out.println("enter operator codes using space separator");
        String codes = scanner.nextLine();
        contactList.showByOperator(codes.split(" "));
        break;
      case 7:
        contactList.removeLastContact();
        break;
      case 8:
        contactList.showSortedContacts();
        break;
      default:
        break;
    }
  }

  public static void printMenu() {
    System.out.println("\n\n\nPlease choose item");
    System.out.println("1. Add contact");
    System.out.println("2. Find contact");
    System.out.println("3. Show all contacts");
    System.out.println("4. Show first five contacts");
    System.out.println("5. Show last five contacts");
    System.out.println("6. Show contacts by operator");
    System.out.println("7. Remove last contact");
    System.out.println("8. Show sorted contacts");
  }

  public static Contact createContact() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter name");
    String name = scanner.next();
    System.out.println("Enter phone number");
    String phoneNumber = scanner.next();

    return new Contact(name, phoneNumber);
  }

  public static void addTestData(ContactList contactList) {
    contactList.addContact(new Contact("Artem", "0932104231"));
    contactList.addContact(new Contact("Oleg", "0635431233"));
    contactList.addContact(new Contact("Igor", "0932105635"));
    contactList.addContact(new Contact("Anna", "0631534123"));
    contactList.addContact(new Contact("Petia", "0675434849"));
    contactList.addContact(new Contact("Victor", "0679732143"));
  }
}
