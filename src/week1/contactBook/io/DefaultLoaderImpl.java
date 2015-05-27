package week1.contactBook.io;

import week1.contactBook.Contact;
import week1.contactBook.ContactList;
import week6.io.FileHelper;

import java.io.File;
import java.io.IOException;

public class DefaultLoaderImpl implements ILoader {

  @Override
  public void load(ContactList contactList, File file) throws IOException {
    String text = FileHelper.read(file);
    String[] lines = text.split("\n");
    for (int i = 0; i < lines.length; i++) {
      String[] contactInfo = lines[i].split(",");
      Contact contact = new Contact(contactInfo[0], contactInfo[1]);
      if (!contactList.contains(contact)) {
        contactList.addContact(contact);
      }
    }
  }
}
