package week1.day1;

import week1.contactBook.Contact;

public class Main {
  public static void main(String[] args) {
    Contact contact1 = new Contact();
    System.out.println(contact1);
    System.out.println("Contact age = " + contact1.getAge());
//    contact1.age = 20;
//    contact1.name = "Petia";
//    contact1.phoneNumber = "0931234567";
//    System.out.println("Name = " + contact1.name
//                         + ", phone = " + contact1.phoneNumber
//                         + ",age = " + contact1.age
//    );

    Contact contact2 = new Contact();
//    contact2.age = 25;
//    contact2.name = "Vasia";
    contact2.setName("Vasia");
//    contact2.phoneNumber = "0633214567";
    contact2.setPhoneNumber("0633214567");
//    System.out.println("Name = " + contact2.name
//                         + ", phone = " + contact2.phoneNumber
//                         + ",age = " + contact2.age);
    contact2.printInfo();

    contact2 = contact1;

    contact2.printInfo();
    System.out.println("~~~~~~~~`");
    contact2 = null;
    contact1.printInfo();
    contact2.printInfo();




  }
}
