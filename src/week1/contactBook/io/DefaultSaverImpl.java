package week1.contactBook.io;

import week1.contactBook.Contact;
import week1.contactBook.ContactList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class DefaultSaverImpl implements ISaver {

  @Override
  public void save(ContactList contactList, File file) throws IOException {
    BufferedWriter writer = new BufferedWriter(new PrintWriter(file));
    try {
      for (int i = 0; i < contactList.size(); i++) {
        Contact contact = contactList.getContacts()[i];
        String contactInfo = String.format("%s,%s\n"
          , contact.getName()
          , contact.getPhoneNumber());
        writer.write(contactInfo);
      }
    } finally {
      writer.close();
    }
  }
}
