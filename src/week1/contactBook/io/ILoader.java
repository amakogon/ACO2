package week1.contactBook.io;

import week1.contactBook.ContactList;

import java.io.File;
import java.io.IOException;

public interface ILoader {

  void load(ContactList contactList, File file) throws IOException;
}
