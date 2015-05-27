package week6.day2;

import week1.contactBook.Contact;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Contact contact = new Contact("Andrew", "093674841");
    String filePath = "/home/amakogon/TestFile";
    ObjectOutputStream objectOS
      = new ObjectOutputStream(new FileOutputStream(filePath));
    objectOS.writeObject(contact);

    ObjectInputStream objectIS
      = new ObjectInputStream(new FileInputStream(filePath));
    Contact read = (Contact) objectIS.readObject();
    System.out.println(read);
  }
}
