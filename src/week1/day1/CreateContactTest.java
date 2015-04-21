package week1.day1;

import week1.contactBook.Contact;

import java.util.Scanner;

public class CreateContactTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Contact contact = new Contact();
    System.out.println("Enter name");
//    contact.name = sc.next();
    System.out.println("Enter phone");
//    contact.phoneNumber = sc.next();
    System.out.println("Enter age");

    int tempAge = sc.nextInt();
    contact.setAge(tempAge);

    contact.printInfo();

    System.out.println(contact.getAge());
  }
}
